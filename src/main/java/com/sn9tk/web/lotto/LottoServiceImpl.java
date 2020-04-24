package com.sn9tk.web.lotto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sn9tk.web.user.User;
import com.sn9tk.web.util.Check;

@Service
public class LottoServiceImpl implements LottoService{
	private Map<String,Object> map;
	public LottoServiceImpl() {
		map = new HashMap<>();
	}

	@Override
	public void add(Lotto lotto) {
		map.put(lotto.getUserid(), lotto);
	}

	@Override
	public int count() {
		return map.size();
	}

	
	@Override
	public Lotto detail(String userid) {
		return (Lotto) map.get(userid);
	}



	@Override
	public int lottoCheckResult(String userid) {
		int lottoChecking = 0;
		return lottoChecking;
	}

	
	@Override
	public int[] lottoNumber() {
		int[] lotto = new int[6];


		return lotto;
	}


}
