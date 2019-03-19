create table products(
	id_product int auto_increment,
    name varchar(100) NOT NULL,
    img varchar(250) NOT NULL,
    description text NOT NULL,
    price decimal(6,2) NOT NULL,
    id_category int,
    primary key (id_product),
    index (id_category),
    foreign key (id_category) references categories(id_category)
)engine = innodb;