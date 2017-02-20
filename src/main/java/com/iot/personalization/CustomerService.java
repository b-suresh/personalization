/**
 * 
 */
package com.iot.personalization;

import java.io.Serializable;

/**
 * @author bsuresh
 *
 */
public interface CustomerService extends Serializable{
	public String getCustomerNameFromCustomerIdentity( CustomerIdentity identity );
	public void addCustomer( Customer customer);
}
