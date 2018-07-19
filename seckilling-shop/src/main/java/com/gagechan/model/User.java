package com.gagechan.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月19日 14:19
 *
 * @description:
 **/

@Data
@TableName("sck_user")
public class User extends Entity implements Serializable {
		private String name;
		private String password;
		private String salt;
		@TableField("last_login_time")
		private Date lastLoginTime;
		@TableField("login_count")
		private Integer loginCount;
}
