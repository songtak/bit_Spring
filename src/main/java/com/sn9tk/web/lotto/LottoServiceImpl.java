package com.sn9tk.web.lotto;

import java.lang.reflect.Array;

import org.springframework.stereotype.Service;

import com.sn9tk.web.util.Check;

@Service
public class LottoServiceImpl implements LottoService{
	private Lotto[] lottos;
	private int count;
	
	public LottoServiceImpl() {
		lottos = new Lotto[5];
		count = 0;
	}

	@Override
	public void add(Lotto lotto) {
		lottos[count] = lotto;
		count++;
	}

	@Override
	public Lotto detail(String userid) {
		Lotto returnLotto = null;
		switch(mat(userid)) {}
		return returnLotto;
	}

	private int mat(String userid) {
		return 0;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int lottoCheckResult(String userid) {
		return 0;
	}

	@Override
	public int lottoNumber() {
		int lottoNumber = 0;
		int[] lotto = new int[6];
        for(int i=0;  i<count; i++) {
        	lotto[i] = (int)(Math.random()*45)+1;
        	for(int j=0; j<i; j++) {
        		if(lotto[i]==lotto[j])
        			i-=1;
        	}
        	lottoNumber = lotto[i];
        }
		return lottoNumber;
	}

}
