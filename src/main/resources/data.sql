INSERT INTO tb_user (email, password) VALUES ('ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (email, password) VALUES ('bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_department(name) VALUES ('Sales');
INSERT INTO tb_department(name) VALUES ('Management');
INSERT INTO tb_department(name) VALUES ('Training');

INSERT INTO tb_employee(name, email, department_id) VALUES ('Maria', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Ana', 'ana@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Bob', 'bob@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Marco', 'marco@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Alex', 'alex@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Claudia', 'claudia@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Rodrigo', 'rodrigo@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Elisa', 'elisa@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Lucas', 'lucas@gmail.com', 3);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Rafael', 'rafael@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Tiago', 'tiago@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Andressa', 'andressa@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Meire', 'meire@gmail.com', 3);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Carol', 'carol@gmail.com', 1);
