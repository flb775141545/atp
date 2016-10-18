package com.flb.atptechnic.service;

import java.util.List;
import java.util.Map;
import com.flb.base.page.PageSet;
import com.flb.atptechnic.model.Category;

public interface CategoryService
{
	/**
	 * 新增
	 * 
	 * @param category
	 * @return
	 */
	Category createCategory(Category category);
	
	/**
	 * 修改
	 * 
	 * @param category
	 * @return
	 */
	Category modifyCategory(Category category);
	
	/**
	 * 删除
	 * 
	 * @param id
	 */
	void removeCategory(long id);

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	Category findCategory(long id);

	/**
	 * 分页查询
	 * 
	 * @param params
	 * @param pageno
	 * @param pagesize
	 * @return
	 */
	PageSet<Category> queryPage(Map<String, Object> params, int pageno, int pagesize);
	
	/**
	 * 查询列表
	 * @param params
	 * @return
	 */
	List<Category> query(Map<String, Object> params);
	
}
