package learning.mpac.sprirud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentRequestDTO {
    private String firstName;
    private String lastName;
    private LocalDate dob;
}