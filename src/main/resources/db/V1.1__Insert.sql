insert into departments(id, full_dep_name) values(1, 'First Dep');
insert into departments(id, full_dep_name) values(2, 'Second Dep');


insert into positions(id, full_name) values(1, 'developer');
insert into positions(id, full_name) values(2, 'accountant');

INSERT INTO employees(first_name, last_name, department_id, position_id)
VALUES ('James', 'Jack', 1, 1);
INSERT INTO employees(first_name, last_name, department_id, position_id)
VALUES ('Ashley', 'Lang', 2, 2);
