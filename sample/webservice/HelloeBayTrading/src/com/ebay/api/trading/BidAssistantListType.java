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
public class BidAssistantListType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BidGroupID")
	@Order(value=0)
	public Long bidGroupID;	
	
	@Element(name = "IncludeNotes")
	@Order(value=1)
	public Boolean includeNotes;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}