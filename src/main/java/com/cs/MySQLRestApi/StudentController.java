package com.cs.MySQLRestApi;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studenttable")
public class StudentController {
    @Autowired
    private StudentRepository stud_rep;

    // create new student
    @PostMapping("/add")
    public Student addNewStudent(@RequestBody Student newStudent){
    	Student s = new Student();
        s.setStudent_name(newStudent.getStudent_name());
        s.setStudent_id(newStudent.getStudent_id());
        stud_rep.save(s);
        return s; 
    }


    // view all students
    @GetMapping("view/all")
    public @ResponseBody Iterable<Student> getAllStudents(){
        return stud_rep.findAll();
    }

    // view specific student
    @GetMapping("view/{id}")
    public Optional<Student> getStudent(@PathVariable Long id) {
        return stud_rep.findById(id);
    }

    // update an existing student
    @PutMapping("edit/{id}")
    public String update( @RequestBody Student updateStudent, @PathVariable Long id) {
        return stud_rep.findById(id)
                 .map(s -> {
                       s.setStudent_name(updateStudent.getStudent_name());
                       //s.setStudent_id(updateStudent.getStudent_id());
                       stud_rep.save(s);
                       return "Student details have been successfully updated!";
                 }).orElseGet(() -> {
                       return "This Student doesn't exist";
                 });
    }

    // delete student
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable("id")Long id) {
    	stud_rep.deleteById(id); 
        return "Student has been successfully deleted!";
    }
}
