/**
 * 
 */
package com.iot.personalization;

/**
 * @author bsuresh
 *
 */
public class CustomerIdentity {
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	private String customerId;
	private String rfid;
	
	public CustomerIdentity(){}

}
