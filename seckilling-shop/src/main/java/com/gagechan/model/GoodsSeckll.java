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
 * @create: 2018年07月22日 11:25
 *
 * @description:
 **/

@Data
@TableName("sck_goods_seckill")
public class GoodsSeckll implements Serializable {

	private static final long serialVersionUID = 3692782980011717515L;

	private long id;
	private long goodsId;
	private BigDecimal seckillPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
	private Integer version;
}
