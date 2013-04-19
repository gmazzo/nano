// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the TaxDetails container, which consists of detailed sales tax
 *  information for an order line item, including the tax type and description, sales tax
 *  on the item cost, and sales tax related to shipping and handling. The information in
 *  this container supercedes/overrides the sales tax information in the
 *  ShippingDetails.SalesTax container.
 * 
 */
public class TaxDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Imposition")
	@Order(value=0)
	public TaxTypeCodeType imposition;	
	
	@Element(name = "TaxDescription")
	@Order(value=1)
	public TaxDescriptionCodeType taxDescription;	
	
	@Element(name = "TaxAmount")
	@Order(value=2)
	public AmountType taxAmount;	
	
	@Element(name = "TaxOnSubtotalAmount")
	@Order(value=3)
	public AmountType taxOnSubtotalAmount;	
	
	@Element(name = "TaxOnShippingAmount")
	@Order(value=4)
	public AmountType taxOnShippingAmount;	
	
	@Element(name = "TaxOnHandlingAmount")
	@Order(value=5)
	public AmountType taxOnHandlingAmount;	
	
	@AnyElement
	@Order(value=6)
	public List<Object> any;	
	
    
}