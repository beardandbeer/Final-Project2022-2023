package wsb.edu.finalproject.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public final class ProjectService {


    private final ProjectRepository projectRepository;

    public List<Project> findall() {
        return projectRepository.findAll();
    }


    public Project save(Project project) {
        projectRepository.save(project);
        return project;
    }
}


