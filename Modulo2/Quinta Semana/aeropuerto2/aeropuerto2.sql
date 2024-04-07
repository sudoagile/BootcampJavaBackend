create table if not exists aerolineas(
	id_aerolinea serial primary key,
	nombre varchar(100)
);

/*insert into aerolineas(nombre) values('Latam-Airlines');
insert into aerolineas(nombre) values('Sky-Airlines');

select * from aerolineas;

select nombre from aerolineas;*/

create table if not exists aviones (
	id_avion serial primary key,
	capacidad smallint,
	peso smallint,
	modelo varchar(100),

	id_aerolinea_fk integer,

	foreign key(id_aerolinea_fk)
		references aerolineas(id_aerolinea)
);

create table if not exists vuelos (
	id_vuelo serial primary key,
	fecha_salida date,
	fecha_llegada date,
	origen varchar(100),
	destino varchar(100),

	id_avion_fk integer,

	foreign key(id_avion_fk)
		references aviones(id_avion)
);

create table if not exists boletos(
	id_boleto serial primary key,
	asiento smallint
);

create table if not exists pasajeros(
	id_pasajero serial primary key,
	nombre varchar(100),
	apellido varchar(100)
);

create table if not exists pilotos(
	id_piloto serial primary key,
	nombre varchar(100),
	apellido varchar(100),
	estado boolean
);
create table if not exists vuelo_piloto();


alter table boletos add column id_pasajero_fk integer;

alter table boletos
	add constraint id_pasajero_fk
	foreign key(id_pasajero_fk)
	references pasajeros(id_pasajero);


alter table boletos add column id_vuelo_fk integer;

alter table boletos
	add constraint id_vuelos_fk
	foreign key(id_vuelo_fk)
	references vuelos(id_vuelo);

alter table vuelo_piloto add column id_vuelo_fk integer;
alter table vuelo_piloto add column id_piloto_fk integer;

alter table vuelo_piloto
	add constraint id_vuelos_fk
	foreign key(id_vuelo_fk)
	references vuelos(id_vuelo);

alter table vuelo_piloto
	add constraint id_pilotos_fk
	foreign key(id_piloto_fk)
	references pilotos(id_piloto);

alter table aerolineas
	alter column nombre
	set data type varchar(100);

select * from aerolineas;

-- Se insertan aerolineas, aviones, pasajeros, pilotos, vuelos, boletos, vuelos, vuelo_piloto
-- En ese orden ya que boleto dependia de otras

select nombre from aerolineas where nombre = 'Robel Inc';
select count(*) from aerolineas;
select nombre from aerolineas where nombre ilike 'R%';

--group by

select modelo from aviones group by modelo;

select modelo, count(*) from aviones group by modelo;  //Se le agrego una colunma
                                                       count que sirve para contarlos

select modelo, count(*) from aviones group by modelo order by count desc; /*Se le agrego
"order by count desc" para ordenar en forma descendente */

select modelo, count(*) from aviones group by modelo order by modelo asc; //Alfabetica

select id_aerolinea_fk, modelo from aviones a group by id_aerolinea_fk, modelo;

select id_aerolinea_fk, count(*)
from aviones group by id_aerolinea_fk order by count desc;

select aviones.*, aerolineas.nombre
from aviones join aerolineas
    on aviones.id_aerolinea_fk = aerolineas.id_aerolinea;

select aviones.*, aerolineas.*
from aviones join aerolineas
    on aviones.id_aerolinea_fk = aerolineas.id_aerolinea;

select * from aviones;

select vuelos.id_vuelo,vuelos.origen, vuelos.destino, aviones.id_avion
from vuelos join aviones
    on id_avion_fk = id_avion;

-- seleccionar vuelos con sus aviones

select * from vuelos v join aviones a on v.id_avion_fk = a.id_avion;

-- seleccioonar vuelos con sus aviones y sus repspectivas aerolineas

select * from vuelos v join aviones join aerolineas on v.id_avion_fk = a.id_avion, on id_aerolinea_fk = id_aerolinea;

SELECT vuelos.*, aviones.*, aerolineas.*
FROM vuelos
JOIN aviones ON vuelos.id_avion_fk = aviones.id_avion
JOIN aerolineas ON aviones.id_aerolinea_fk = aerolineas.id_aerolinea;

--Reducida
SELECT *
FROM vuelos v
JOIN aviones a ON v.id_avion_fk = a.id_avion
JOIN aerolineas ar ON ar.id_aerolinea = id_aerolinea_fk;
