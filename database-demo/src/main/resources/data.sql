/* Commenting create table since hibernate takes care of schema creation */
/*
create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);
*/

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) 
VALUES(10001, 'Azad', 'Trivandrum', sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) 
VALUES(10002, 'Abi', 'Chennai', sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) 
VALUES(10003, 'Ruhan', 'Sydney', sysdate());