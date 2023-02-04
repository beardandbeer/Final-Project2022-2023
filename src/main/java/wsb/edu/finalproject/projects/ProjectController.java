package wsb.edu.finalproject.projects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    //TODO: @ecred("ROLE_PROJECTS_TAB)
    @GetMapping
    ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("projects/index");
        //TODO:przekaż zmienną z listą projektów

        modelAndView.addObject("projects",projectRepository.findAll());
        modelAndView.addObject("test","Test zmiennej");

        return modelAndView;
    }
}
