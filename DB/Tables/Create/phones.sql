create table phones(
	id_phone int auto_increment,
    phone int NOT NULL,
    id_type int,
    id_user int,
    PRIMARY KEY (id_phone),
    index(id_type),
    index(id_user),
    foreign key(id_type) references types(id_type),
    foreign key(id_user) references users(id_user)
)engine = innodb;