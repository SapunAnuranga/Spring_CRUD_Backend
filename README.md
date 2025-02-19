# Spring Boot CRUD Backend Application

A simple CRUD (Create, Read, Update, Delete) application for managing users, built with **Spring Boot**, **MySQL**, and **Spring Data JPA**.

## Technologies Used
- **Java**
- **Spring Boot**
- **MySQL**
- **Spring Data JPA**

## API Endpoints

| Method  | Endpoint                         | Description               |
|---------|----------------------------------|---------------------------|
| **POST**   | `/api/v1/user/save`           | Create a new user         |
| **GET**    | `/api/v1/user/getAllUser`     | Retrieve all users        |
| **POST**   | `/api/v1/user/update`        | Update an existing user   |
| **DELETE** | `/api/v1/user/deleteUser/{id}` | Delete a user by ID       |

**Base URL:** `http://localhost:8081`

### Example Request Body
#### Create User (POST)
```json
{
  "userName": "sapun anuranga",
  "userAddress": "galnewa",
  "mobile": 0713084852
}
```

#### Update User (POST)
```json
{
  "userId": 1,
  "userName": "wanninayaka",
  "userAddress": "bulnewa",
  "mobile": 0713084855
}
```
