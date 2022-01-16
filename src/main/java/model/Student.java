package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private String name;
    private String surname;
    private String age;
    private String email;
    private String phone;
    private Set<Lesson> lessons;
    private Date dateOfBirth;

}
