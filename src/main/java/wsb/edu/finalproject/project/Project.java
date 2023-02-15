package wsb.edu.finalproject.project;

import lombok.Data;
import wsb.edu.finalproject.person.Person;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity

public class Project  {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

       // @Column(nullable = false)
        private String name;

       // @Column(nullable = false, unique = true)
        private String code;

       // @Column(columnDefinition = "TEXT")
        private String description;

       // @Column(nullable = false)
        private Boolean enabled = true;

       // @Column(nullable = false)
        private Date dateCreated;

        @ManyToOne
        @JoinColumn(name = "creator_id" ,nullable = false)
        private Person creator;




}

