package com.example.demo.sts.service.model;

import com.example.demo.uss.service.model.Student;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Component
public class Grade extends Student{
    private String gradeNum, subject, score, grade, stuNum;
}
/*
create table grades(
	grade_num int primary key,
	subject varchar2(20),
	score varchar2(20),
	grade varchar2(20),
	stu_num int,
	constraint grades_fk foreign key(stu_num) references students(stu_num) 
	)
*/
