package wsb.edu.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wsb.edu.finalproject.models.Project;
@Repository
public interface  ProjectRepository extends JpaRepository<Project,Long> {
}
