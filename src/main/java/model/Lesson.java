package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson implements Serializable {

    private String name;
    private String duration;
    private String lecturerName;
    private int price;

}
