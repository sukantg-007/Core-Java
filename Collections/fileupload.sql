CREATE TABLE new_emp(
eid number(3) PRIMARY key,
ename varchar2(15),
eaddr varchar2(15),
photo_path varchar2(20),
resume_path varchar2(20)
);

SQL> CREATE TABLE new_emp(
  2  eid number(3) PRIMARY key,
  3  ename varchar2(15),
  4  eaddr varchar2(15),
  5  photo_path varchar2(20),
  6  resume_path varchar2(20)
  7  );

Table created.

SQL> desc new_emp;
 Name                                                              Null?    Type
 ----------------------------------------------------------------- -------- --------------------------------------------
 EID                                                               NOT NULL NUMBER(3)
 ENAME                                                                      VARCHAR2(15)
 EADDR                                                                      VARCHAR2(15)
 PHOTO_PATH                                                                 VARCHAR2(20)
 RESUME_PATH                                                                VARCHAR2(20)