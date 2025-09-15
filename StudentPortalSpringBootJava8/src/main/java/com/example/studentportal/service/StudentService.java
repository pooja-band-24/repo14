
package com.example.studentportal.service;

import com.example.studentportal.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    private final Map<Integer, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void updateStudent(int id, Student student) {
        students.put(id, student);
    }

    public void deleteStudent(int id) {
        students.remove(id);
    }
}
