create table productscart(
	id_productcart int auto_increment,
    quantity int NOT NULL,
    id_cart int,
    id_product int,
    primary key (id_productcart),
    index(id_cart),
    index(id_product),
    foreign key (id_cart) references carts(id_cart),
    foreign key (id_product) references products(id_product)
)engine = innodb;