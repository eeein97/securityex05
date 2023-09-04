package org.green.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;

import org.green.domain.MemberVO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.extern.log4j.Log4j;

@Getter
public class CustomUser extends User {
	//CustomUser User�� ��ӹ����Ƿ�, �θ�Ŭ������ �����ڸ� ȣ���ؾ߸� �������� ��ü�� ������ �� ����
	//AuthVO --> GrantedAuthority��ü�� ��ȯ
	private MemberVO member;
	private static final long serialversionUID = 1L;
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);	
	}
	public CustomUser(MemberVO mvo) {
		super(mvo.getUserid(), mvo.getUserpw(), mvo.getAuthList().stream()
				.map(auth -> new SimpleGrantedAuthority(auth.getAuth()))
				.collect(Collectors.toList()));
		this.member = mvo;
	}
}
