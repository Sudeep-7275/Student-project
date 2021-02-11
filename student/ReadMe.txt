Student Detail System


Introduction:

In this system we propose to give a solution to Get and insert some specific Student Details like 
Student ID , Student name, Student age,Student Enrolled course using RESTful WebServices in 
Spring Boot using JPA performing get and post method.
GET Method :
This method get desired data from the database and display it on the body in JSON/XML form.
POST Method:
This method is used to insert data from the user in database.

DATABASE CONFIGURATION:

Database Client: MySQL
Database name: Student
Table name: Student_Details
Field Name(Field types) :
Student_id(integer) , Student_Name(varchar) , Student_Age(integer) , Student_Course(varchar)
SQL Queries:

#Creating database

     create database Student;

#Creating Table

create table Student_details(
Student_id int,
Student_name varchar,
Student_Age int,
Student_Course varchar
primary key (Student_id)
);
#Inserting dummy values in the database

      insert into student_details(STUDENT_NAME,STUDENT_AGE,STUDENT_COURSE)values("Deepak",24,"MCA");

Database Configuration in Student Application (Application.properties) :

spring.datasource.url = jdbc:mysql://localhost:3306/student
spring.datasource.username = <Your User name>
spring.datasource.password = <Your Password>
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver

API End Point Details:

GET:
          /details

POST:
           /details
Content-type = APPLICATION/JSON