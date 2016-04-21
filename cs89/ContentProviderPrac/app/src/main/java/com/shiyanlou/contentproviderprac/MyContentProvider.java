package com.shiyanlou.contentproviderprac;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public class MyContentProvider extends ContentProvider {

    public static UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);

    private static final int STUDENTS = 1;
    private static final int STUDENT = 2;

    private MyDatabaseHelper dbOpenHelper;

    static {
        matcher.addURI(Students.AUTHORITY, "students", STUDENTS);
        matcher.addURI(Students.AUTHORITY, "student/#", STUDENT);
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        SQLiteDatabase db = dbOpenHelper.getReadableDatabase();
        int num = 0;

        switch (matcher.match(uri)) {
            case STUDENTS:
                num = db.delete("students", selection, selectionArgs);
                break;
            case STUDENT:
                long id = ContentUris.parseId(uri);
                String selectionClause = Students.Student._ID + "=" + id;
                if (selection != null && !"".equals(selection)) {
                    selectionClause = selectionClause + "and" + selection;
                }
                num = db.delete("students", selectionClause, selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("Unknown Uri:" + uri);
        }

        getContext().getContentResolver().notifyChange(uri, null);
        return num;
    }

    @Override
    public String getType(Uri uri) {
        switch (matcher.match(uri)) {
            case STUDENTS:
                return "vnd.android.cursor.dir/com.shiyanlou.students";
            case STUDENT:
                return "vnd.android.cursor.item/com.shiyanlou.student";
            default:
                throw new IllegalArgumentException("Unknown Uri:" + uri);
        }
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        SQLiteDatabase db = dbOpenHelper.getReadableDatabase();
        switch (matcher.match(uri)) {
            case STUDENTS:
                long rowId = db.insert("students", Students.Student._ID, values);
                if (rowId > 0) {
                    Uri studentUri = ContentUris.withAppendedId(uri, rowId);
                    getContext().getContentResolver().notifyChange(studentUri, null);
                    return studentUri;
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown Uri:" + uri);
        }
        return null;
    }

    @Override
    public boolean onCreate() {
        dbOpenHelper = new MyDatabaseHelper(this.getContext(), "myStudents.db", 1);
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        SQLiteDatabase db = dbOpenHelper.getReadableDatabase();
        switch (matcher.match(uri)) {
            case STUDENTS:
                return db.query("students", projection, selection, selectionArgs,
                        null, null, sortOrder);
            case STUDENT:
                long id = ContentUris.parseId(uri);

                String selectionClause = Students.Student._ID + "=" + id;

                if (selection != null && !"".equals(selection)) {
                    selectionClause = selectionClause + "and" + selection;
                }

                return db.query("students", projection, selectionClause, selectionArgs,
                        null, null, sortOrder);
            default:
                throw new IllegalArgumentException("Unknonw Uri:" + uri);
        }
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        SQLiteDatabase db = dbOpenHelper.getWritableDatabase();

        int num = 0;
        switch (matcher.match(uri)) {
            case STUDENTS:
                num = db.update("students", values, selection, selectionArgs);
                break;
            case STUDENT:
                long id = ContentUris.parseId(uri);
                String selectionClause = Students.Student._ID + "=" + id;
                if (selection != null && !"".equals(selection)) {
                    selectionClause = selectionClause + "and" + selection;
                }
                num = db.update("students", values, selectionClause, selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("Unknown Uri:" + uri);
        }

        getContext().getContentResolver().notifyChange(uri, null);
        return num;
    }
}
