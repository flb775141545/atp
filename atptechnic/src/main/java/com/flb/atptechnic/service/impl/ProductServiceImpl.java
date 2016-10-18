package com.flb.atptechnic.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import com.flb.base.page.PageSet;
import com.flb.base.common.ObjectUtils;
import com.flb.atptechnic.dao.ProductDao;
import com.flb.atptechnic.model.Product;
import com.flb.atptechnic.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductDao productDao;

	@Override
	public Product createProduct(Product product) 
	{
		Assert.notNull(product);
		
		product.setCreateTime(System.currentTimeMillis());
		productDao.insert(product);
		
		return product;
	}
	
	@Override
	public Product modifyProduct(Product product) 
	{
		Assert.notNull(product);
		
		product.setLastAccess(System.currentTimeMillis());
		productDao.update(product);
		
		return product;
	}

	@Override
	public void removeProduct(long id) 
	{
		productDao.deleteById(id);
	}

	@Override
	public Product findProduct(long id) 
	{
		return productDao.findById(id);
	}

	@Override
	public PageSet<Product> queryPage(Map<String, Object> params, int pageno,
			int pagesize) 
	{
		PageSet<Product> page = null;

		if(ObjectUtils.isNull(params))
		{
			params = new HashMap<String, Object>();
		}
		
		int count = productDao.count(params);

		if (count > 0)
		{
			page = PageSet.createPageSet(count, pageno, pagesize == 0 ? count : pagesize);
			
			params.put("start", page.getStartRow());
			params.put("count", page.getPageSize());
			
			List<Product> products = productDao.query(params);
			
			if(ObjectUtils.notEmpty(products))
			{
				page.setPageData(products);
			}
		}
		
		return page;
	}

	@Override
	public List<Product> query(Map<String, Object> params)
	{
		return productDao.query(params);
	}

}
