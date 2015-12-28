create table Actividad
(
	ActId bigint not null auto_increment,
	ActDescripcion varchar(500) not null,
	ActFechaInicio timestamp not null default current_timestamp,
	ActFechaFin timestamp null default null,
	ActEstado bool not null default 1,
	primary key(ActId)
);