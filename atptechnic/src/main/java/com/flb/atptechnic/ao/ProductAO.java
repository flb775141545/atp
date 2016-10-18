package com.flb.atptechnic.ao;

import java.util.Map;

import com.flb.atptechnic.AdminContext;
import com.flb.atptechnic.dto.ProductDTO;
import com.flb.atptechnic.model.Product;
import com.flb.base.page.PageSet;

public interface ProductAO{

	/**
	 * 分页查询
	 * @param params
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PageSet<Product> pageProduct(Map<String, Object> params, int pageNo, int pageSize);

	/**
	 * 保存
	 * @param adminContext
	 * @param dto
	 */
	void saveProduct(AdminContext context, ProductDTO dto);

	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	Product queryById(String id);

	/**
	 * 修改
	 * @param adminContext
	 * @param dto
	 */
	void updateProduct(AdminContext context, ProductDTO dto);

	/**
	 * 根据ID删除
	 * @param id
	 */
	void deleteById(String id);

}
