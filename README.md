Option 1: Use Spring Initializr (Online UI)
Go to https://start.spring.io

Option	Value
Project	Maven (or Gradle)
Language	Java
Spring Boot Version	Default
Group	com.example
Artifact	demo
Dependencies	Spring Web, Spring Boot DevTools (optional)

Extract the .zip and open in IntelliJ, VS Code, or Eclipse.

# Spring Boot + MySQL + Spring Data JPA Example

This is a simple Spring Boot project that connects to a MySQL database using Spring Data JPA. It provides basic CRUD operations using a repository pattern.

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven / Gradle (choose depending on your build tool)

---

## 🚀 How to Run

### 1. ✅ Prerequisites
- Java 17+ installed
- MySQL installed and running
- IntelliJ / VS Code / any IDE
- Maven or Gradle
- Used gradle

---

### 2. 🗃️ MySQL Setup

#### Step 1: Login to MySQL

```src
├── main/
│   ├── java/
│   │   └── com.example.demo/
│   │       ├── entity/       # Your JPA entities
│   │       ├── repository/   # Your JPA repositories
│   │       └── controller/   # Your REST controllers (optional)
│   └── resources/
│       └── application.properties


