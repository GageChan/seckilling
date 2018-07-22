package com.gagechan.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月22日 11:13
 *
 * @description:
 **/
@Data
@TableName("sck_goods")
public class Goods implements Serializable {

	private static final long serialVersionUID = -2346241087979741194L;

	private long id;
//	@TableField("goods_name")
	private String goodsName;
//	@TableField("goods_title")
	private String goodsTitle;
//	@TableField("goods_img")
	private String goodsImg;
//	@TableField("goods_detal")
	private String goodsDetail;
//	@TableField("goods_price")
	private BigDecimal goodsPrice;
//	@TableField("goods_stock")
	private Integer goodsStock;
}
