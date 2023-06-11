package learning.mpac.sprirud.controllers;

import learning.mpac.sprirud.models.Student;
import learning.mpac.sprirud.services.StudentService;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get/students")
    public List<Student> getStudents() {
        return this.studentService.getStudents();
    }

    @GetMapping("/get/studentById/{student_id}")
    public Optional<Student> getStudentById(@PathVariable("student_id") int student_id) {
        return this.studentService.getStudentById(student_id);
    }
    @GetMapping("/get/studentsBydob")
    public List<Student> getStudentsByDob(@RequestBody Student student){
        return this.studentService.getStudentByDOB(student.getDob());
    }

    @PostMapping("/add/student")
    public Student createStudent( @RequestBody Student student) {
        return this.studentService.createStudent(student);
    }

    @DeleteMapping("/delete/studentById/{id}")
    public String deleteStudentById(@PathVariable("id") int id) {
        return this.studentService.deleteStudentById(id);
    }

    @DeleteMapping("/delete/allStudents")
    public String deleteAllStudents() {
        return this.studentService.deleteAllStudents();
    }

    @PutMapping("/update/studentById/{id}")
    public Student updateStudentById(@PathVariable("id") int id, @RequestBody Student student) {
        return this.studentService.updateStudentById(id, student);
    }

}