package learning.mpac.sprirud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDTO {
    private String firstName;
    private String lastName;
    private int age;
}
