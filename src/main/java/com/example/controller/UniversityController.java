package com.example.controller;

import com.example.service.ProfessorManager;
import com.example.service.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    StudentManager studentManager;

    @Autowired
    ProfessorManager professorManager;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String getStudents(Model model) {

        model.addAttribute("students", studentManager.getStudents());

        return "students_view";
    }

    @RequestMapping(value = "/professors", method = RequestMethod.GET)
    public String getProfessors(Model model) {

        model.addAttribute("professors", professorManager.getProfessors());

        return "professors_view";
    }

    @RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
    public String display(@PathVariable("name") String name, Model model) {

        String welcomeMessage = "Welcome to " + name + "'s home page";

        model.addAttribute("welcomeMessage", welcomeMessage);

        return "student_home_page";
    }
}
