package learning.mpac.sprirud.services;

import learning.mpac.sprirud.models.Student;
import learning.mpac.sprirud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepo;

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById( int student_id) {
        return studentRepo.findById(student_id);
    }

    public List<Student> getStudentByAge(int age) {
        return studentRepo.findByAge(age);
    }

    public Student createStudent( Student student) {
        studentRepo.save(student);
        return student;
    }

    public String deleteStudentById(int id) {
        Optional<Student> existingStudent = studentRepo.findById(id);
        if(existingStudent.isPresent()) {
            studentRepo.deleteById(id);
            return "Student deleted Successfuly";
        }else {
            throw new IllegalArgumentException("Student With Id " + " was not found");
        }
    }

    public String deleteAllStudents() {
        studentRepo.deleteAll();
        return "All students Deleted Successfully";
    }

    public Student updateStudentById(int id, Student student) {
        Optional<Student> studentInDB = studentRepo.findById(id);

        if (studentInDB.isPresent()) {
            Student existingStudent = studentInDB.get();

            // Update the existing student with the new values from the request
            existingStudent.setLastName(student.getLastName());
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setAge(student.getAge());

            // Save the updated student in the repository
            studentRepo.save(existingStudent);

            return existingStudent;
        } else {
            throw new IllegalArgumentException("Student with Id " + id + " was not found");
        }
    }

}