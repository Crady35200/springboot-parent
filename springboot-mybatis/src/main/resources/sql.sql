create table crady.t_user
(
	id int auto_increment comment 'ID主键'
		primary key,
	name varchar(20) not null comment '用户名',
	password varchar(20) not null comment '密码',
	age int null comment '年龄',
	sex char null comment '性别',
);