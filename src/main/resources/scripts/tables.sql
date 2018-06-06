/*drop table roles;
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
*/

--Test Data
insert into roles values(100,'Admin');
insert into roles values(101,'User');
--insert into users values(2000,'test_admin',100);
--insert into users values(2001,'test_user',101);
--insert into messages(id,message,user_id) values(MESSAGE_SEQUENCE.nextval,'test_message',2001);