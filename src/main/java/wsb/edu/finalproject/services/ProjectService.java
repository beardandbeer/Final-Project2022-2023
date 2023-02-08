package wsb.edu.finalproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wsb.edu.finalproject.models.Project;
import wsb.edu.finalproject.repository.ProjectRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public List<Project> findall(){

        return projectRepository.findAll();
    }
}
