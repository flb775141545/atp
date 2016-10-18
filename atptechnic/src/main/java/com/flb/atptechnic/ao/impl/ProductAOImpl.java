package com.flb.atptechnic.ao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.atptechnic.AdminContext;
import com.flb.atptechnic.ao.ProductAO;
import com.flb.atptechnic.dto.ProductDTO;
import com.flb.atptechnic.model.Product;
import com.flb.atptechnic.service.ProductService;
import com.flb.base.common.NumberUtils;
import com.flb.base.page.PageSet;

@Service("productAO")
public class ProductAOImpl implements ProductAO
{
	@Autowired
	private ProductService productService;
	
	@Override
	public PageSet<Product> pageProduct(Map<String, Object> params, int pageNo,
			int pageSize)
	{
		return productService.queryPage(params, pageNo, pageSize);
	}

	@Override
	public void saveProduct(AdminContext context, ProductDTO dto)
	{
		productService.createProduct(assemblyProduct(context, dto));
	}

	@Override
	public Product queryById(String id)
	{
		return productService.findProduct(NumberUtils.parseLong(id));
	}

	@Override
	public void updateProduct(AdminContext context, ProductDTO dto)
	{
		productService.modifyProduct(assemblyProduct(context, dto));
	}

	@Override
	public void deleteById(String id)
	{
		productService.removeProduct(NumberUtils.parseLong(id));
	}

	private Product assemblyProduct(AdminContext context, ProductDTO dto){
		Product product = new Product();
		
		return product;
	}
}
