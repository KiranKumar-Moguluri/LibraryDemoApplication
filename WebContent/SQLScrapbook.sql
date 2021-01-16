show tables;
create table Library(RollNum varchar(10) primary key,
					Name varchar(20),
					Branch varchar(5),
					Email varchar(25),
					Password varchar(10));
					
select * from Library;


create table VIEWBOOK(BookName varchar(30)NULL,
					  BookId INT(10) PRIMARY KEY NOT NULL,
					  BookAuthor varchar(20) NULL);

Select * from ViewBook;

insert into viewbook values("Kiran Kumar Loves LPU",1,"Great Prasad");
insert into viewbook values("Kiran Kumar Loves Shama",2,"Great Akhil");
insert into viewbook values("Kiran Kumar Loves Noida",3,"Great Girish");
insert into viewbook values("Kiran Kumar Loves DIVYA",4,"Great Mahesh");
insert into viewbook values("Kiran Kumar Loves Monisha",5,"Great Chandhu");
insert into viewbook(bookid) values(456);

delete from viewbook where bookid=12;

CREATE TABLE RESERVE(BOOKNAME VARCHAR(30) NOT NULL,
					 STUDENTNAME VARCHAR(20) NOT NULL,
					 STUDENTROLL VARCHAR(10) NOT NULL);

SELECT * FROM RESERVE;

DELETE FROM RESERVE WHERE STUDENTNAME='OCD';

CREATE TABLE LIBRARIAN(USERNAME VARCHAR(30) NOT NULL,
					   PASSWORD VARCHAR(20) NOT NULL);
					   show tables;
	
insert into Librarian values("Bittu","abc");

select * from librarian;