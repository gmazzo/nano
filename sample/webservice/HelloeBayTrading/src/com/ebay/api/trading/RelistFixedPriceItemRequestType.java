// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Enables a seller to take a single fixed-price item (or a single multi-item
 * listing) that has ended and re-list it on a specified eBay site.
 * 
 */
@RootElement(name = "RelistFixedPriceItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RelistFixedPriceItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Item")
	@Order(value=0)
	public ItemType item;	
	
	@Element(name = "DeletedField")
	@Order(value=1)
	public List<String> deletedField;	
	
    
}