package org.robovm.cocoatouch.corelocation;

import org.robovm.cocoatouch.foundation.NSDate;
import org.robovm.cocoatouch.foundation.NSObject;
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
public class CLHeading extends NSObject {
	static {
		ObjCRuntime.bind(/*<name>*/ CLHeading /*</name>*/.class);
	}

	private static final boolean X86 = Bro.IS_X86;
	private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ CLHeading /*</name>*/.class);
	
	private static final Selector magneticHeading = Selector.register("magneticHeading");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getMagneticHeading(CLHeading __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getMagneticHeadingSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public double getMagneticHeading() {
		if (customClass) { return objc_getMagneticHeadingSuper(getSuper(), magneticHeading); } else { return objc_getMagneticHeading(this, magneticHeading); }
	}
	
	
	private static final Selector trueHeading = Selector.register("trueHeading");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getTrueHeading(CLHeading __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getTrueHeadingSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public double getTrueHeading() {
		if (customClass) { return objc_getTrueHeadingSuper(getSuper(), trueHeading); } else { return objc_getTrueHeading(this, trueHeading); }
	}
	
	
	private static final Selector headingAccuracy = Selector.register("headingAccuracy");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getHeadingAccuracy(CLHeading __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getHeadingAccuracySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public double getHeadingAccuracy() {
		if (customClass) { return objc_getHeadingAccuracySuper(getSuper(), headingAccuracy); } else { return objc_getHeadingAccuracy(this, headingAccuracy); }
	}
	
	
	private static final Selector timestamp = Selector.register("timestamp");
	@Bridge(symbol = "objc_msgSend") private native static NSDate objc_getTimestamp(CLHeading __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSDate objc_getTimestampSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public NSDate getTimestamp() {
		if (customClass) { return objc_getTimestampSuper(getSuper(), timestamp); } else { return objc_getTimestamp(this, timestamp); }
	}
	
	
	private static final Selector x = Selector.register("x");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getX(CLHeading __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getXSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public double getX() {
		if (customClass) { return objc_getXSuper(getSuper(), x); } else { return objc_getX(this, x); }
	}
	
	
	private static final Selector y = Selector.register("y");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getY(CLHeading __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getYSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public double getY() {
		if (customClass) { return objc_getYSuper(getSuper(), y); } else { return objc_getY(this, y); }
	}
	
	
	private static final Selector z = Selector.register("z");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getZ(CLHeading __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getZSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public double getZ() {
		if (customClass) { return objc_getZSuper(getSuper(), z); } else { return objc_getZ(this, z); }
	}
	
	
	
	static class Callbacks {
		@Callback @BindSelector("magneticHeading") public static double getMagneticHeading(CLHeading __self__, Selector __cmd__) { return __self__.getMagneticHeading(); }
		@Callback @BindSelector("trueHeading") public static double getTrueHeading(CLHeading __self__, Selector __cmd__) { return __self__.getTrueHeading(); }
		@Callback @BindSelector("headingAccuracy") public static double getHeadingAccuracy(CLHeading __self__, Selector __cmd__) { return __self__.getHeadingAccuracy(); }
		@Callback @BindSelector("timestamp") public static NSDate getTimestamp(CLHeading __self__, Selector __cmd__) { return __self__.getTimestamp(); }
		@Callback @BindSelector("x") public static double getX(CLHeading __self__, Selector __cmd__) { return __self__.getX(); }
		@Callback @BindSelector("y") public static double getY(CLHeading __self__, Selector __cmd__) { return __self__.getY(); }
		@Callback @BindSelector("z") public static double getZ(CLHeading __self__, Selector __cmd__) { return __self__.getZ(); }
	}
}
