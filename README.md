# Student REST Service

A RESTful CRUD web service for student records, built with **JAX-RS (Jersey 2.35)** and packaged as a WAR.
I made it for my Service-Oriented Architecture coursework (spring 2026).

![Java](https://img.shields.io/badge/Java-JAX--RS-orange?logo=openjdk) ![Jersey](https://img.shields.io/badge/Jersey-2.35-blue) ![Maven](https://img.shields.io/badge/build-Maven-C71A36?logo=apachemaven)

## Endpoints

| Method | Path | Description |
|--------|------|-------------|
| `GET` | `/students` | List all students |
| `GET` | `/students/{id}` | Get one student |
| `POST` | `/students` | Create a student (JSON body) |
| `PUT` | `/students/{id}` | Update a student |
| `DELETE` | `/students/{id}` | Delete a student |

JSON is (de)serialised with Jackson (`jersey-media-json-jackson`).

## Build and deploy

```bash
mvn clean package
# deploy target/StudentRestService-1.0-SNAPSHOT.war to Tomcat (or another servlet container)
```

## Structure

```
src/main/java/com/example/rest/Student.java          model
src/main/java/com/example/rest/StudentService.java   JAX-RS resource
src/main/webapp/WEB-INF/web.xml                      Jersey servlet mapping
```
