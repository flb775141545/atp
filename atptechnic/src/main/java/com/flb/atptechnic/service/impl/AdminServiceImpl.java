package com.flb.atptechnic.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import com.flb.base.page.PageSet;
import com.flb.base.common.ObjectUtils;
import com.flb.atptechnic.dao.AdminDao;
import com.flb.atptechnic.model.Admin;
import com.flb.atptechnic.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminDao adminDao;

	@Override
	public Admin createAdmin(Admin admin) 
	{
		Assert.notNull(admin);
		
		admin.setCreateTime(System.currentTimeMillis());
		adminDao.insert(admin);
		
		return admin;
	}
	
	@Override
	public Admin modifyAdmin(Admin admin) 
	{
		Assert.notNull(admin);
		
		admin.setLastAccess(System.currentTimeMillis());
		adminDao.update(admin);
		
		return admin;
	}

	@Override
	public void removeAdmin(long id) 
	{
		adminDao.deleteById(id);
	}

	@Override
	public Admin findAdmin(long id) 
	{
		return adminDao.findById(id);
	}

	@Override
	public PageSet<Admin> queryPage(Map<String, Object> params, int pageno,
			int pagesize) 
	{
		PageSet<Admin> page = null;

		if(ObjectUtils.isNull(params))
		{
			params = new HashMap<String, Object>();
		}
		
		int count = adminDao.count(params);

		if (count > 0)
		{
			page = PageSet.createPageSet(count, pageno, pagesize == 0 ? count : pagesize);
			
			params.put("start", page.getStartRow());
			params.put("count", page.getPageSize());
			
			List<Admin> admins = adminDao.query(params);
			
			if(ObjectUtils.notEmpty(admins))
			{
				page.setPageData(admins);
			}
		}
		
		return page;
	}

	@Override
	public List<Admin> query(Map<String, Object> params)
	{
		return adminDao.query(params);
	}

}
