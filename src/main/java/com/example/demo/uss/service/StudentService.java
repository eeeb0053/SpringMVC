package com.example.demo.uss.service;

import java.util.HashMap;
import java.util.List;

import com.example.demo.cmm.enm.Sql;
import com.example.demo.cmm.utl.DummyGenerator;
import com.example.demo.uss.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    DummyGenerator dummy;
    public int register(Student student) {
        return studentMapper.insert(student);
    }
    
    public void insertMany(int count) {
    	for(int i = 0; i < count; i++) {
    		studentMapper.insert(dummy.makeStudent());
    	}
    }
    
    public Student login(Student student) {
        return studentMapper.login(student);
    }

    public Student detail(String userid) {
        return studentMapper.selectById(userid);
    }

    public List<?> list() {
        return studentMapper.selectAll();
    }

    public int update(Student student) {
        return studentMapper.update(student);
    }

    public int detele(Student student) {
        return studentMapper.delete(student);
    }
    
    public void trucate() {
    	var map = new HashMap<String, String>();
    	map.put("TRUNCATE_STUDENTS", Sql.TRUNCATE_STUDENTS.toString());
    	studentMapper.trucate(map);
    }
    
}
