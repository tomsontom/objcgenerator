package org.robovm.cocoatouch.corelocation;

import org.robovm.cocoatouch.corelocation.CLLocationCoordinate2D;
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
public class CLRegion extends NSObject {
	static {
		ObjCRuntime.bind(/*<name>*/ CLRegion /*</name>*/.class);
	}

	private static final boolean X86 = Bro.IS_X86;
	private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ CLRegion /*</name>*/.class);
	
	private static final Selector identifier = Selector.register("identifier");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getIdentifier(CLRegion __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getIdentifierSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 4.0 and later.
	 */
	public NSString getIdentifier() {
		if (customClass) { return objc_getIdentifierSuper(getSuper(), identifier); } else { return objc_getIdentifier(this, identifier); }
	}
	
	
	private static final Selector center = Selector.register("center");
	@Bridge(symbol = "objc_msgSend") private native static CLLocationCoordinate2D objc_getCenter(CLRegion __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLLocationCoordinate2D objc_getCenterSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 4.0 and later.
	 */
	public CLLocationCoordinate2D getCenter() {
		if (customClass) { return objc_getCenterSuper(getSuper(), center); } else { return objc_getCenter(this, center); }
	}
	
	
	private static final Selector radius = Selector.register("radius");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getRadius(CLRegion __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getRadiusSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 4.0 and later.
	 */
	public double getRadius() {
		if (customClass) { return objc_getRadiusSuper(getSuper(), radius); } else { return objc_getRadius(this, radius); }
	}
	
	
	
	static class Callbacks {
		@Callback @BindSelector("identifier") public static NSString getIdentifier(CLRegion __self__, Selector __cmd__) { return __self__.getIdentifier(); }
		@Callback @BindSelector("center") public static CLLocationCoordinate2D getCenter(CLRegion __self__, Selector __cmd__) { return __self__.getCenter(); }
		@Callback @BindSelector("radius") public static double getRadius(CLRegion __self__, Selector __cmd__) { return __self__.getRadius(); }
	}
}
