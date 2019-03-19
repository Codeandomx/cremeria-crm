create table users(
	id_user int auto_increment,
    user_name varchar(100) unique,
    name varchar(100) NOT NULL,
    lastname varchar(100) NOT NULL,
    pass varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    id_role int,
    PRIMARY KEY (id_user),
    index(id_role),
    FOREIGN KEY (id_role) references roles(id_role)
) engine = innodb;