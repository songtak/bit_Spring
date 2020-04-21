package com.sn9tk.web.member;

public class MemberServiceImpl implements MemberService {
    private Member[] members;
    private int count;
	
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public Member detail(String userid) {
		Member member = null;
		for(int i=0; i<count; i++) {
			if(userid.equals(members[i].getUserid())) {
				member = members[i];
			}
		}
		return member;
	}

	@Override
	public int count() {		
		return count;
	}

	@Override
	public void update(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				break;
			}
		}
		
	}

	@Override
	public void delete(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&&
					member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count-1];
				members[count-1]=null;
				count--;
			}
		}
		
	}

	@Override
	public boolean login(Member member) {
		return true;
	}

}
