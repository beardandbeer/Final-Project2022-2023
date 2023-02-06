package wsb.edu.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wsb.edu.finalproject.models.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
