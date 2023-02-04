package wsb.edu.finalproject.projects;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity

public class Project  {
    @Id
    @GeneratedValue

    private Long id;

    private String name, code,description;
    private boolean enambled = true;



    }

