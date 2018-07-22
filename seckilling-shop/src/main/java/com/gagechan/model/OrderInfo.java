package com.gagechan.model;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月22日 11:29
 *
 * @description:
 **/

@Data
@TableName("sck_order_info")
public class OrderInfo implements Serializable {

	private static final long serialVersionUID = 1791399200476804240L;

	private long id;
	private long userId;
	private long goodsId;
	private long deliveryAddressId;
	private String goodsName;
	private Integer goodsCount;
	private BigDecimal goodsPrice;
	private Integer orderChannel;
	private Integer status;
	private Date createDate;
	private Date payDate;

}
