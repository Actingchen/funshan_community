package life.xnfxzypt.community.controller;

import life.xnfxzypt.community.dto.QuestionDTO;
import life.xnfxzypt.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionMapper;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name="id") Long id,
                           Model model){
        QuestionDTO questionDTO=questionMapper.getById(id);
        model.addAttribute("question",questionDTO);
        return "question";
    }
}