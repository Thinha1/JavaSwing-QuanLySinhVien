Here's how to create database 
CREATE DATABASE SinhVien;

Create table
CREATE TABLE ThongTin (
    MaSV INT NOT NULL,
    HoTen NVARCHAR(100),
    Ten NVARCHAR(50),
    GioiTinh NVARCHAR(10),
    DiemTB FLOAT,
    PRIMARY KEY (MaSV)
);

That's all and make sure you have account in your DBMS. Change your connect string to fit with your account
String ConnectionUrl = "jdbc:sqlserver://localhost:1433;databasename = SinhVien;encrypt=true;trustServerCertificate=true;";
String user = "thinh";
String password = "";
It's in DBConnection.java in dao package.

ENJOY MY CODE! LOVE YOU GUYS VERY MUCH 😘
