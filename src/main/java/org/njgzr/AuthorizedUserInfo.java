package org.njgzr;

import java.util.Date;
import java.util.Set;

import org.njgzr.security.base.AuthorizedUser;

import lombok.Data;

/**
*@author Mr Gu [admin@njgzr.org]
*@version Dec 23, 2019 , 5:10:04 PM
*/
@Data
public class AuthorizedUserInfo implements AuthorizedUser {
	
	private Long id;
	
	private String loginName;
	
	private String displayName;
	
	private Date expireTime;
	
	private String mobile;
	
	private String ip;
	
	private boolean isLocked;
	
	private boolean isDisable;
	
	private Long orgId;
	
	private Set<String> permissions;
	
	private Set<String> roles;
	
	private Set<String> menus;
	
	@Override
	public Set<String> getStringRoles() {
		return roles;
	}

	@Override
	public Set<String> getStringPermissions() {
		return permissions;
	}

	@Override
	public Long getOrganizationId() {
		return orgId;
	}

}
