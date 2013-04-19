// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves the data for one or more Selling Manager sale records.
 * <br><br>
 * The standard Trading API
 * deprecation process is not applicable to this call.
 * 
 */
@RootElement(name = "GetSellingManagerSaleRecordRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerSaleRecordRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "TransactionID")
	@Order(value=1)
	public String transactionID;	
	
	@Element(name = "OrderID")
	@Order(value=2)
	public String orderID;	
	
	@Element(name = "OrderLineItemID")
	@Order(value=3)
	public String orderLineItemID;	
	
    
}