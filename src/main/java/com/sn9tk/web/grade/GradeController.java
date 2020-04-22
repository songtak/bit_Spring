package com.sn9tk.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn9tk.web.util.Credit;
import com.sn9tk.web.util.Messenger;


@RestController //페이지 안 넘기고 안에서만 움직인다.
@RequestMapping("/grade")
public class GradeController {
	@Autowired GradeService gradeService;
	
	@PostMapping("/register")
	public Messenger register(@RequestBody Grade grade) {
		System.out.println("register 들어옴!!");
		Messenger messenger = null;
		int current = gradeService.count();
		gradeService.add(grade);
		
		return (gradeService.count()==current + 1)? Messenger.SUCCESS : Messenger.FAIL;
	}
	
	@GetMapping("/report/{userid}") //값이 바뀌니까 /userid가아니라 {}로 필드를 줌
         //위에 줄 ()안은 path고 {}은 변수
	public Credit report(@PathVariable String userid) {
		return  gradeService.detail(userid);
		
	}

}
