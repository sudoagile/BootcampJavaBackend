-- on delete cascade
-- on delete set null
-- on delete no action
-- on delete set restrict

create table if not exists productos(
	id_producto serial primary key,
	nombre varchar,
	precio float not null
);
create table if not exists ventas(
	id_venta serial primary key,
	cantidad integer,
	id_producto integer references productos(id_producto) on delete set null
);

create table if not exists usuarios (
	id_usuario serial primary key,
	username varchar
);
create table if not exists comentarios  (
	id_comentario serial primary key,
	contenido text not null,
	id_producto integer references productos(id_producto) on delete cascade,
	id_usuario integer references usuarios(id_usuario) on delete cascade
);

create table if not exists compras (
	id_compra serial primary key,
	id_usuario integer references usuarios(id_usuario) on delete restrict,
	id_producto integer references productos(id_producto) on delete set null,
	cantidad integer not null
)
insert into productos(nombre, precio) values('Tablet', 2000);
insert into productos(nombre, precio) values('Celular', 1500);
insert into productos(nombre, precio) values('Microfono', 500);
select * from productos;
insert into usuarios(username) values('george04');
insert into usuarios(username) values('juan29');
insert into usuarios(username) values('jose93');
select * from usuarios;
insert into ventas(cantidad, id_producto) values(3, 1);
insert into ventas(cantidad, id_producto) values(2, 3);
insert into ventas(cantidad, id_producto) values(5, 2);
select * from ventas;
select * from comentarios;

delete from productos where id_producto=6;

insert into comentarios(contenido, id_producto, id_usuario) 
	values('muy buen producto', 2, 3);
insert into comentarios(contenido, id_producto, id_usuario) 
	values('regular', 2, 1);


