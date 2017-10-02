package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @RequestMapping(path = "/new_student", method = RequestMethod.GET)
    public String newStudent(Model model) {
        model.addAttribute("Grades", Grade.values());

        return "new_student";
    }

    @RequestMapping(path = "/create_student", method = RequestMethod.POST)
    public String createStudent(@RequestParam(value="first_name") String firstName, @RequestParam(value ="last_name") String lastName,                                              @RequestParam(value ="grade") Grade grade, @RequestParam(value ="enrolled") boolean enrolled, Model model) {
        Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setGrade(grade);
            student.setEnrolled(enrolled);

            model.addAttribute("firstName", student.firstName);
            model.addAttribute("lastName", student.lastName);
            model.addAttribute("grade", student.grade);
            model.addAttribute("enrolled", student.isEnrolled());

        return "view_student";
    }
}


