insert into clientes(nombre,apellido,email,create_at) values ('andres','guzman','profesor@loayza.com','2021-04-04');
insert into clientes(nombre,apellido,email,create_at) values ('pedro','suarez','conserje@loayza.com','2020-03-02');

insert into `usuarios`(username,password,enabled) values ('admin','$2a$10$zUSOzkiG1h4maVr5fbmDmuoz50Ua0dIwYW.vi4PHrgq4DiEedQ.aS',1);
insert into `usuarios`(username,password,enabled) values ('andres','$2a$10$Vba8UVFZukdD64zk.fQa6.nWA8zMpUMVZogTgEiXnGrn9m9yysmYm',1);

insert into `roles`(nombre) values ('ROLE_USER');
insert into `roles`(nombre) values ('ROLE_ADMIN');

insert into `users_roles` (usuario_id,role_id) values (1,1);
insert into `users_roles` (usuario_id,role_id) values (2,2);
insert into `users_roles` (usuario_id,role_id) values (2,1);