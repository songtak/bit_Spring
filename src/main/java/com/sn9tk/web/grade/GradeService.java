package com.sn9tk.web.grade;

public interface GradeService {
	public void add(Grade grade);
	public Grade[] list();
	public Grade detail(String userid);
	public int count();
	public String total(Grade grade);
	public String average(Grade grade);
    public void update(Grade grade);
}
