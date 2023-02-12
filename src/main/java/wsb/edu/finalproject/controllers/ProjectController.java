package wsb.edu.finalproject.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import wsb.edu.finalproject.models.Project;
import wsb.edu.finalproject.repository.ProjectRepository;
import wsb.edu.finalproject.services.ProjectService;

import java.util.List;

@Controller
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView("projects/index");
        modelAndView.addObject("projects", projectService.findall());

        return modelAndView;
    }

    @GetMapping("/create")
    ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("projects/create");

        Project project = new Project();
        modelAndView.addObject("project", project);

        return modelAndView;
    }
    @PostMapping("/save")
    ModelAndView save(@ModelAttribute Project project){
        projectService.save(project
        );
        ModelAndView modelAndView = new ModelAndView("projects/create");
        return modelAndView;
    }
}

