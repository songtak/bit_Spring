package com.sn9tk.web.lotto;

import com.sn9tk.web.util.Check;

public interface LottoService {
	public void add(Lotto lotto);
	public Lotto detail(String userid);
	public int count();
	public int lottoNumber();
	public int lottoCheckResult(String userid);
}
