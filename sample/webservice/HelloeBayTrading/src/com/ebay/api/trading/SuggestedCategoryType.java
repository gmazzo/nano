// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *       Defines a suggested category, returned
 *       in response to a search for categories that contain
 *       listings with certain keywords in their titles and descriptions.
 *     
 */
public class SuggestedCategoryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Category")
	@Order(value=0)
	public CategoryType category;	
	
	@Element(name = "PercentItemFound")
	@Order(value=1)
	public int percentItemFound;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}