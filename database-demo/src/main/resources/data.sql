create table person (
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10001, 'Ranga', 'Hyderabad', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10002, 'Pomba', 'New York', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10003, 'Timba', 'Philadelphia', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10004, 'Anuba', 'Boston', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES (10005, 'Matuba', 'Masachusets', sysdate());