package com.example.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentService {

    private static Map<Integer, Student> students = new HashMap<>();

    static {
        students.put(1, new Student(1, "John Doe", "john@example.com"));
        students.put(2, new Student(2, "Jane Smith", "jane@example.com"));
    }

    @GET
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @GET
    @Path("/{id}")
    public Student getStudent(@PathParam("id") int id) {
        return students.get(id);
    }

    @POST
    public Student addStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    @PUT
    @Path("/{id}")
    public Student updateStudent(@PathParam("id") int id, Student student) {
        students.put(id, student);
        return student;
    }

    @DELETE
    @Path("/{id}")
    public String deleteStudent(@PathParam("id") int id) {
        students.remove(id);
        return "{\"message\":\"Student deleted\"}";
    }
}
