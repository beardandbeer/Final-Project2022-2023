package wsb.edu.finalproject.models;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity

public class Project  {

        @Id
        @GeneratedValue
        private Long id;

        private String name;

        private String code;

        private String description;

        private Boolean enabled = true;



}

