package com.flb.atptechnic.model;

import com.flb.base.model.BaseEntity;

/**
 * Product
 * 
 */
public class Product extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	/**产品编码*/
	private String code;
	/**产品名称*/
	private String name;
	/**标题*/
	private String title;
	/**分类*/
	private Long categoryId;
	/**参考价*/
	private Double price;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
