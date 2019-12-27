package org.njgzr.config;

import org.njgzr.AuthorizedUserInfo;
import org.njgzr.entity.Users;
import org.njgzr.security.base.AuthorizedUser;
import org.njgzr.security.base.Password;
import org.njgzr.security.interfaces.SecurityService;
import org.njgzr.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import lombok.extern.slf4j.Slf4j;

/**
*@author Mr Gu [admin@njgzr.org]
*@version Dec 23, 2019 , 4:55:00 PM
*/
@Service
@Slf4j
public class SecurityServiceImpl implements SecurityService {

	@Override
	public AuthorizedUser findByPrincipal(Object principal) {
		if (principal instanceof String) {
			
			Users user = usersService.selectOne(new EntityWrapper<Users>().eq("name", principal));
			if (user == null)
				return null;
			
			AuthorizedUserInfo info = new AuthorizedUserInfo();
			info.setId(user.getId());
			info.setLoginName(user.getName());
			info.setMobile(user.getMobile());
			info.setOrgId(user.getDeptId());
			info.setPermissions(null);
			info.setRoles(null);
			log.info(info.toString());
			return info;
		}
		return null;
	}

	@Override
	public Password findPassword(AuthorizedUser authorizedUser) {
		Users user = usersService.selectById(authorizedUser.getId());
		return user == null ? null : user.getPwd();
	}
	
	@Autowired
	private IUsersService usersService;
	
}
