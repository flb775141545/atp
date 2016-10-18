package com.flb.atptechnic.dto;

/**
 * Message
 * 
 */
public class MessageDTO{
	/**联系人*/
	private String contract;
	/**联系方式*/
	private String contractNumber;
	/**消息*/
	private String message;
	
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
