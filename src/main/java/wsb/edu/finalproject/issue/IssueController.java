package wsb.edu.finalproject.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {
private final IssueService issueService;
    @GetMapping
    ModelAndView indexIssue(){
        ModelAndView modelAndView = new ModelAndView("issues/indexIssue");
        modelAndView.addObject("issues",issueService.findall(new Issue()));
                return modelAndView;
    }




}
