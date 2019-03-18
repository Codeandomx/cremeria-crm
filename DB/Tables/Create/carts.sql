create table carts(
	id_cart int auto_increment,
    date datetime default now(),
    id_user int,
    primary key (id_cart),
    index(id_user),
    foreign key (id_user) references users(id_user)
)engine = innodb;