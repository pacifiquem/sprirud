package learning.mpac.sprirud.repository;

import learning.mpac.sprirud.models.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select s from Student s order by s.firstName")
    List<Student> oderedByFirstName();
    List<Student> findByDob(LocalDate dob);

    Page<Student> findAll(Pageable pageable);

}