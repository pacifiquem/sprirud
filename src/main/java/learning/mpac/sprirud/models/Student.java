package learning.mpac.sprirud.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private LocalDate dob;

    @Transient
    private int age;

    @Access(AccessType.PROPERTY)
    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dob, currentDate);
        return period.getYears();
    }

    @Access(AccessType.FIELD)
    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "\nStudent =  {" +
                "\n \tstudId : " + studId +
                ", \n \tfirstName : '" + firstName + '\'' +
                ", \n \tlastName : '" + lastName + '\'' +
                ", \n \tlastName : '" + this.getAge() + '\'' + '\n'+
        '}';
    }
}