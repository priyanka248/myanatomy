CREATE TABLE User (
 id bigint UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 password varchar(255),
 user_id varchar(255),
 is_admin boolean not null
);