package org.njgzr.config;

import org.njgzr.security.interfaces.LoginResultService;
import org.springframework.stereotype.Service;

/**
*@author Mr Gu [admin@njgzr.org]
*@version Dec 23, 2019 , 4:55:42 PM
*/
@Service
public class LoginResultServiceImpl implements LoginResultService {

	@Override
	public void loginSuccess(Long userId, String loginName, String terminal, String addr, String ip, String os,String browser) {
		
	}

	@Override
	public void loginFail(String loginName, Exception e) {
		
	}

	@Override
	public void logout(Long userId, String loginName) {
		
	}

}
