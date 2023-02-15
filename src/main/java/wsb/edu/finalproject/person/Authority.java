package wsb.edu.finalproject.person;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Authority {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;
}
