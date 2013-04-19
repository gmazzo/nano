// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated as the Bid Assistant feature is no longer available.
 *  
 * 
 */
public class BidGroupItemType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Item")
	@Order(value=0)
	public ItemType item;	
	
	@Element(name = "BidGroupItemStatus")
	@Order(value=1)
	public BidGroupItemStatusCodeType bidGroupItemStatus;	
	
	@Element(name = "MaxBidAmount")
	@Order(value=2)
	public AmountType maxBidAmount;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}