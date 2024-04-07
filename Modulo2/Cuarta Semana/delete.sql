-- on delete cascade "Borro el pricipal y se borran los otros"
-- on delete set null
-- on delete no action "Es por defecto", primero hay que borrar los otros para borra el pricipal
-- on delete set restrict "Hace basicamneto lo mismo a no action"

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
	id_usuario integer references usuarios(id_usuario) on delete cascade /*Si se borra un usuario se borran todos
	                                                                       sus comentarios*/
);

create table if not exists compras (
	id_compra serial primary key,
	id_usuario integer references usuarios(id_usuario) on delete restrict,
	id_producto integer references productos(id_producto) on delete set null, /*Si se borra el prodcuto la venta no se
	                                                                            borra*/
	cantidad integer not null
)
insert into productos(nombre, precio) values('Tablet', 2000);
insert into productos(nombre, precio) values('Celular', 1500);
insert into productos(nombre, precio) values('Microfono', 500);
insert into productos(nombre, precio) values('Teclado', 400);
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

-- on delete set null

delete from productos where id_producto=6;

insert into comentarios(contenido, id_producto, id_usuario) 
	values('muy buen producto', 3, 4);
insert into comentarios(contenido, id_producto, id_usuario) 
	values('regular', 4, 5);

select nombre from productos;
select username from usuarios;
select nombre from productos;
select cantidad from ventas;
select * from productos;

select * from  comentarios;
select contenido from  comentarios;

-- on delete cascade

delete from productos where id_producto = 2;

select * from comentarios;

-- on delete restrict

insert into compras(id_usuario, id_producto, cantidad)
	values(1, 3, 100);

insert into compras(id_usuario, id_producto, cantidad)
	values(2, 3, 40);


select * from compras;
select * from productos;

delete from productos where id_producto=3;
delete from usuarios where id_usuario=1; -- Este da error porque esta ligado a compras
--Antes de ejecutar el anterior tendria q borar una compra donde le usuario=1
 delete from compras where id_usuario=1;
delete from usuarios where id_usuario=1; -- Ahora si funciono

after name comentarios rename column -- revisar


