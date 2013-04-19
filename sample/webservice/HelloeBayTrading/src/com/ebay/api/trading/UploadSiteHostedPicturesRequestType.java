// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Uploads a picture for a listing and returns a URL for the picture.
 * 
 */
@RootElement(name = "UploadSiteHostedPicturesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class UploadSiteHostedPicturesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PictureName")
	@Order(value=0)
	public String pictureName;	
	
	@Element(name = "PictureSystemVersion")
	@Order(value=1)
	public Integer pictureSystemVersion;	
	
	@Element(name = "PictureSet")
	@Order(value=2)
	public PictureSetCodeType pictureSet;	
	
	@Element(name = "PictureData")
	@Order(value=3)
	public Base64BinaryType pictureData;	
	
	@Element(name = "PictureUploadPolicy")
	@Order(value=4)
	public PictureUploadPolicyCodeType pictureUploadPolicy;	
	
	@Element(name = "ExternalPictureURL")
	@Order(value=5)
	public List<String> externalPictureURL;	
	
	@Element(name = "PictureWatermark")
	@Order(value=6)
	public List<PictureWatermarkCodeType> pictureWatermark;	
	
	@Element(name = "ExtensionInDays")
	@Order(value=7)
	public Integer extensionInDays;	
	
    
}