// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains one or more stored comments for use as feedback to buyers.
 * 
 */
public class FeedbackCommentArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "StoredCommentText")
	@Order(value=0)
	public List<String> storedCommentText;	
	
    
}