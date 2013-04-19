// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 *         The status of gallery image generation. That status will return either a value of 'Success' or
 *         a value that indicates why the gallery image has not been generated.
 *       
 */
public enum GalleryStatusCodeType {

    /**
     * 
   *             Gallery Image successfully generated.
   *           
     */
    SUCCESS("Success"),
  

    /**
     * 
   *             Gallery image has not yet been generated.
   *           
     */
    PENDING("Pending"),
  

    /**
     * 
   *             The URL for the image is not valid.
   *           
     */
    INVALID_URL("InvalidUrl"),
  

    /**
     * 
   *             URL does not start with http:// - That is the only protocol currently supported for pictures.
   *           
     */
    INVALID_PROTOCOL("InvalidProtocol"),
  

    /**
     * 
   *             There is a problem with the file containing the image.
   *           
     */
    INVALID_FILE("InvalidFile"),
  

    /**
     * 
   *             The server containing your image was unavailable when we tried to retrieve it.
   *           
     */
    SERVER_DOWN("ServerDown"),
  

    /**
     * 
   *             We could not find your Gallery image when we went to retrieve it.
   *           
     */
    IMAGE_NON_EXISTENT("ImageNonExistent"),
  

    /**
     * 
   *             The image failed to come across the Internet when we tried to retrieve it.
   *           
     */
    IMAGE_READ_TIME_OUT("ImageReadTimeOut"),
  

    /**
     * 
   *             The file containing your image is not in standard jpeg, bmp, or tif format.
   *           
     */
    INVALID_FILE_FORMAT("InvalidFileFormat"),
  

    /**
     * 
   *             We were not able to process the image.
   *           
     */
    IMAGE_PROCESSING_ERROR("ImageProcessingError"),
  

    /**
     * 
   *             Reserved for internal or future use.
   *           
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    GalleryStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static GalleryStatusCodeType fromValue(String v) {
        if (v != null) {
            for (GalleryStatusCodeType c: GalleryStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}