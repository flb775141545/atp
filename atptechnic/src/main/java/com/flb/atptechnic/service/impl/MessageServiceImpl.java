package com.flb.atptechnic.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import com.flb.base.page.PageSet;
import com.flb.base.common.ObjectUtils;
import com.flb.atptechnic.dao.MessageDao;
import com.flb.atptechnic.model.Message;
import com.flb.atptechnic.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService
{
	@Autowired
	private MessageDao messageDao;

	@Override
	public Message createMessage(Message message) 
	{
		Assert.notNull(message);
		
		message.setCreateTime(System.currentTimeMillis());
		messageDao.insert(message);
		
		return message;
	}
	
	@Override
	public Message modifyMessage(Message message) 
	{
		Assert.notNull(message);
		
		message.setLastAccess(System.currentTimeMillis());
		messageDao.update(message);
		
		return message;
	}

	@Override
	public void removeMessage(long id) 
	{
		messageDao.deleteById(id);
	}

	@Override
	public Message findMessage(long id) 
	{
		return messageDao.findById(id);
	}

	@Override
	public PageSet<Message> queryPage(Map<String, Object> params, int pageno,
			int pagesize) 
	{
		PageSet<Message> page = null;

		if(ObjectUtils.isNull(params))
		{
			params = new HashMap<String, Object>();
		}
		
		int count = messageDao.count(params);

		if (count > 0)
		{
			page = PageSet.createPageSet(count, pageno, pagesize == 0 ? count : pagesize);
			
			params.put("start", page.getStartRow());
			params.put("count", page.getPageSize());
			
			List<Message> messages = messageDao.query(params);
			
			if(ObjectUtils.notEmpty(messages))
			{
				page.setPageData(messages);
			}
		}
		
		return page;
	}

	@Override
	public List<Message> query(Map<String, Object> params)
	{
		return messageDao.query(params);
	}

}
