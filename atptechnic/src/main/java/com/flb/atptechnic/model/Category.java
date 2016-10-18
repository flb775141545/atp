package com.flb.atptechnic.model;

import com.flb.base.model.BaseEntity;

/**
 * Category
 * 
 */
public class Category extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	/**分类编码*/
	private String code;
	/**分类名称*/
	private String name;
	/**上级分类*/
	private Long parentId;
	
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
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
}
