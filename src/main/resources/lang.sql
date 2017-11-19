CREATE TABLE 't_user'(
	'id' int(11) NOT NULL AOTO_INCREMENT,
	'username' varchar(45) DEFAULT NULL,
	'age' int(11) DEFAULT NULL,
	'address' varchar(45) DEFAULT NULL,
	PRIMARY KEY ('id')
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT=utf8;


INSERT INTO t_user(username,age,address) VALUES ('实训',18,'武汉');
INSERT INTO t_user(username,age,address) VALUES ('李四',18,'黄州');
