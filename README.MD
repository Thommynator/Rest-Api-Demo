# Rest Demo

This project is a basic demo for RESTful API's using Spring Boot.
It is structured in different packages, whereas each package represents
an independent demo.

* SimpleApiDemo
* Event System Demo

## Simple API Demo
This is a basic demo, which provides two different endpoints,
``/employees`` and ``/departments``.
They support the [Hypertext Application Language](http://stateless.co/hal_specification.html)
(HAL).

### Setup Database

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


### Run
* In **application.properties** change the database name in
``spring.datasource.url`` to **mydb**.
* Run Spring Boot Application ``Application.java`` main method.
* Open http://localhost:8080/api
* You should see all available endpoints

All endpoints support the CRUD schema:
* Create    (_POST_)
* Read      (_GET_)
* Update    (_PUT, PATCH_)
* Delete    (_DELETE_)

### Example
Using the base URL ``http://localhost:8080/api`` returns:
```
{
  "_links" : {
    "employees" : {
      "href" : "http://localhost:8080/api/employees"
    },
    "departments" : {
      "href" : "http://localhost:8080/api/departments"
    },
    "profile" : {
      "href" : "http://localhost:8080/api/profile"
    }
  }
}
```



_________________________________________________________


## Event System Demo

This demo provides several endpoints for an event management system:
* /organizers
* /events
* /venues
* /participants

Organizers can be created and organizers can create multiple new events.
An event is assigned to one venue. Participants can sign in for
multiple events.


### Setup Database
Create the following tables in a database called ``events``.

```
CREATE TABLE ORGANIZER
(
  ID int                NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20)    NOT NULL,
  CREATED TIMESTAMP     DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (ID)
);


CREATE TABLE VENUE
(
  ID int                NOT NULL AUTO_INCREMENT,
  CREATED TIMESTAMP     DEFAULT CURRENT_TIMESTAMP,
  `NAME` varchar(256),
  STREET_ADDRESS varchar(256),
  STREET_ADDRESS2 varchar(256),
  CITY varchar(256),
  STATE varchar(256),
  COUNTRY VARCHAR(256),
  POSTAL_CODE varchar(256),
  PRIMARY KEY (ID)
);


CREATE TABLE EVENT
(
  ID int                NOT NULL AUTO_INCREMENT,
  CREATED TIMESTAMP     DEFAULT CURRENT_TIMESTAMP,
  `NAME` varchar(256),
  `DESCRIPTION` varchar(2048),
  START_TIME TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
  END_TIME TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
  ZONE_ID blob,
  STARTED int,
  ORGANIZER_ID int      NOT NULL,
  VENUE_ID int,
  PRIMARY KEY (ID),
  FOREIGN KEY (ORGANIZER_ID) REFERENCES ORGANIZER(ID) ON DELETE CASCADE,
  FOREIGN KEY (VENUE_ID) REFERENCES VENUE(ID)
);


CREATE TABLE PARTICIPANT
(
  ID int                NOT NULL AUTO_INCREMENT,
  CREATED TIMESTAMP     DEFAULT CURRENT_TIMESTAMP,
  `NAME` varchar(256)   NOT NULL,
  EMAIL varchar(256)    NOT NULL,
  CHECKED_IN int,
  EVENT_ID int          NOT NULL,
  PRIMARY KEY (ID),
  FOREIGN KEY (EVENT_ID) REFERENCES event(ID),
  UNIQUE (EVENT_ID, EMAIL)
);
```

### Run
* In **application.properties** change the database name in
``spring.datasource.url`` to **events**.