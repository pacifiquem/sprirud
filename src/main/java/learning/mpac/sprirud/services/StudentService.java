package learning.mpac.sprirud.services;

import learning.mpac.sprirud.models.Student;
import learning.mpac.sprirud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import javax.swing.text.html.Option;
import java.time.LocalDate;
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
        Optional<Student> existingStudent = studentRepo.findById(student_id);

        if(existingStudent.isPresent()) {
            System.out.println(existingStudent);
            return existingStudent;
        }

        throw new IllegalArgumentException("Student with Id " + " was not found");
    }

    public Student createStudent( Student student) {
        studentRepo.save(student);
        return student;
    }

    public List<Student> getStudentByDOB(LocalDate dob) {
        List<Student> students = studentRepo.findByDob(dob);
        return students;
    }

    public String deleteStudentById(int id) {
        Optional<Student> existingStudent = studentRepo.findById(id);
        if(existingStudent.isPresent()) {
            studentRepo.deleteById(id);
            return "Student deleted Successfuly";
        }else {
            throw new IllegalArgumentException("Student with Id " + id + " was not found");
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
            if (student.getLastName() != null && !student.getLastName().isEmpty()) {
                existingStudent.setLastName(student.getLastName());
            }

            if (student.getFirstName() != null && !student.getFirstName().isEmpty()) {
                existingStudent.setFirstName(student.getFirstName());
            }

            if(student.getDob() != null) {
                existingStudent.setDob(student.getDob());
            }

            // Save the updated student in the repository
            studentRepo.save(existingStudent);

            return existingStudent;
        } else {
            throw new IllegalArgumentException("Student with Id " + id + " was not found");
        }
    }

}