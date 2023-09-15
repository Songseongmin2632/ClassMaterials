package c230913;

public class Oracle {

/*
    
C:\Users\KGA>sqlplus

����ڸ� �Է�: java
��й�ȣ �Է�:
������ ������ �α��� �ð�: ȭ 9��  12 2023 13:40:45 +09:00

������ ���ӵ�:
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0

SQL> exit
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0���� �и��Ǿ����ϴ�.

C:\Users\KGA>sqlplus

SQL*Plus: Release 21.0.0.0.0 - Production on �� 9�� 13 10:08:08 2023
Version 21.3.0.0.0

Copyright (c) 1982, 2021, Oracle.  All rights reserved.

����ڸ� �Է�: java
��й�ȣ �Է�:
������ ������ �α��� �ð�: �� 9��  13 2023 10:07:49 +09:00

������ ���ӵ�:
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0

SQL> create table test(
  2  id number(10,0),
  3  name varchar2(10),
  4  score number(10,5)
  5  );

���̺��� �����Ǿ����ϴ�.

SQL> insert into test (id) values (1);

1 ���� ���� ����������ϴ�.

SQL> select id from test;

        ID
----------
         1

SQL> select * from test;

        ID NAME                      SCORE
---------- -------------------- ----------
         1

SQL> commit;

Ŀ���� �Ϸ�Ǿ����ϴ�.

SQL> update test set name= '������',score=90 where id = 1;

1 ���� ������Ʈ�Ǿ����ϴ�.

SQL> commit;

Ŀ���� �Ϸ�Ǿ����ϴ�.

SQL> select * from test;

        ID NAME                      SCORE
---------- -------------------- ----------
         1 ������                       90

Oracle SQL DEVELOPER������ �����Ҽ��ִ�.
�ؿ��� SQL DEVELOPER���� �����ϰ� cmd�� �߰��� ����

SQL> select * from test;

        ID NAME                      SCORE
---------- -------------------- ----------
         2 �����                       95
         1 ������                       90

SQL> delete from test where id = 1;

1 ���� �����Ǿ����ϴ�.

SQL> commit;

Ŀ���� �Ϸ�Ǿ����ϴ�.

SQL> select * from test;

        ID NAME                      SCORE
---------- -------------------- ----------
         2 �����                       95

SQL>  create table test2(
  2   id number(10,0) CONSTRAINT pk_id PRIMARY KEY,
  3   name varchar2(10) NOT NULL,
  4   score number(10,5) DEFAULT 0,
  5   address varchar2(20)
  6   );

���̺��� �����Ǿ����ϴ�.

SQL> insert into test2 values(1, '������', 78, '����� ������');

1 ���� ���� ����������ϴ�.

SQL> commit;

Ŀ���� �Ϸ�Ǿ����ϴ�.

SQL> select * from test2;

        ID NAME                      SCORE
---------- -------------------- ----------
ADDRESS
----------------------------------------
         1 ������                       78
����� ������



SQL> insert into test2 values(4, '�����', 27, '�ٹ�');

1 ���� ���� ����������ϴ�.

SQL> commit;

Ŀ���� �Ϸ�Ǿ����ϴ�.

SQL> exit
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0���� �и��Ǿ����ϴ�.



C:\Users\KGA>sqlplus

SQL*Plus: Release 21.0.0.0.0 - Production on �� 9�� 13 12:04:04 2023
Version 21.3.0.0.0

Copyright (c) 1982, 2021, Oracle.  All rights reserved.

����ڸ� �Է�: java
��й�ȣ �Է�:
������ ������ �α��� �ð�: �� 9��  13 2023 11:30:47 +09:00

������ ���ӵ�:
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0


SQL> create table student(
  2  student_id number(8,0) constraint pk_student_id PRIMARY KEY,
  3  name varchar2(10),
  4  nickname varchar2(10),
  5  password varchar2(10),
  6  age number(2),
  7  git_address varchar2(100)
  8  );

���̺��� �����Ǿ����ϴ�.

SQL> drop table student;

���̺��� �����Ǿ����ϴ�.

SQL> create table student(
  2  student_id number(8,0) constraint pk_student_id PRIMARY KEY,
  3  name varchar2(10),
  4  nickname varchar2(10),
  5  password varchar2(10),
  6  age number(2),
  7  git_address varchar2(100)
  8  );

���̺��� �����Ǿ����ϴ�.

SQL> insert into student values(1,'�赿��','KDS','qwer',29,'https://github.com/KDS01');

1 ���� ���� ����������ϴ�.

SQL> insert into student values(2,'�̹α�','qq752','1234',23,'https://github.com/LEEMINGYU28/Java4.git');

1 ���� ���� ����������ϴ�.

SQL> insert into student values(3, '�ǿ���', 'oooonx', 'may', 22,'https://github.com/KWWWJ/just1.git');

1 ���� ���� ����������ϴ�.

SQL> insert into student values(4, '������', 'pjw', 'qwer', 27, 'https://github.com/pjw222');

1 ���� ���� ����������ϴ�.

SQL> insert into student values(5,'�ѻ���','hsy','qwer1234',37,'https://github.com/Natseol');

1 ���� ���� ����������ϴ�.

SQL> insert into student values(6,'������','TLM','486',27,'https://github.com/mabiTLM/Java4');

1 ���� ���� ����������ϴ�.

SQL> insert into student values(7,'�賲��','knk','1234',27,'https://github.com/LiamKim-0218/HomeWork2');

1 ���� ���� ����������ϴ�.

SQL> insert into student values(8,'������','LJH','3232',32,'https://github.com/Juhan008/java-D');

1 ���� ���� ����������ϴ�.

SQL> commit;

Ŀ���� �Ϸ�Ǿ����ϴ�.

SQL> select * from student where name like '��%';

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         1 �赿��               KDS                  qwer
        29
https://github.com/KDS01

         7 �賲��               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------




SQL> select * from student order by age asc;

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 �ǿ���               oooonx               may
        22
https://github.com/KWWWJ/just1.git

         2 �̹α�               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         4 ������               pjw                  qwer
        27
https://github.com/pjw222

         7 �賲��               knk                  1234
        27

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/LiamKim-0218/HomeWork2

         6 ������               TLM                  486
        27
https://github.com/mabiTLM/Java4

         1 �赿��               KDS                  qwer

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        29
https://github.com/KDS01

         8 ������               LJH                  3232
        32
https://github.com/Juhan008/java-D


STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 �ѻ���               hsy                  qwer1234
        37
https://github.com/Natseol


8 ���� ���õǾ����ϴ�.



SQL> select * from student order by age desc;

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 �ѻ���               hsy                  qwer1234
        37
https://github.com/Natseol

         8 ������               LJH                  3232
        32
https://github.com/Juhan008/java-D

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         1 �赿��               KDS                  qwer
        29
https://github.com/KDS01

         4 ������               pjw                  qwer
        27

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/pjw222

         7 �賲��               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

         6 ������               TLM                  486

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        27
https://github.com/mabiTLM/Java4

         2 �̹α�               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git


STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 �ǿ���               oooonx               may
        22
https://github.com/KWWWJ/just1.git


8 ���� ���õǾ����ϴ�.



SQL> select * from student order by name asc;

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 �ǿ���               oooonx               may
        22
https://github.com/KWWWJ/just1.git

         7 �賲��               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         1 �赿��               KDS                  qwer
        29
https://github.com/KDS01

         4 ������               pjw                  qwer
        27

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/pjw222

         2 �̹α�               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git

         8 ������               LJH                  3232

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        32
https://github.com/Juhan008/java-D

         6 ������               TLM                  486
        27
https://github.com/mabiTLM/Java4


STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 �ѻ���               hsy                  qwer1234
        37
https://github.com/Natseol


8 ���� ���õǾ����ϴ�.



SQL> create table hobby(
  2  hobby_id number(2,0) constraint pk_hobby_id PRIMARY KEY,
  3  hobby_name varchar2(20),
  4  hobby_explain varchar2(200),
  5  created_at timestamp default to_char(sysdate,'yyyy/mm/dd hh:mi:ss'),
  6  average_time  varchar2(12),
  7  location varchar2(100)
  8  );

���̺��� �����Ǿ����ϴ�.

SQL> insert into hobby (hobby_id, hobby_name, hobby_explain,average_time,location) values(1,'�ｺ','����ҿ� ����Ʈ Ʈ���̴��� �ⱸ�� Ȱ���Ͽ� �ð��� ���� �� �ִ� ��','2�ð�','õȣ');

1 ���� ���� ����������ϴ�.

SQL> commit;

Ŀ���� �Ϸ�Ǿ����ϴ�.



drop table student;
drop table hobby;


create table student(
  2  id number(8,0) constraint pk_student_id PRIMARY KEY,
  3  name varchar2(10) not null,
  4  nickname varchar2(10) not null unique,
  5  password varchar2(10) not null,
  6  age number(3),
  7  git_address varchar2(100)
  8  );


insert into student values(1,'�赿��','KDS','qwer',29,'https://github.com/KDS01');
insert into student values(2,'�̹α�','qq752','1234',23,'https://github.com/LEEMINGYU28/Java4.git');
insert into student values(3, '�ǿ���', 'oooonx', 'may', 22,'https://github.com/KWWWJ/just1.git');
insert into student values(4, '������', 'pjw', 'qwer', 27, 'https://github.com/pjw222');
insert into student values(5,'�ѻ���','hsy','qwer1234',37,'https://github.com/Natseol');
insert into student values(6,'������','TLM','486',27,'https://github.com/mabiTLM/Java4');
insert into student values(7,'�賲��','knk','1234',27,'https://github.com/LiamKim-0218/HomeWork2');
insert into student values(8,'������','LJH','3232','32,https://github.com/Juhan008/java-D');


create table hobby(
  2  id number(10,0) constraint pk_hobby_id PRIMARY KEY,
  3  name varchar2(20),
  4  explain varchar2(200),
  5  created_at timestamp default sysdate,
  6  average_time  varchar2(12),
  7  location varchar2(100)
  8  );
*/
   
   
   

}