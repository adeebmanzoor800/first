CREATE DATABASE IF NOT EXISTS ASSIGNMENT2;
USE ASSIGNMENT2;
CREATE TABLE EMPLOYEES(
name VARCHAR(50),
ID INT PRIMARY KEY);
INSERT INTO  EMPLOYEES VALUES("adeeb",34343);
INSERT INTO   EMPLOYEES VALUES("gowher",34344);
INSERT INTO  EMPLOYEES VALUES("salib",54345);
INSERT INTO  EMPLOYEES VALUES("aathisham",343406);
INSERT INTO  EMPLOYEES VALUES("biden",399346);
INSERT INTO  EMPLOYEES VALUES("trump",343676);
create TABLE DEPARTMENT(name VARCHAR(50),
ID INT PRIMARY KEY);
INSERT INTO  DEPARTMENT VALUES("adeeb",34343);
INSERT INTO  DEPARTMENT VALUES("gowher",34344);
INSERT INTO  DEPARTMENT VALUES("salib",54345);
INSERT INTO  DEPARTMENT VALUES("aathisham",343406);
INSERT INTO  DEPARTMENT VALUES("GST",3993486);
INSERT INTO  DEPARTMENT VALUES("TOODO",3423676);
SELECT *
FROM EMPLOYEES
LEFT JOIN  DEPARTMENT ON EMPLOYEES.ID = DEPARTMENT.ID;
SELECT *
FROM EMPLOYEES
RIGHT JOIN DEPARTMENT ON EMPLOYEES.ID = DEPARTMENT.ID;
SELECT *
FROM EMPLOYEES
LEFT join DEPARTMENT ON EMPLOYEES.ID = DEPARTMENT.ID
UNION
SELECT *
FROM EMPLOYEES
RIGHT join DEPARTMENT ON EMPLOYEES.ID = DEPARTMENT.ID;
SELECT *
FROM EMPLOYEES,DEPARTMENT;
SELECT EMPLOYEES.ID,EMPLOYEES.NAME
FROM EMPLOYEES
WHERE EMPLOYEES.ID IS NOT NULL;