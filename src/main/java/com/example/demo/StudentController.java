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
        /* call the method on the Grade enum to get all the grades */
        return "new_student";
        //TODO: #1: Flesh out the ||@RequestMapping("/new_student")|| route.
    }

    @RequestMapping(path = "/create_student", method = RequestMethod.POST)
    public String createStudent(@RequestParam(value="first_name") String firstName, @RequestParam(value ="last_name") String lastName, @RequestParam(value ="grade") Grade grade, Model model) {
        Student student = new Student();
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setGrade(grade);

            model.addAttribute("firstName", student.firstName);
            model.addAttribute("lastName", student.lastName);
            model.addAttribute("grade", student.grade);

        //TODO: #3:  In the controller class flesh out the @RequestMapping("/create_student") route.
        /* set student firstName, lastName and grade using the http request parameters */
        /* add the student to the model that will be used by the view_student html file */

        return "view_student";
    }
}


