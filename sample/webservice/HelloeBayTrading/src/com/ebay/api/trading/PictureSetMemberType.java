// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * URL and size information for each generated and stored size.
 * This data is provided for use in application previews of pictures.
 * This data is used for display control for specific pictures in the generated imageset.
 * This container is supplied for all generated pictures.
 * 
 */
public class PictureSetMemberType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MemberURL")
	@Order(value=0)
	public String memberURL;	
	
	@Element(name = "PictureHeight")
	@Order(value=1)
	public Integer pictureHeight;	
	
	@Element(name = "PictureWidth")
	@Order(value=2)
	public Integer pictureWidth;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}