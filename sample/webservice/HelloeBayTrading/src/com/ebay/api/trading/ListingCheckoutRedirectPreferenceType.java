// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * ProStores listing level preferences.
 * 
 */
public class ListingCheckoutRedirectPreferenceType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ProStoresStoreName")
	@Order(value=0)
	public String proStoresStoreName;	
	
	@Element(name = "SellerThirdPartyUsername")
	@Order(value=1)
	public String sellerThirdPartyUsername;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}