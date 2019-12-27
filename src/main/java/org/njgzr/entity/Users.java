package org.njgzr.entity;

import java.io.Serializable;
import java.util.Date;

import org.njgzr.security.base.Password;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-12-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;
    
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    
    private String name;
    
    private String pwd;

    private String salt;

    @TableField("dept_id")
    private Long deptId;

    private String email;

    private String mobile;

    @TableField("wechat_openid")
    private String wechatOpenid;

    @TableField("role_id")
    private Long roleId;

    @TableField("real_name")
    private String realName;

    @TableField("is_work")
    private Integer isWork;

    private String no;

    @TableField("create_time")
    private Date createTime;

    @TableField("last_update_time")
    private Date lastUpdateTime;

    @TableField("last_login_addr")
    private String lastLoginAddr;

    @TableField("last_login_ip")
    private String lastLoginIp;

    @TableField("last_login_time")
    private Date lastLoginTime;

    private Integer version;

    @TableField("head_img")
    private String headImg;

    @TableField("qq_openid")
    private String qqOpenid;

    @TableField("weibo_openid")
    private String weiboOpenid;

    @TableField("qq_image")
    private String qqImage;

    @TableField("qq_name")
    private String qqName;

    @TableField("wechat_image")
    private String wechatImage;

    @TableField("wechat_name")
    private String wechatName;

    @TableField("weibo_image")
    private String weiboImage;

    @TableField("weibo_name")
    private String weiboName;

    private Integer sex;

    @TableField("taobao_image")
    private String taobaoImage;

    @TableField("taobao_name")
    private String taobaoName;

    @TableField("taobao_openid")
    private String taobaoOpenid;

    @TableField("display_name")
    private String displayName;

    @TableField("login_way")
    private String loginWay;

    @TableField("baidu_image")
    private String baiduImage;

    @TableField("baidu_name")
    private String baiduName;

    @TableField("baidu_openid")
    private String baiduOpenid;

    private String img;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    
    public Password getPwd() {
    	return Password.parse(pwd);
    }
    
}
