package com.gagechan.model;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月22日 11:28
 *
 * @description:
 **/
@Data
@TableName("sck_order")
public class Order implements Serializable {

	private static final long serialVersionUID = -6599682977848398933L;

	private long id;
	private long userId;
	private long orderId;
	private long goodsId;
}
