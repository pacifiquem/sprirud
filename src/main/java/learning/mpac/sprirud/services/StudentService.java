package learning.mpac.sprirud.services;

import learning.mpac.sprirud.models.Student;
import learning.mpac.sprirud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;


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

        //check if student who is going to be updated is in database
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

    public List<Student> insertManyStudentsIntoDB(List<Student> students) {

        studentRepo.saveAll(students);
        return students;
    }

    public List<Student> getStudentOrderedByFirstName() {
        return studentRepo.oderedByFirstName();
    }

    public Page<Student> getAllStudentsPaginated(Pageable pageable) {
        return studentRepo.findAll(pageable);
    }

    public List<Student> getAllStudentSorted(String element) {
        Sort sort = Sort.by(Sort.Direction.ASC, element);
        return studentRepo.findAll(sort);
    }

}