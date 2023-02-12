package wsb.edu.finalproject.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity

public class Project  {

        @Id
        @GeneratedValue
        private Long id;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false, unique = true)
        private String code;

        @Column(columnDefinition = "TEXT")
        private String description;

        @Column(nullable = false)
        private Boolean enabled = true;

        @Column(nullable = false)
        private Date dateCreated;

        @ManyToOne
        @JoinColumn(name = "creator_id", nullable = false)
        private Person creator;




}

