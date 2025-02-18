# JournalApp

## Overview
JournalApp is a RESTful web application that allows users to create, manage, and organize their journal entries efficiently. It is built using **Spring Boot** with **MongoDB** as the database. The application provides a secure and scalable platform for journaling with authentication, authorization, and advanced features like caching and event-driven architecture.

## Features
- **CRUD Operations:** Create, Read, Update, and Delete journal entries.
- **MongoDB Integration:** Stores journal entries in a NoSQL document-based database.
- **User Authentication & Authorization:** Implements **Spring Security** for secure user access.
- **RESTful APIs:** Exposes well-structured endpoints for interaction.
- **Transactional Operations:** Ensures atomicity in data modifications.
- **Logging & Monitoring:** Uses **Logback** and **SonarQube** for code quality and logs management.
- **Caching:** Implements **Redis** for performance optimization.
- **Event-Driven Architecture:** Uses **Kafka** for real-time event handling.
- **Cloud Deployment:** Deploys on **Heroku** or other cloud platforms.

## Tech Stack
- **Backend:** Java, Spring Boot
- **Database:** MongoDB (local or MongoDB Atlas)
- **Security:** Spring Security with JWT authentication
- **Caching:** Redis
- **Logging:** Logback
- **Testing:** JUnit, Mockito
- **Deployment:** Heroku

## Installation & Setup
### Prerequisites
- Java 17+
- MongoDB (local or cloud-based Atlas)
- Maven

### Clone the Repository
```sh
 git clone https://github.com/yourusername/JournalApp.git
 cd JournalApp
```

### Configure MongoDB Connection
Update `application.properties` or `application.yml` with your MongoDB connection details:
```properties
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster.mongodb.net/journalDB
```

### Build & Run
```sh
./mvnw spring-boot:run
```
The application will be available at `http://localhost:8080`

## API Endpoints
### Public Endpoints
- `POST /auth/register` - Register a new user
- `POST /auth/login` - Authenticate and get a JWT token

### Secured Endpoints (Require JWT Token)
- `GET /entries` - Get all journal entries
- `POST /entries` - Create a new journal entry
- `PUT /entries/{id}` - Update a journal entry
- `DELETE /entries/{id}` - Delete a journal entry

## Testing
Run tests using:
```sh
./mvnw test
```

## Deployment
Deploy the app to Heroku:
```sh
git push heroku main
```

## License
anyone can contribute in this code

## Author
[Uzair Fayaz](https://github.com/yourusername)

