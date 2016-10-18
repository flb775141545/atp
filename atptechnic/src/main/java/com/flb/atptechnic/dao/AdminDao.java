package com.flb.atptechnic.dao;

import org.springframework.stereotype.Repository;
import com.flb.atptechnic.model.Admin;
import com.flb.base.dao.BaseDao;
/**
 * Dao：持久层接口
 * @author Flb
 *
 */
@Repository("adminDao")
public interface AdminDao extends BaseDao<Admin> {
	
}