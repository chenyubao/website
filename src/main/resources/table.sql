create database 'website';
use 'website';

CREATE TABLE 'category'(
  id int not null,
  name VARCHAR(30) not null,
  isParent INT default 0,
  parentId INT,
  imageURL VARCHAR(150),
  PRIMARY KEY (id)
);

create TABLE 'product'(
  id int not NULL,
  name VARCHAR(50) NOT NULL,
  categoryId int not null,
  imageURL VARCHAR(150),
  PRIMARY KEY (id)
);

CREATE TABLE 'productProperty'(
   id INT NOT NULL ,
   productId int,
   name VARCHAR(150),
   value TEXT,
   PRIMARY KEY (id)
);

CREATE TABLE 'menu'(
  id INT NOT NULL,
  name VARCHAR(30),
  parentId INT,
  position INT,
  image VARCHAR(150),
  PRIMARY KEY (id)
);