package org.green.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.acls.model.AccessControlEntry;
import org.springframework.security.web.access.AccessDeniedHandler;

import lombok.extern.log4j.Log4j;
@Log4j
public class CustomAccessDeniedHandler implements AccessDeniedHandler{@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		log.error("���ٰź� �ڵ鷯");
		log.error("redirect.........");
		//���������� �ɸ��� ��� �����̷�Ʈ �ϴ� ���
		response.sendRedirect("/accessErorr");
		
	}
 
}
