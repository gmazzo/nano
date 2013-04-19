// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * This type defines the <b>QuantityRestrictionPerBuyer</b> container, which is
 * used by the seller to restrict the quantity of items that may be purchased by one buyer
 * during the duration of a fixed-price listing (single or multi-variation).
 * 
 */
public class QuantityRestrictionPerBuyerInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MaximumQuantity")
	@Order(value=0)
	public Integer maximumQuantity;	
	
    
}