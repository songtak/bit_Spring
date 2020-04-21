package com.sn9tk.web.member;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //url을 컨트롤하는 컨트롤러
@RequestMapping("/member") 
public class MemberController {
	public MemberService memberService;
	
	@PostMapping("/join")
	public Member add(@RequestBody Member member) {
		System.out.println(">>>>");
		System.out.println(member.toString());
		memberService = new MemberServiceImpl();
		memberService.add(member);
		return member; //이 안에서 데이터 값을 받기 위해
	}
	@PostMapping("/login")
	public String login(@RequestBody Member member) {
		memberService = new MemberServiceImpl();
		return (memberService.login(member))? "SUCCESS" : "FAIL";
	}
	@GetMapping("/list")
	public Member[] list() {
		Member[] members = new Member[5];
		return members;
	}

	@GetMapping("/detail")
	public Member detail(@RequestBody Member member) {
	Member returnMember = new Member();
	return returnMember;
	}
	@GetMapping("/count")
	public int count() {
		int count = 0;
		return count;
	}
@PutMapping("/update")
public Member update(@RequestBody Member member) {
	Member returnMember = new Member();
	return returnMember;	
}
@DeleteMapping("/delete")
public Member delete(@RequestBody Member member) {
	Member returnMember = new Member();
	return returnMember;
}
	
	
}
