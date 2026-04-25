package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddAndSearchStudent() {
        StudentService service = new StudentService();

        service.addStudent(1, "Raif");

        Student student = service.searchStudent(1);

        assertNotNull(student);
        assertEquals(1, student.getId());
        assertEquals("Raif", student.getName());
    }

    @Test
    void testDeleteStudent() {
        StudentService service = new StudentService();

        service.addStudent(2, "Ahmed");

        boolean deleted = service.deleteStudent(2);

        assertTrue(deleted);
        assertNull(service.searchStudent(2));
    }

    @Test
    void testSearchStudentNotFound() {
        StudentService service = new StudentService();

        Student student = service.searchStudent(99);

        assertNull(student);
    }
}