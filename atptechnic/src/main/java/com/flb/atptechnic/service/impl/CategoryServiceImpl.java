package com.flb.atptechnic.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import com.flb.base.page.PageSet;
import com.flb.base.common.ObjectUtils;
import com.flb.atptechnic.dao.CategoryDao;
import com.flb.atptechnic.model.Category;
import com.flb.atptechnic.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public Category createCategory(Category category) 
	{
		Assert.notNull(category);
		
		category.setCreateTime(System.currentTimeMillis());
		categoryDao.insert(category);
		
		return category;
	}
	
	@Override
	public Category modifyCategory(Category category) 
	{
		Assert.notNull(category);
		
		category.setLastAccess(System.currentTimeMillis());
		categoryDao.update(category);
		
		return category;
	}

	@Override
	public void removeCategory(long id) 
	{
		categoryDao.deleteById(id);
	}

	@Override
	public Category findCategory(long id) 
	{
		return categoryDao.findById(id);
	}

	@Override
	public PageSet<Category> queryPage(Map<String, Object> params, int pageno,
			int pagesize) 
	{
		PageSet<Category> page = null;

		if(ObjectUtils.isNull(params))
		{
			params = new HashMap<String, Object>();
		}
		
		int count = categoryDao.count(params);

		if (count > 0)
		{
			page = PageSet.createPageSet(count, pageno, pagesize == 0 ? count : pagesize);
			
			params.put("start", page.getStartRow());
			params.put("count", page.getPageSize());
			
			List<Category> categorys = categoryDao.query(params);
			
			if(ObjectUtils.notEmpty(categorys))
			{
				page.setPageData(categorys);
			}
		}
		
		return page;
	}

	@Override
	public List<Category> query(Map<String, Object> params)
	{
		return categoryDao.query(params);
	}

}
