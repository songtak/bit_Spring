package com.sn9tk.web.grade;

import org.springframework.stereotype.Service;

import com.sn9tk.web.util.Credit;

@Service
public class GradeServiceImpl //해쉬맵
implements GradeService{ //맵
	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[6];
		count=0;
	}
	
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;	
	}

	@Override
	public int count() {
		return count;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public Credit detail(String userid) {
		Credit credit = null;
		switch(avg(userid)/10) {
		case 10: case 9: credit = credit.A; break;
		case 8: credit = credit.B; break;
		case 7:  credit = credit.C; break;
		case 6:  credit = credit.D; break;
		case 5:  credit = credit.E; break;
		default : credit = credit.F; break;
		}
		return credit;
	}
	private int avg(String userid) {
		return total(userid)/4;
	}



	@Override
	public int total(String userid) {
		int total = 0;
		for(int i=0; i<count; i++) {
			if(userid.equals(grades[i].getUserid())) {
				total =  Integer.parseInt(grades[i].getKorean())+
						Integer.parseInt(grades[i].getEnglish())+
						Integer.parseInt(grades[i].getJava())+
						Integer.parseInt(grades[i].getMath());
			}
		}
		return total;
	}

}
