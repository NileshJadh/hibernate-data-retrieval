"# hibernate-data-retrieval" 

# Hibernate GetRecordApp

This project demonstrates how to retrieve records from a database using Hibernate ORM. It shows the use of multiple Hibernate sessions to fetch different `Student` entities based on their IDs.

---

## Features

- Fetch entities using Hibernate `Session.get()` method.
- Use multiple sessions to retrieve different records concurrently.
- Proper resource handling with exception management.

---

## Technologies Used

- Java
- Hibernate ORM
- Jakarta Persistence (JPA)
- Relational Database (MySQL)
- Maven (optional)

---

## Prerequisites

- Java Development Kit (JDK)
- A relational database (MySQL, PostgreSQL, etc.)
- Hibernate dependencies included in your project
- Properly configured `hibernate.cfg.xml` file with database connection info

---

## Project Structure

src/
├── main/
│ ├── java/com/vicky/app/
│ │ └── GetRecordApp.java # Main class to fetch Student records
│ ├── java/com/vicky/model/
│ │ └── Student.java # Student entity class
│ └── resources/
│ └── hibernate.cfg.xml # Hibernate configuration file

