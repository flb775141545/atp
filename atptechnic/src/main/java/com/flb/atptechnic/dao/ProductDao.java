package com.flb.atptechnic.dao;

import org.springframework.stereotype.Repository;
import com.flb.atptechnic.model.Product;
import com.flb.base.dao.BaseDao;
/**
 * Dao：持久层接口
 * @author Flb
 *
 */
@Repository("productDao")
public interface ProductDao extends BaseDao<Product> {
	
}