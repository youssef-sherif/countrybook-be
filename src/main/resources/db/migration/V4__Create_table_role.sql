CREATE TABLE role (
   id TINYINT NOT NULL AUTO_INCREMENT,
   name VARCHAR(30) NOT NULL,
   PRIMARY KEY (id),
   UNIQUE KEY role_name (name)
);

INSERT INTO role VALUES(null, 'ADMIN');
INSERT INTO role VALUES(null, 'USER');