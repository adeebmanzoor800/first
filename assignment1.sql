CREATE DATABASE ASSIGNMENT1;
USE ASSIGNMENT1;

CREATE TABLE Employees (
  ID INT,
  Name VARCHAR(255),
  EmailAddress VARCHAR(255),
  Department VARCHAR(255),
  DateOfBirth DATE,
  Salary DECIMAL(10, 2),
  IsActive BOOLEAN
);

INSERT INTO Employees (ID, Name, EmailAddress, Department, DateOfBirth, Salary, IsActive)
VALUES
  (1, 'John Doe', 'johndoe@example.com', 'Sales', '1990-05-15', 5000.00, true);

