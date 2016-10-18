package com.flb.atptechnic.dao;

import org.springframework.stereotype.Repository;
import com.flb.atptechnic.model.Category;
import com.flb.base.dao.BaseDao;
/**
 * Dao：持久层接口
 * @author Flb
 *
 */
@Repository("categoryDao")
public interface CategoryDao extends BaseDao<Category> {
	
}