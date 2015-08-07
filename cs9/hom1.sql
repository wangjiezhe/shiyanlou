CREATE DATABASE library;

USE library;
CREATE TABLE book
(
	id INT(10),
	name CHAR(50),
	price FLOAT(10),
	category CHAR(20),
	description VARCHAR(1000)
);
CREATE TABLE reader
(
	id INT(10),
	name CHAR(20),
	age INT(3),
	tele INT(20)
);

INSERT INTO book VALUES
(1, 'Python Intro', 37.5, 'Computer',
	'Introduction to Python for new learners');
INSERT INTO book(id, name, price) VALUES
(2, 'The World', 10);
INSERT INTO book(id, name, category) VALUES
(3, 'The Little Schemer', 'Computer');

INSERT INTO reader VALUES
(1, 'Tom', 19, 1234567890);
INSERT INTO reader(id, name, age) VALUES
(2, 'Rose', 30);
INSERT INTO reader(id, name) VALUES
(3, 'Robin');

SHOW TABLES;
SELECT * FROM book;
SELECT * FROM reader;
