package com.flb.atptechnic.dto;

/**
 * Picture
 * 
 */
public class PictureDTO{
	/**产品ID*/
	private Long productId;
	/**图片地址*/
	private String url;
	/**是否主图*/
	private int isMain;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getIsMain() {
		return isMain;
	}
	public void setIsMain(int isMain) {
		this.isMain = isMain;
	}
}
