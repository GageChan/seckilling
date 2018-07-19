package com.gagechan.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月19日 14:21
 *
 * @description:
 **/
@Data
public class Entity {
	@TableId
	private long id;
	@TableField("create_time")
	private Date createTime;
	@TableField("update_time")
	private Date updateTime;
}
