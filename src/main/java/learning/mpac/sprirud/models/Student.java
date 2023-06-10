package learning.mpac.sprirud.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int age;

    @Override
    public String toString() {
        return "\nStudent =  {" +
                "\n \tstudId : " + studId +
                ", \n \tfirstName : '" + firstName + '\'' +
                ", \n \tlastName : '" + lastName + '\'' +
                ", \n \tage : " + age + + '\n' +
        '}';
    }

}