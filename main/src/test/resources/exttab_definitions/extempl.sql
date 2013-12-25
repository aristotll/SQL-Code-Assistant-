create table extemp1
(
empno number(4),
ename varchar2(10),
JOB VARCHAR2(9),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER(7,2),
DEPTNO NUMBER(2)
)
ORGANIZATION EXTERNAL
(
TYPE ORACLE_LOADER
DEFAULT DIRECTORY MYDIR
ACCESS PARAMETERS
(
RECORDS DELIMITED BY NEWLINE SKIP 1
FIELDS TERMINATED BY ','
(
empno CHAR,
ename CHAR,
JOB CHAR,
MGR CHAR,
HIREDATE CHAR,
SAL CHAR,
COMM CHAR,
DEPTNO CHAR
))
LOCATION('DATA.LST')
)
REJECT LIMIT 1
;