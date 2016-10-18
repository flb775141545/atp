package com.flb.atptechnic.exception;

import com.flb.base.Exception.BaseException;

/**
 * 异常类
 * 
 * @author wuxiaoping
 *
 */
public class MessageException extends BaseException
{
	private static final long serialVersionUID = 1L;

	public MessageException(int code, Object[] params)
	{
		super(code, params);
	}

}
