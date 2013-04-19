// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains values indicating template information for a newly-exported item.
 * 
 */
@RootElement(name = "AddSellingManagerTemplateResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddSellingManagerTemplateResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CategoryID")
	@Order(value=0)
	public Long categoryID;	
	
	@Element(name = "Category2ID")
	@Order(value=1)
	public Long category2ID;	
	
	@Element(name = "SaleTemplateID")
	@Order(value=2)
	public Long saleTemplateID;	
	
	@Element(name = "SaleTemplateGroupID")
	@Order(value=3)
	public Long saleTemplateGroupID;	
	
	@Element(name = "SaleTemplateName")
	@Order(value=4)
	public String saleTemplateName;	
	
	@Element(name = "SellingManagerProductDetails")
	@Order(value=5)
	public SellingManagerProductDetailsType sellingManagerProductDetails;	
	
	@Element(name = "Fees")
	@Order(value=6)
	public FeesType fees;	
	
    
}