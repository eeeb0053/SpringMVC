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
    @GetMapping("/move/{dir}/{page}")
    public String move(@PathVariable String dir, @PathVariable String page){
        logger.info("이동경로>>> "+dir+"/"+page);
        return String.format("%s/%s", dir, page);
    }
    @GetMapping("/admin/{dir}/{page}")
    public String transfer(@PathVariable String dir, @PathVariable String page){
        logger.info("이동경로>>> "+dir+"/"+page);
        return String.format("admin:%s/%s", dir ,page);
    }
    @GetMapping("/home")
    public String home() {
    	logger.info("타일즈 테스트 진입 성공");
    	return "public";
    }
}
