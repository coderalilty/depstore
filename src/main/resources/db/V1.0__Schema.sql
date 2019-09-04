CREATE TABLE departments(
                            id int auto_increment primary key,
                            full_dep_name VARCHAR(512) NOT NULL
);
CREATE TABLE positions(
                          id int auto_increment PRIMARY KEY,
                          full_name VARCHAR(512) NOT NULL
);
CREATE TABLE employees(
                          id int auto_increment PRIMARY KEY,
                          first_name VARCHAR(512) NOT NULL,
                          last_name VARCHAR(512) NOT NULL,
                          department_id int NOT NULL,
                          position_id int NOT NULL
);

ALTER TABLE employees
    ADD FOREIGN KEY (department_id)
        REFERENCES departments (id);
ALTER TABLE employees
    ADD FOREIGN KEY (position_id)
        REFERENCES positions (id);

