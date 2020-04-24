package com.sn9tk.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
	public Map<String, Object> map; //생긴건 이렇지만 배열임 여기 안에 엔트리배열이 있는거임
	public UserServiceImpl() {
		map = new HashMap<>(); //map이지만 HashMap으로 선언할 것
	}
	@Override
	public void add(User user) {
		map.put(user.getUserid(), user);
	}
	@Override
	public int count() {
		return map.size();
	}
	@Override
	public User login(User user) {
		User returnUser = null;
		if(map.containsKey(user.getUserid())) {
			User u = detail(user.getUserid());
			if(user.getPasswd().equals(u.getPasswd())) {
				returnUser = u;
			}
		}
		return returnUser;
	}
	@Override
	public User detail(String userid) {
		System.out.println("서비스 디테일에 들어온 아이디:" + userid);
		User t = (User) map.get(userid);
		System.out.println("ddddddddddddddddddddd");
		return t;
	}
	@Override
	public boolean update(User user) {
		map.replace(user.getUserid(), user);
		return true;
	}
	@Override
	public boolean remove(String userid) {
		map.remove(userid);
		return true;
	}
}
