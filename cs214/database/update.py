import sqlite3

conn = sqlite3.connect('test.db')
c = conn.cursor()

c.execute('UPDATE book SET price=? WHERE id=?', (1000, 1))
c.execute('DELETE FROM book WHERE id=2')

# c.execute('DROP TABEL book')

conn.commit()
conn.close()
