package org.robovm.cocoatouch.corelocation;

import org.robovm.cocoatouch.corelocation.CLLocation;
import org.robovm.cocoatouch.corelocation.CLRegion;
import org.robovm.cocoatouch.foundation.NSArray;
import org.robovm.cocoatouch.foundation.NSDictionary;
import org.robovm.cocoatouch.foundation.NSObject;
import org.robovm.cocoatouch.foundation.NSString;
import org.robovm.objc.ObjCClass;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.ObjCSuper;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.BindSelector;
import org.robovm.rt.bro.Bro;
import org.robovm.rt.bro.annotation.Bridge;
import org.robovm.rt.bro.annotation.Callback;
import org.robovm.rt.bro.annotation.Library;

/*<library>*/@Library("CoreLocation")/*</library>*/
public class CLPlacemark extends NSObject {
	static {
		ObjCRuntime.bind(/*<name>*/ CLPlacemark /*</name>*/.class);
	}

	private static final boolean X86 = Bro.IS_X86;
	private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ CLPlacemark /*</name>*/.class);
	
	private static final Selector location = Selector.register("location");
	@Bridge(symbol = "objc_msgSend") private native static CLLocation objc_getLocation(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLLocation objc_getLocationSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public CLLocation getLocation() {
		if (customClass) { return objc_getLocationSuper(getSuper(), location); } else { return objc_getLocation(this, location); }
	}
	
	
	private static final Selector name = Selector.register("name");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getName(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getNameSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getName() {
		if (customClass) { return objc_getNameSuper(getSuper(), name); } else { return objc_getName(this, name); }
	}
	
	
	private static final Selector addressDictionary = Selector.register("addressDictionary");
	@Bridge(symbol = "objc_msgSend") private native static NSDictionary objc_getAddressDictionary(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSDictionary objc_getAddressDictionarySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSDictionary getAddressDictionary() {
		if (customClass) { return objc_getAddressDictionarySuper(getSuper(), addressDictionary); } else { return objc_getAddressDictionary(this, addressDictionary); }
	}
	
	
	private static final Selector ISOcountryCode = Selector.register("ISOcountryCode");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getISOcountryCode(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getISOcountryCodeSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getISOcountryCode() {
		if (customClass) { return objc_getISOcountryCodeSuper(getSuper(), ISOcountryCode); } else { return objc_getISOcountryCode(this, ISOcountryCode); }
	}
	
	
	private static final Selector country = Selector.register("country");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getCountry(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getCountrySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getCountry() {
		if (customClass) { return objc_getCountrySuper(getSuper(), country); } else { return objc_getCountry(this, country); }
	}
	
	
	private static final Selector postalCode = Selector.register("postalCode");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getPostalCode(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getPostalCodeSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getPostalCode() {
		if (customClass) { return objc_getPostalCodeSuper(getSuper(), postalCode); } else { return objc_getPostalCode(this, postalCode); }
	}
	
	
	private static final Selector administrativeArea = Selector.register("administrativeArea");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getAdministrativeArea(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getAdministrativeAreaSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getAdministrativeArea() {
		if (customClass) { return objc_getAdministrativeAreaSuper(getSuper(), administrativeArea); } else { return objc_getAdministrativeArea(this, administrativeArea); }
	}
	
	
	private static final Selector subAdministrativeArea = Selector.register("subAdministrativeArea");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getSubAdministrativeArea(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getSubAdministrativeAreaSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getSubAdministrativeArea() {
		if (customClass) { return objc_getSubAdministrativeAreaSuper(getSuper(), subAdministrativeArea); } else { return objc_getSubAdministrativeArea(this, subAdministrativeArea); }
	}
	
	
	private static final Selector locality = Selector.register("locality");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getLocality(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getLocalitySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getLocality() {
		if (customClass) { return objc_getLocalitySuper(getSuper(), locality); } else { return objc_getLocality(this, locality); }
	}
	
	
	private static final Selector subLocality = Selector.register("subLocality");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getSubLocality(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getSubLocalitySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getSubLocality() {
		if (customClass) { return objc_getSubLocalitySuper(getSuper(), subLocality); } else { return objc_getSubLocality(this, subLocality); }
	}
	
	
	private static final Selector thoroughfare = Selector.register("thoroughfare");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getThoroughfare(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getThoroughfareSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getThoroughfare() {
		if (customClass) { return objc_getThoroughfareSuper(getSuper(), thoroughfare); } else { return objc_getThoroughfare(this, thoroughfare); }
	}
	
	
	private static final Selector subThoroughfare = Selector.register("subThoroughfare");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getSubThoroughfare(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getSubThoroughfareSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getSubThoroughfare() {
		if (customClass) { return objc_getSubThoroughfareSuper(getSuper(), subThoroughfare); } else { return objc_getSubThoroughfare(this, subThoroughfare); }
	}
	
	
	private static final Selector region = Selector.register("region");
	@Bridge(symbol = "objc_msgSend") private native static CLRegion objc_getRegion(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLRegion objc_getRegionSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public CLRegion getRegion() {
		if (customClass) { return objc_getRegionSuper(getSuper(), region); } else { return objc_getRegion(this, region); }
	}
	
	
	private static final Selector inlandWater = Selector.register("inlandWater");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getInlandWater(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getInlandWaterSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getInlandWater() {
		if (customClass) { return objc_getInlandWaterSuper(getSuper(), inlandWater); } else { return objc_getInlandWater(this, inlandWater); }
	}
	
	
	private static final Selector ocean = Selector.register("ocean");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getOcean(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getOceanSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSString getOcean() {
		if (customClass) { return objc_getOceanSuper(getSuper(), ocean); } else { return objc_getOcean(this, ocean); }
	}
	
	
	private static final Selector areasOfInterest = Selector.register("areasOfInterest");
	@Bridge(symbol = "objc_msgSend") private native static NSArray objc_getAreasOfInterest(CLPlacemark __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSArray objc_getAreasOfInterestSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 5.0 and later.
	 */
	public NSArray getAreasOfInterest() {
		if (customClass) { return objc_getAreasOfInterestSuper(getSuper(), areasOfInterest); } else { return objc_getAreasOfInterest(this, areasOfInterest); }
	}
	
	
	
	static class Callbacks {
		@Callback @BindSelector("location") public static CLLocation getLocation(CLPlacemark __self__, Selector __cmd__) { return __self__.getLocation(); }
		@Callback @BindSelector("name") public static NSString getName(CLPlacemark __self__, Selector __cmd__) { return __self__.getName(); }
		@Callback @BindSelector("addressDictionary") public static NSDictionary getAddressDictionary(CLPlacemark __self__, Selector __cmd__) { return __self__.getAddressDictionary(); }
		@Callback @BindSelector("ISOcountryCode") public static NSString getISOcountryCode(CLPlacemark __self__, Selector __cmd__) { return __self__.getISOcountryCode(); }
		@Callback @BindSelector("country") public static NSString getCountry(CLPlacemark __self__, Selector __cmd__) { return __self__.getCountry(); }
		@Callback @BindSelector("postalCode") public static NSString getPostalCode(CLPlacemark __self__, Selector __cmd__) { return __self__.getPostalCode(); }
		@Callback @BindSelector("administrativeArea") public static NSString getAdministrativeArea(CLPlacemark __self__, Selector __cmd__) { return __self__.getAdministrativeArea(); }
		@Callback @BindSelector("subAdministrativeArea") public static NSString getSubAdministrativeArea(CLPlacemark __self__, Selector __cmd__) { return __self__.getSubAdministrativeArea(); }
		@Callback @BindSelector("locality") public static NSString getLocality(CLPlacemark __self__, Selector __cmd__) { return __self__.getLocality(); }
		@Callback @BindSelector("subLocality") public static NSString getSubLocality(CLPlacemark __self__, Selector __cmd__) { return __self__.getSubLocality(); }
		@Callback @BindSelector("thoroughfare") public static NSString getThoroughfare(CLPlacemark __self__, Selector __cmd__) { return __self__.getThoroughfare(); }
		@Callback @BindSelector("subThoroughfare") public static NSString getSubThoroughfare(CLPlacemark __self__, Selector __cmd__) { return __self__.getSubThoroughfare(); }
		@Callback @BindSelector("region") public static CLRegion getRegion(CLPlacemark __self__, Selector __cmd__) { return __self__.getRegion(); }
		@Callback @BindSelector("inlandWater") public static NSString getInlandWater(CLPlacemark __self__, Selector __cmd__) { return __self__.getInlandWater(); }
		@Callback @BindSelector("ocean") public static NSString getOcean(CLPlacemark __self__, Selector __cmd__) { return __self__.getOcean(); }
		@Callback @BindSelector("areasOfInterest") public static NSArray getAreasOfInterest(CLPlacemark __self__, Selector __cmd__) { return __self__.getAreasOfInterest(); }
	}
}
