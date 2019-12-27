package org.njgzr.dao;

import org.njgzr.entity.Users;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-12-26
 */
public interface UsersMapper extends BaseMapper<Users> {
	
	Users getUsersByName(String name);
	
}
