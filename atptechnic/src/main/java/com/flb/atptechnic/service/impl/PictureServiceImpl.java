package com.flb.atptechnic.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import com.flb.base.page.PageSet;
import com.flb.base.common.ObjectUtils;
import com.flb.atptechnic.dao.PictureDao;
import com.flb.atptechnic.model.Picture;
import com.flb.atptechnic.service.PictureService;

@Service("pictureService")
public class PictureServiceImpl implements PictureService
{
	@Autowired
	private PictureDao pictureDao;

	@Override
	public Picture createPicture(Picture picture) 
	{
		Assert.notNull(picture);
		
		picture.setCreateTime(System.currentTimeMillis());
		pictureDao.insert(picture);
		
		return picture;
	}
	
	@Override
	public Picture modifyPicture(Picture picture) 
	{
		Assert.notNull(picture);
		
		picture.setLastAccess(System.currentTimeMillis());
		pictureDao.update(picture);
		
		return picture;
	}

	@Override
	public void removePicture(long id) 
	{
		pictureDao.deleteById(id);
	}

	@Override
	public Picture findPicture(long id) 
	{
		return pictureDao.findById(id);
	}

	@Override
	public PageSet<Picture> queryPage(Map<String, Object> params, int pageno,
			int pagesize) 
	{
		PageSet<Picture> page = null;

		if(ObjectUtils.isNull(params))
		{
			params = new HashMap<String, Object>();
		}
		
		int count = pictureDao.count(params);

		if (count > 0)
		{
			page = PageSet.createPageSet(count, pageno, pagesize == 0 ? count : pagesize);
			
			params.put("start", page.getStartRow());
			params.put("count", page.getPageSize());
			
			List<Picture> pictures = pictureDao.query(params);
			
			if(ObjectUtils.notEmpty(pictures))
			{
				page.setPageData(pictures);
			}
		}
		
		return page;
	}

	@Override
	public List<Picture> query(Map<String, Object> params)
	{
		return pictureDao.query(params);
	}

}
