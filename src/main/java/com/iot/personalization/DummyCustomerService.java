/**
 * 
 */
package com.iot.personalization;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bsuresh
 *
 */
public class DummyCustomerService implements CustomerService {
	
	private Map<String,String> rfidToCustomerNameMap = new HashMap();
	
	public DummyCustomerService(){
		rfidToCustomerNameMap.put("123", "Suresh Balasubramanian");
		rfidToCustomerNameMap.put("0004872566", "Vignesh Suresh");
		rfidToCustomerNameMap.put("0004872567", "Vidya Suresh");
	}
	
	public String getCustomerNameFromCustomerIdentity( CustomerIdentity identity ) {
		System.out.println("Getting customer name for rfid"+identity.getRfid());
		String name = (String)rfidToCustomerNameMap.get(identity.getRfid());
		System.out.println("Found name:"+name);
		return name;
		
	}

	public void addCustomer(Customer customer) {
		System.out.println("Adding rfid:"+customer.getIdentity().getRfid()+":name:"+customer.getName());
		rfidToCustomerNameMap.put(customer.getIdentity().getRfid(), customer.getName());
	}

}
