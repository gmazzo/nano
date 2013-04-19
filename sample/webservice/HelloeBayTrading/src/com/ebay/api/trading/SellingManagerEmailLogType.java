// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Contains list of Email log.
 * 
 */
public class SellingManagerEmailLogType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EmailType")
	@Order(value=0)
	public SellingManagerEmailTypeCodeType emailType;	
	
	@Element(name = "CustomEmailName")
	@Order(value=1)
	public String customEmailName;	
	
	@Element(name = "EmailState")
	@Order(value=2)
	public SellingManagerEmailSentStatusCodeType emailState;	
	
	@Element(name = "EventTime")
	@Order(value=3)
	public Date eventTime;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}