# Client Management API - Spring Boot RESTful API

## Overview
This project is a simple REST API for managing clients, built using Java and Spring Boot. It provides basic CRUD operations (Create, Read, Update and Delete).

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Instalation](#instalation)
- [Usage](#usage)
- [Examples](#examples)

## Features
- **List all Clients:** Get all registered clients.
- **Add new Clients:** Add one or more clients to the database.
- **Update Client:** Update an existing client based on the provided ID.
- **Delete Client:** Delete an existing client based on the provided ID.

## Prerequisites
1. Java JDK Version 8
2. Maven Version 3.1.3

## Instalation
1. Clone the Repository:

    ```
    git clone https://github.com/jonathangeovani/first-spring-boot-rest-api.git
    cd first-spring-boot-rest-api
    ```

2. Build and Run using Maven:

    ```
    mvn clean install
    mvn spring-boot:run
    ```

    The app will start running at <http://localhost:8080>

## Usage
Use your preferred API testing tool (Postman, cURL, etc) to interact with the endpoints:

| Method | URL | Description |
| ------ | --- | ----------- |
| GET    | /clients | Get a list of all registered clients. |
| POST   | /clients | Add one or more clients. [See example](#add-new-clients) |
| PUT    | /clients/update/{id} | Update an existing client. [See example](#update-client) |
| DELETE | /clients/delete/{id} | Delete an existing client |

## Examples
Valid JSON request body examples:

#### <a id='add-new-clients'>Add new clients -> /clients</a>
```json
[
  {
    "name": "John Doe",
    "email": "john.doe@example.com",
    "age": 30
  }
]
```

#### <a id='update-client'>Update a client -> /clients/update</a>
```json
{
  "name": "Updated name",
  "email": "updated.email@example.com",
  "age": 35
}
```
