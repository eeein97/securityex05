package org.green.security;

import org.green.domain.MemberVO;
import org.green.mapper.MemberMapper;
import org.green.security.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailService implements UserDetailsService {
	@Setter(onMethod_ = {@Autowired})
	private MemberMapper mapper;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//MemberMapper�� ����ؼ� MemberVO ��ȸ
		//MemberVO�ν��Ͻ��� ������ UserDetails���� ��ȯ�ؼ� ��ȯ
		MemberVO mvo = mapper.read(username);
		log.info(mvo);
		return mvo == null ? null : new CustomUser(mvo);
	}
	
}
