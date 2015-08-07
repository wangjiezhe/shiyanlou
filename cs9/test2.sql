CREATE DATABASE mysql_shiyan;
SHOW DATABASES;

USE mysql_shiyan;
SHOW TABLES;

CREATE TABLE employee (id INT(10), name CHAR(20), phone INT(12));
CREATE TABLE department
(
dpt_name CHAR(20),
dpt_phone INT(12)
);
SHOW TABLES;

SELECT * FROM employee;

INSERT INTO employee(id, name, phone) VALUES(01, 'Tom', 110110110);
INSERT INTO employee VALUES(02, 'Jack', 119119);
INSERT INTO employee(id, name) VALUES(03, 'Rose');
SELECT * FROM employee;