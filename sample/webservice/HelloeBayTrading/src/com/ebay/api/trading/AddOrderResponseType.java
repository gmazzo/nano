// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.Date;

/**
 * 
 * Returns a unique identifier for the order. A buyer may make a single
 * payment to purchase all of the order line items included
 * in the order.
 * 
 */
@RootElement(name = "AddOrderResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddOrderResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "OrderID")
	@Order(value=0)
	public String orderID;	
	
	@Element(name = "CreatedTime")
	@Order(value=1)
	public Date createdTime;	
	
    
}