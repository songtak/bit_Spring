package com.sn9tk.web.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sn9tk.web.util.Messenger;

@RestControllerAdvice
@RequestMapping("/lotto")
public class LottoController {
	@Autowired LottoService lottoService;
	
	@GetMapping("/buy")
	public Messenger buy(@RequestBody Lotto lotto) {
		Messenger messenger = null;
		return messenger;
	}

}
