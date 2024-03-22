DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INTEGER unsigned AUTO_INCREMENT,
  last_name NVARCHAR(50) NOT NULL,
  first_name NVARCHAR(50) NOT NULL,
  birthday DATE NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO users (last_name, first_name, birthday) VALUES
("福田","圭","1936-08-01"),
("宇野","香織","1986-07-22"),
("鈴木","佳史","1964-10-05"),
("長谷川","晃義","1939-01-28"),
("空","敏宏","1950-04-08"),
("上田","幸大","1927-12-22"),
("増田","恵美","1935-11-10"),
("戸塚","康隆","1966-04-05"),
("原田","大造","2002-04-03"),
("川島","順子","1952-08-03");
