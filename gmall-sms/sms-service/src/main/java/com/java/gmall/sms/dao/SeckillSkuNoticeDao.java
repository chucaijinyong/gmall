package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SeckillSkuNotice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
@Mapper
public interface SeckillSkuNoticeDao extends BaseMapper<SeckillSkuNotice> {
	
}
