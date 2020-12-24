package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"ctx","cmm","mgr","tea","uss"})
public class HomeController {
	@Autowired HttpSession session;
	@Autowired HttpServletRequest request;
	
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String index(HttpSession session, HttpServletRequest request) {
    	String ctx = request.getContextPath();
    	session.setAttribute("ctx", ctx);
    	session.setAttribute("cmm", ctx+"/resources/cmm");
    	session.setAttribute("mgr", ctx+"/resources/mgr");
    	session.setAttribute("tea", ctx+"/resources/tea");
    	session.setAttribute("uss", ctx+"/resources/tea");
    	
        logger.info("Project Initialized ... ");
        
        return "index";
    }
    // sym(System Manager) => mgr, tea 디렉토리 이동시 admin 사용
    @GetMapping("/admin/{dir}/{page}")
    public String transfer(@PathVariable String dir, @PathVariable String page){
        logger.info("이동경로>>> "+dir+"/"+page);
        return String.format("admin:%s/%s", dir ,page);
    }
    // uss(User Service Support) 디렉토리 이동시 user 사용
    @GetMapping("/user/{page}")
    public String user(@PathVariable String page){
        logger.info("이동경로>>> /"+page);
        return String.format("user:%s", page);
    }
    // cop(Content Operator) 디렉토리 이동시 contnet 사용
    @GetMapping("/content/{dir}/{page}")
    public String content(@PathVariable String dir, @PathVariable String page){
        logger.info("이동경로>>> "+dir+"/"+page);
        return String.format("content:%s/%s", dir ,page);
    }
}
