package wsb.edu.finalproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wsb.edu.finalproject.models.Project;
import wsb.edu.finalproject.repository.ProjectRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public final class ProjectService {


    private final ProjectRepository projectRepository;

    public List<Project> findall() {
        return projectRepository.findAll();
    }
    public Project save(Project project){
        return projectRepository.save(new Project());
    }
}
