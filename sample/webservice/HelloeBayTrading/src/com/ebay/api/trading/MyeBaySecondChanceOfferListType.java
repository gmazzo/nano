// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *  A list of possible My eBay Second Chance Offers.
 * 
 */
public class MyeBaySecondChanceOfferListType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TotalAvailable")
	@Order(value=0)
	public Integer totalAvailable;	
	
	@Element(name = "SecondChanceOffer")
	@Order(value=1)
	public List<ItemType> secondChanceOffer;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}