USE mysql_shiyan;

SELECT id, name, dpt_name, people_num, count_project
FROM employee
JOIN (
	SELECT dpt_name, people_num, count(proj_name) as count_project
	FROM department JOIN project
	ON department.dpt_name = project.of_dpt
	GROUP BY dpt_name
) middle
ON employee.in_dpt = middle.dpt_name
ORDER BY id;
