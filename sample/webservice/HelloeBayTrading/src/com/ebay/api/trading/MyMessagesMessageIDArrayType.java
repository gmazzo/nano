// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains a list of up to 10 MessageID values.
 * 
 */
public class MyMessagesMessageIDArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MessageID")
	@Order(value=0)
	public List<String> messageID;	
	
    
}