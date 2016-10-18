package com.flb.atptechnic.dao;

import org.springframework.stereotype.Repository;
import com.flb.atptechnic.model.Message;
import com.flb.base.dao.BaseDao;
/**
 * Dao：持久层接口
 * @author Flb
 *
 */
@Repository("messageDao")
public interface MessageDao extends BaseDao<Message> {
	
}