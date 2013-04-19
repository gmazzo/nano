// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 *         The size of images generated.
 *       
 */
public enum PictureSetCodeType {

    /**
     * 
   *             Default value for requests. The size for the standard, 3-picture set for item pictures.
   *           
     */
    STANDARD("Standard"),
  

    /**
     * 
   *             Supersize, 4-picture set.
   *             If you specify this value on input, and this value is returned
   *             in the response, then in AddItem or a related call,
   *             you must specify Item.PictureDetails.PhotoDisplay.Supersize
   *             or Item.PictureDetails.PhotoDisplay.PicturePack.
   *           
     */
    SUPERSIZE("Supersize"),
  

    /**
     * 
   *             When returned as output in the call response, the characters after setid may contain this value
   *             if a Supersize image cannot be generated.
   *             If this value is returned in the response, then in AddItem or a related call,
   *             you must specify Item.PictureDetails.PhotoDisplay.Supersize
   *             or Item.PictureDetails.PhotoDisplay.PicturePack.
   *           
     */
    LARGE("Large"),
  

    /**
     * 
   *             (out) Reserved for internal or future use.
   *           
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PictureSetCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PictureSetCodeType fromValue(String v) {
        if (v != null) {
            for (PictureSetCodeType c: PictureSetCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}