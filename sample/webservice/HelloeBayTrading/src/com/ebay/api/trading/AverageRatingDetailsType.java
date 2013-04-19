// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Applicable to sites that support the Detailed Seller Ratings feature.
 * The AverageRatingDetailsType contains the average detailed seller ratings in an area. When buyers leave an overall Feedback rating (positive, neutral, or negative) for a seller, they also can leave ratings in four areas: item as described, communication, shipping time, and charges for shipping and handling. Users retrieve detailed ratings as averages of the ratings left by buyers.
 * 
 */
public class AverageRatingDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RatingDetail")
	@Order(value=0)
	public FeedbackRatingDetailCodeType ratingDetail;	
	
	@Element(name = "Rating")
	@Order(value=1)
	public Double rating;	
	
	@Element(name = "RatingCount")
	@Order(value=2)
	public Integer ratingCount;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}