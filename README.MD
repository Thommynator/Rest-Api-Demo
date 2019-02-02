# Rest Demo

## Setup

### Database

* Connect to your (local) MySQL Server.
    * Add the db username & password to the ``application.properties`` file.
* Create a MySQL database called ``mydb``:
```
create database mydb
```
* Create a table for each Entity. Example for Employee:
```
use mydb;

create table employee(
id int NOT NULL AUTO_INCREMENT,
first_name varchar(20),
last_name varchar(20),
PRIMARY KEY (ID)
);
```


## Run
* Run Spring Boot Application ``Application.java`` main method.
* Open http://localhost:8080/api
* You should see all available endpoints

All endpoints support the CRUD schema:
* Create    (_POST_)
* Read      (_GET_)
* Update    (_PUT, PATCH_)
* Delete    (_DELETE_)