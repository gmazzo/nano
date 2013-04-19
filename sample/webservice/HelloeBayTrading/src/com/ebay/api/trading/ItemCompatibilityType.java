// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * All information corresponding to an individual compatibility by application.
 * 
 */
public class ItemCompatibilityType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Delete")
	@Order(value=0)
	public Boolean delete;	
	
	@Element(name = "NameValueList")
	@Order(value=1)
	public List<NameValueListType> nameValueList;	
	
	@Element(name = "CompatibilityNotes")
	@Order(value=2)
	public String compatibilityNotes;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}