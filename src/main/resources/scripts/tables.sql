drop table roles;
drop table messages cascade;
drop table users cascade;

CREATE TABLE roles
(
  id integer AUTO_INCREMENT,
  name varchar(255),
  PRIMARY KEY (id)
);

CREATE TABLE users
(
  id integer AUTO_INCREMENT,
  name varchar(255) not null,
  role_id integer,
  primary key(id),
  FOREIGN KEY (role_id) REFERENCES roles(id)
);
CREATE TABLE messages
(
  id integer AUTO_INCREMENT,
  user_id integer,
  message CLOB,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);


--Test Data
insert into roles values(1,'Admin');
insert into roles values(2,'User');
insert into users values(12,'test_admin',1);
insert into users values(23,'test_user',2);
insert into messages values(10,2,'test_message');
