// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Response for adding a Selling Manager product.
 * 
 */
@RootElement(name = "AddSellingManagerProductResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSellingManagerProductResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingManagerProductDetails")
	@Order(value=0)
	public SellingManagerProductDetailsType sellingManagerProductDetails;	
	
    
}