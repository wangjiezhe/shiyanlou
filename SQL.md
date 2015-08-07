SQL 语言简介
==============================


一、 查看
--------------------

### 查看数据库

	SHOW DATABASES;

### 连接数据库

	USE <database>

### 查看表

	SHOW TABLES;


二、 新数据库
--------------------

### 新建数据库

	CREATE DATABASE	<database>;

### 新建数据表

	CREATE TABLE <table>
	(
	<colomn 1> <type>(<length>),
	<colomn 2> <type>(<length>),
	<colomn 3> <type>(<length>)
	)

### 常见数据类型

* 数字： `INT`, `FLOAT`, `DOUBLE`,
* 枚举： `ENUM`, `SET`,
* 时间： `DATE`, `TIME`, `YEAR`,
* 字符串： `CHAR`, `VARCHAR`, `TEXT`

### 查看所有数据

	SELECT * FROM <table>;

### 插入数据

	INSERT INTO <table> VALUES(<all values seperated by comma>);

	INSERT INTO <table>(<col 1>, <col 2>, <col 3>) VALUES(<value 1>, <value 2>, <value3>);


三、 约束
--------------------

| 约束类型： | 主键 | 默认值 | 唯一 | 外键 | 非空 |
|:-----------|:-----|:-------|:-----|:-----|:-----|
| 关键字： | PRIMARY KEY | DEFAULT | UNIQUE | FOREIGN KEY | NOT NULL |


例子参见 [MySQL-03-01.sql](cs9/SQL3/MySQL-03-01.sql)


四、 SELECT
--------------------

### 基本格式

	SELECT <colomns seperated by comma> FROM <table> WHERE <condition>;

### 条件

* 数学符号： `-`, `>`, `<`, `>=`, `<=`
* 逻辑关系： `AND`, `OR`
* 在 xxx 和 yyy 之间，并包含边界： `BETWEEN <xxx> AND <yyy>`
* 在与不再： `IN`, `NOT IN`
* 通配符： `LIKE`
	+ 单个字符： `_`
	+ 不定个字符： `%`
* 排序：
	+ 升序（默认）： `ORDER BY <col>`
	+ 降序： `ORDER BY <col> DESC`
* 分组： `GROUP BY <col>`

### 内置函数

| 函数名： | COUNT | SUM | AVG | MAX | MIN |
|:---------|:------|:----|:----|:----|:----|
| 作用： | 计数 | 求和 | 平均值 | 最大值 | 最小值 |

> 可以用 `AS` 给值重命名

### 子查询

	SELECT <colomns seperated by comma> FROM <table 1>
	WHERE <col 1> IN
	(SELECT <col 2> FROM <table 2> WHERE <condition>);

> 子查询可以扩展到3层、4层或更多层

### 连接查询

隐式连接

	SELECT <colomns seperated by comma>
	FROM <table 1>, <table 2>
	WHERE <table 1>.<col 1> = <table 2>.<col 2>
	<other conditions>

显式连接

	SELECT <colomns seperated by comma>
	FROM <table 1> JOIN <table 2>
	ON <table 1>.<col 1> = <table 2>.<col 2>
	<other conditions>

三表连接的例子见 [hom2.sql](cs9/hom2.sql)


五、 修改和删除
--------------------

### 对数据库的修改

删除数据库

	DROP DATABASE <database>;

### 对表的修改

重命名表

	RENAME TABLE <orig> TO <dest>;

	ALTER TABLE <orig> RENAME <dest>;

	ALTER TABLE <orig> RENAME TO <dest>;

删除表

	DROP TABLE <table>;

### 对表结构（i.e.列）的修改

增加列

	ALTER TABLE <table> ADD COLUMN <col> <type> <constraint>;

	ALTER TABLE <table> ADD <col> <type> <constraint>;

	ALTER TABLE <table> ADD <col> <type> <constraint> AFTER <orig col>;

	ALTER TABLE <table> ADD <col> <type> <constraint> FIRST;

删除列

	ALTER TABLE <table> DROP COLUMN <col>;

	ALTER TABLE <table> DROP <col>;

重命名列

	ALTER TABLE <table> CHANGE <orig> <dest> <type> <constraint>;

> “数据类型”(<type>) 不能省略

改变数据类型

	ALTER TABLE <table> MODIFY <col> <new type>;

> 修改数据类型可能导致数据丢失

### 对表的内容的修改

修改表中的某个值

	UPDATE <table> SET <col 1>=<value 1>, <col 2>=<value 2> WHERE <condition>;

> 一定要有 WHERE 条件，否则会修改整个表

删除一行记录

	DELETE FROM <table> WHERE <condition>;

> 一定要有 WHERE 条件，否则会删除所有数据


六、 其它
--------------------

### 索引

	ALTER TABLE <table> ADD INDEX <index> (<col>);

	CREATE INDEX <index> FROM <table> (<col>);

### 视图

	CREATE VIEW <view>(<col a>, <col b>, <col c>)
	AS SELECT <col 1>, <col 2>, <col 3> FROM <table>;

> 视图是虚拟的表

### 导入

	LOAD DATA INFILE '<file path>' INTO TABLE <table>;

### 导出

	SELECT <colomns seperated by comma, or star(*) to select all>
	INTO OUTFILE '<file path>' FROM <table>;

### 备份

	mysqldump -u root <database> > <backup.sql>  # 备份整个数据库

	mysqldump -u root <database> <table> > <backup.sql>  # 备份整个表

### 恢复

	mysql -u root
		SOURCE <backup.sql>;

或者

	mysql -u root
		CREATE DATABASE <database>;
		exit
	mysql -u root < <backup.sql>

