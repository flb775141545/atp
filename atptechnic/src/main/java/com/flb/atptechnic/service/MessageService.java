package com.flb.atptechnic.service;

import java.util.List;
import java.util.Map;
import com.flb.base.page.PageSet;
import com.flb.atptechnic.model.Message;

public interface MessageService
{
	/**
	 * 新增
	 * 
	 * @param message
	 * @return
	 */
	Message createMessage(Message message);
	
	/**
	 * 修改
	 * 
	 * @param message
	 * @return
	 */
	Message modifyMessage(Message message);
	
	/**
	 * 删除
	 * 
	 * @param id
	 */
	void removeMessage(long id);

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	Message findMessage(long id);

	/**
	 * 分页查询
	 * 
	 * @param params
	 * @param pageno
	 * @param pagesize
	 * @return
	 */
	PageSet<Message> queryPage(Map<String, Object> params, int pageno, int pagesize);
	
	/**
	 * 查询列表
	 * @param params
	 * @return
	 */
	List<Message> query(Map<String, Object> params);
	
}
