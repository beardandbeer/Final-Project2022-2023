package wsb.edu.finalproject.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface AuthorityRepository extends JpaRepository {
    Optional<Authority> findByAuthority(String authority);
}
