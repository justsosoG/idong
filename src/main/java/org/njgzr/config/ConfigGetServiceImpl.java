package org.njgzr.config;

import java.util.List;

import org.njgzr.security.interfaces.ConfigGetService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
*@author Mr Gu [admin@njgzr.org]
*@version Dec 23, 2019 , 4:56:31 PM
*/
@Service
public class ConfigGetServiceImpl implements ConfigGetService {

	@Override
	public Long maxSessionCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> anons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StringRedisTemplate getStringRedisTemplate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAppId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long webExpireTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long appExpireTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long pcExpireTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginUserNameParam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginPasswordParam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String captchaParam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String headerToken() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loginUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean enableCaptcha() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int maxClfCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int captchaLenth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String captchaSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String captchaType() {
		// TODO Auto-generated method stub
		return null;
	}

}
