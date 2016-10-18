package com.flb.atptechnic.service;

import java.util.List;
import java.util.Map;
import com.flb.base.page.PageSet;
import com.flb.atptechnic.model.Picture;

public interface PictureService
{
	/**
	 * 新增
	 * 
	 * @param picture
	 * @return
	 */
	Picture createPicture(Picture picture);
	
	/**
	 * 修改
	 * 
	 * @param picture
	 * @return
	 */
	Picture modifyPicture(Picture picture);
	
	/**
	 * 删除
	 * 
	 * @param id
	 */
	void removePicture(long id);

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	Picture findPicture(long id);

	/**
	 * 分页查询
	 * 
	 * @param params
	 * @param pageno
	 * @param pagesize
	 * @return
	 */
	PageSet<Picture> queryPage(Map<String, Object> params, int pageno, int pagesize);
	
	/**
	 * 查询列表
	 * @param params
	 * @return
	 */
	List<Picture> query(Map<String, Object> params);
	
}
