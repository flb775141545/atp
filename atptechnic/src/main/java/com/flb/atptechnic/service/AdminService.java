package com.flb.atptechnic.service;

import java.util.List;
import java.util.Map;
import com.flb.base.page.PageSet;
import com.flb.atptechnic.model.Admin;

public interface AdminService
{
	/**
	 * 新增
	 * 
	 * @param admin
	 * @return
	 */
	Admin createAdmin(Admin admin);
	
	/**
	 * 修改
	 * 
	 * @param admin
	 * @return
	 */
	Admin modifyAdmin(Admin admin);
	
	/**
	 * 删除
	 * 
	 * @param id
	 */
	void removeAdmin(long id);

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	Admin findAdmin(long id);

	/**
	 * 分页查询
	 * 
	 * @param params
	 * @param pageno
	 * @param pagesize
	 * @return
	 */
	PageSet<Admin> queryPage(Map<String, Object> params, int pageno, int pagesize);
	
	/**
	 * 查询列表
	 * @param params
	 * @return
	 */
	List<Admin> query(Map<String, Object> params);
	
}
