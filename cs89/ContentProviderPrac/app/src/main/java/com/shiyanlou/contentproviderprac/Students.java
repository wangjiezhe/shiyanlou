package com.shiyanlou.contentproviderprac;

import android.net.Uri;
import android.provider.BaseColumns;

public final class Students {

    public static final String AUTHORITY = "com.shiyanlou.provider.Students";

    public static final class Student implements BaseColumns {

        public static final String _ID = "_id";
        public static final String STUDENT = "student";
        public static final String INFORMATION = "info";

        public static final Uri STUDENTS_CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/students");
        public static final Uri STUDENT_CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/student");
    }
}
