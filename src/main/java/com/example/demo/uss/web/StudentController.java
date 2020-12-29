package com.example.demo.uss.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cmm.enm.Messenger;
import com.example.demo.uss.service.Student;
import com.example.demo.uss.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired StudentService studentService;
    @PostMapping("")
    public Messenger register(@RequestBody Student student){
        logger.info("등록하려는 학생 정보: "+student.toString());
        return (studentService.register(student) == 1) ? Messenger.SUCCESS : Messenger.FAILURE;
    }
    @PostMapping("/login")
    public Map<?,?> login(@RequestBody Student student){
        var map = new HashMap<>();
        logger.info("로그인 학생 정보: "+student.toString());
        Student result = studentService.login(student);
        map.put("message", (result != null) ? "SUCCESS" : "FAILURE");
        map.put("sessionUser", result);
        logger.info("로그인 성공 정보: "+student.toString());
        return map;
    }
    @GetMapping("/{userid}")
    public Student profile(@PathVariable String userid){
        logger.info("프로필 정보: "+userid);
        return studentService.detail(userid);
    }
    @GetMapping("")
    public List<?> list(){
        return studentService.list();
    }
    @PutMapping("")
    public Messenger update(@RequestBody Student student){
        return (studentService.update(student) == 1) ? Messenger.SUCCESS : Messenger.FAILURE;
    }
    @DeleteMapping("")
    public Messenger delete(@RequestBody Student student){
        return (studentService.detele(student) == 1) ? Messenger.SUCCESS : Messenger.FAILURE;
    }
}