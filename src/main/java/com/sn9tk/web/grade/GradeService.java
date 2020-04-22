package com.sn9tk.web.grade;

import com.sn9tk.web.util.Credit;

public interface GradeService {
	public void add(Grade grade);
	public Credit detail(String userid);
	public int count();
	public int total(String userid);
}
