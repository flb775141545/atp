package com.flb.atptechnic.service;

import java.util.List;
import java.util.Map;
import com.flb.base.page.PageSet;
import com.flb.atptechnic.model.Product;

public interface ProductService
{
	/**
	 * 新增
	 * 
	 * @param product
	 * @return
	 */
	Product createProduct(Product product);
	
	/**
	 * 修改
	 * 
	 * @param product
	 * @return
	 */
	Product modifyProduct(Product product);
	
	/**
	 * 删除
	 * 
	 * @param id
	 */
	void removeProduct(long id);

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	Product findProduct(long id);

	/**
	 * 分页查询
	 * 
	 * @param params
	 * @param pageno
	 * @param pagesize
	 * @return
	 */
	PageSet<Product> queryPage(Map<String, Object> params, int pageno, int pagesize);
	
	/**
	 * 查询列表
	 * @param params
	 * @return
	 */
	List<Product> query(Map<String, Object> params);
	
}
