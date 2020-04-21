package com.sn9tk.web.grade;

public class GradeServiceImpl implements GradeService{
	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[5];
		count=0;
	}
	
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	
	}
	@Override
	public Grade[] list() {
		return grades;
	}
	@Override
	public Grade detail(String userid) {
		Grade grade = null;
		return grade;
	}
	@Override
	public int count() {
		return 0;
	}
	@Override
	public String total(Grade grade) {
		return null;
	}
	@Override
	public String average(Grade grade) {
		return null;
	}
	@Override
	public void update(Grade grade) {
		
	}
	@Override
	public void delete(Grade grade) {
		
	}
	

}
