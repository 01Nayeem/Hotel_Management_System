-- Hotel Management System
-- Database Schema + Data

-- Create the database
CREATE DATABASE [Hotel];
GO

-- Use the newly created database
USE Hotel;
GO

-- Create Users table to store user information
CREATE TABLE Users (
    Id INT IDENTITY(1,1) PRIMARY KEY,
    Username NVARCHAR(50) NOT NULL,
    Email NVARCHAR(50) NOT NULL,
    Password NVARCHAR(50) NOT NULL,
    Phone NVARCHAR(50) NULL
);

-- Create Employees table to store employee information
CREATE TABLE Employees (
    Emp_ID INT IDENTITY(1,1) PRIMARY KEY,
    Emp_Name VARCHAR(50) NOT NULL,
    Job_Description VARCHAR(50) NOT NULL,
    NID INT NOT NULL,
    Emp_Type VARCHAR(15) NOT NULL,
    Mobile_No INT NOT NULL,
    Salary DECIMAL NOT NULL,
    Address VARCHAR(50) NOT NULL
);

-- Create Customer table to store customer information
CREATE TABLE Customer (
    Customer_id INT IDENTITY(1,1) PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Age VARCHAR(15) NOT NULL,
    Mobile_Number INT NOT NULL,
    NID INT NOT NULL,
    DOB DATE NOT NULL,
    Address VARCHAR(50) NOT NULL
);

-- Create Payment table to store payment details
CREATE TABLE Payment (
    Payment_no INT IDENTITY(1,1) PRIMARY KEY,
    Payment_method VARCHAR(50) NOT NULL,
    Payment_amount VARCHAR(50) NOT NULL,
    Payment_Date DATE NOT NULL
);

-- Create Room table to store room information
CREATE TABLE Room (
    Room_No INT IDENTITY(101, 1) PRIMARY KEY,
    Room_Type VARCHAR(50) NOT NULL,
    Room_Status VARCHAR(50) NOT NULL,
    Room_Price DECIMAL NOT NULL,
    Is_Available BIT NOT NULL
);

-- Create Booking table to store booking information
CREATE TABLE Booking (
    Booking_ID INT IDENTITY(1,1) PRIMARY KEY,
    Room_No INT,
    Customer_Id INT,
    Total_Rooms INT NOT NULL,
    StartDate DATE NOT NULL,
    EndDate DATE NOT NULL
);

-- Create Employee_Gets_Payment table to store employee payment information
CREATE TABLE Employee_Gets_Payment (
    Payment_no INT,
    Employee_ID INT,
    Amount DECIMAL NOT NULL,
    Date_Received DATE NOT NULL
);

-- Create Customer_Pays_Payment table to store customer payment information
CREATE TABLE Customer_Pays_Payment (
    Payment_no INT,
    Customer_ID INT,
    Amount DECIMAL NOT NULL,
    Date_Received DATE NOT NULL
);

-- Insert data into Employees table
INSERT INTO Employees (Emp_Name, Job_Description, NID, Emp_Type, Mobile_No, Salary, Address)
VALUES
    ('John Doe', 'Manager', 123456, 'Full-Time', 123456, 5000.00, '123 Main St'),
    ('Jane Smith', 'Receptionist', 987654, 'Part-Time', 987654, 2500.00, '456 Elm St'),
    ('Michael Johnson', 'Waiter', 456789, 'Part-Time', 567890, 1800.00, '789 Oak Ave'),
    ('Emily Williams', 'Housekeeper', 789123, 'Full-Time', 678901, 2200.00, '345 Maple St'),
    ('Daniel Brown', 'Chef', 654321, 'Full-Time', 789012, 4000.00, '567 Pine St'),
    ('Sophia Lee', 'Bartender', 321987, 'Part-Time', 890123, 2000.00, '890 Cedar St'),
    ('Matthew Taylor', 'Bellboy', 789654, 'Part-Time', 901234, 1900.00, '234 Walnut St'),
    ('Olivia Martinez', 'Manager', 159753, 'Full-Time', 123450, 5500.00, '789 Birch St'),
    ('James Anderson', 'Waiter', 753951, 'Part-Time', 135792, 1900.00, '234 Elm St'),
    ('Ava Wilson', 'Receptionist', 951753, 'Full-Time', 246813, 2600.00, '456 Oak St');

-- Insert data into Customer table
INSERT INTO Customer (FirstName, LastName, Age, Mobile_Number, NID, DOB, Address)
VALUES
    ('Alice', 'Johnson', '30', 111111, 11111, '1993-05-10', '789 Oak Ave'),
    ('Bob', 'Smith', '25', 222222, 22222, '1998-08-15', '456 Pine St'),
    ('Eva', 'Miller', '28', 333333, 33333, '1995-03-22', '123 Cedar St'),
    ('David', 'Brown', '35', 444444, 44444, '1988-12-01', '567 Walnut St'),
    ('Sophie', 'Wilson', '22', 555555, 55555, '2001-07-18', '890 Elm St'),
    ('Michael', 'Garcia', '27', 666666, 66666, '1996-09-05', '789 Pine St'),
    ('Emily', 'Rodriguez', '31', 777777, 77777, '1992-11-30', '456 Maple St'),
    ('William', 'Lee', '29', 888888, 88888, '1994-02-28', '234 Cedar St'),
    ('Avery', 'Lopez', '26', 999999, 99999, '1997-06-14', '789 Walnut St'),
    ('Sofia', 'Hernandez', '24', 101010, 10101, '1999-01-25', '345 Elm St');

-- Insert data into Payment table
INSERT INTO Payment (Payment_method, Payment_amount, Payment_Date)
VALUES
    ('Credit Card', '100.00', '2023-07-15'),
    ('Cash', '50.00', '2023-07-16'),
    ('Debit Card', '75.00', '2023-07-17'),
    ('Cash', '30.00', '2023-07-18'),
    ('Credit Card', '120.00', '2023-07-19'),
    ('Debit Card', '90.00', '2023-07-20'),
    ('Cash', '55.00', '2023-07-21'),
    ('Credit Card', '70.00', '2023-07-22'),
    ('Debit Card', '85.00', '2023-07-23'),
    ('Cash', '40.00', '2023-07-24');

-- Insert data into Room table
INSERT INTO Room (Room_type, Room_Status, Room_Price, Is_Available)
VALUES
    ('Single', 'Occupied', 100.00, 0),
    ('Double', 'Available', 150.00, 1),
    ('Single', 'Available', 90.00, 1),
    ('Suite', 'Occupied', 200.00, 0),
    ('Double', 'Available', 140.00, 1),
    ('Single', 'Occupied', 95.00, 0),
    ('Double', 'Available', 160.00, 1),
    ('Single', 'Occupied', 105.00, 0),
    ('Suite', 'Available', 180.00, 1),
    ('Double', 'Available', 135.00, 1);

-- Insert data into Booking table
INSERT INTO Booking (Room_No, Customer_Id, Total_Rooms, StartDate, EndDate)
VALUES
    (101, 1, 1, '2023-07-20', '2023-07-25'),
    (102, 2, 2, '2023-08-01', '2023-08-05'),
    (103, 3, 1, '2023-08-10', '2023-08-15'),
    (104, 4, 2, '2023-09-05', '2023-09-10'),
    (105, 5, 1, '2023-09-20', '2023-09-25'),
    (106, 6, 2, '2023-10-01', '2023-10-05'),
    (107, 7, 1, '2023-10-10', '2023-10-15'),
    (108, 8, 2, '2023-11-05', '2023-11-10'),
    (109, 9, 1, '2023-11-20', '2023-11-25'),
    (110, 10, 2, '2023-12-01', '2023-12-05');

-- Insert data into Employee_Gets_Payment table
INSERT INTO Employee_Gets_Payment (Payment_no, Employee_ID, Amount, Date_Received)
VALUES
    (1, 1, 1000.00, '2023-07-25'),
    (2, 2, 500.00, '2023-07-26'),
    (3, 3, 600.00, '2023-07-26'),
    (4, 4, 700.00, '2023-07-27'),
    (5, 5, 800.00, '2023-07-28'),
    (6, 6, 450.00, '2023-07-28'),
    (7, 7, 350.00, '2023-07-29'),
    (8, 8, 900.00, '2023-07-30'),
    (9, 9, 600.00, '2023-07-30'),
    (10, 10, 550.00, '2023-07-31');

-- Insert data into Customer_Pays_Payment table
INSERT INTO Customer_Pays_Payment (Payment_no, Customer_ID, Amount, Date_Received)
VALUES
    (1, 1, 50.00, '2023-07-20'),
    (2, 2, 75.00, '2023-07-22'),
    (3, 3, 60.00, '2023-07-24'),
    (4, 4, 70.00, '2023-07-25'),
    (5, 5, 80.00, '2023-07-26'),
    (6, 6, 45.00, '2023-07-27'),
    (7, 7, 35.00, '2023-07-28'),
    (8, 8, 90.00, '2023-07-29'),
    (9, 9, 60.00, '2023-07-30'),
    (10, 10, 55.00, '2023-07-31');

-- Add foreign key constraints to ensure data integrity
ALTER TABLE Booking ADD CONSTRAINT FK_Booking_Room
FOREIGN KEY (Room_No) REFERENCES Room (Room_No);

ALTER TABLE Booking ADD CONSTRAINT FK_Booking_Customer
FOREIGN KEY (Customer_Id) REFERENCES Customer (Customer_id) ON DELETE CASCADE;

ALTER TABLE Employee_Gets_Payment ADD CONSTRAINT FK_Employee_Gets_Payment_Payment
FOREIGN KEY (Payment_no) REFERENCES Payment (Payment_no);

ALTER TABLE Employee_Gets_Payment ADD CONSTRAINT FK_Employee_Gets_Payment_Employee
FOREIGN KEY (Employee_ID) REFERENCES Employees (Emp_ID) ON DELETE CASCADE;

ALTER TABLE Customer_Pays_Payment ADD CONSTRAINT FK_Customer_Pays_Payment_Payment
FOREIGN KEY (Payment_no) REFERENCES Payment (Payment_no);

ALTER TABLE Customer_Pays_Payment ADD CONSTRAINT FK_Customer_Pays_Payment_Customer
FOREIGN KEY (Customer_ID) REFERENCES Customer (Customer_id) ON DELETE CASCADE;