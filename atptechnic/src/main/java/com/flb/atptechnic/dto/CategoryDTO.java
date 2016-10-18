package com.flb.atptechnic.dto;

/**
 * Category
 * 
 */
public class CategoryDTO{
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
