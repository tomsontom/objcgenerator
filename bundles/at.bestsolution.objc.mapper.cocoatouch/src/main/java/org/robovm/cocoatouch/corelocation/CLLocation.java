package org.robovm.cocoatouch.corelocation;

import org.robovm.cocoatouch.corelocation.CLLocationCoordinate2D;
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
public class CLLocation extends NSObject {
	static {
		ObjCRuntime.bind(/*<name>*/ CLLocation /*</name>*/.class);
	}

	private static final boolean X86 = Bro.IS_X86;
	private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ CLLocation /*</name>*/.class);
	
	private static final Selector coordinate = Selector.register("coordinate");
	@Bridge(symbol = "objc_msgSend") private native static CLLocationCoordinate2D objc_getCoordinate(CLLocation __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLLocationCoordinate2D objc_getCoordinateSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public CLLocationCoordinate2D getCoordinate() {
		if (customClass) { return objc_getCoordinateSuper(getSuper(), coordinate); } else { return objc_getCoordinate(this, coordinate); }
	}
	
	
	private static final Selector altitude = Selector.register("altitude");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getAltitude(CLLocation __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getAltitudeSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public double getAltitude() {
		if (customClass) { return objc_getAltitudeSuper(getSuper(), altitude); } else { return objc_getAltitude(this, altitude); }
	}
	
	
	private static final Selector horizontalAccuracy = Selector.register("horizontalAccuracy");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getHorizontalAccuracy(CLLocation __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getHorizontalAccuracySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public double getHorizontalAccuracy() {
		if (customClass) { return objc_getHorizontalAccuracySuper(getSuper(), horizontalAccuracy); } else { return objc_getHorizontalAccuracy(this, horizontalAccuracy); }
	}
	
	
	private static final Selector verticalAccuracy = Selector.register("verticalAccuracy");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getVerticalAccuracy(CLLocation __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getVerticalAccuracySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public double getVerticalAccuracy() {
		if (customClass) { return objc_getVerticalAccuracySuper(getSuper(), verticalAccuracy); } else { return objc_getVerticalAccuracy(this, verticalAccuracy); }
	}
	
	
	private static final Selector timestamp = Selector.register("timestamp");
	@Bridge(symbol = "objc_msgSend") private native static NSDate objc_getTimestamp(CLLocation __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSDate objc_getTimestampSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public NSDate getTimestamp() {
		if (customClass) { return objc_getTimestampSuper(getSuper(), timestamp); } else { return objc_getTimestamp(this, timestamp); }
	}
	
	
	private static final Selector speed = Selector.register("speed");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getSpeed(CLLocation __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getSpeedSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.2 and later.
	 */
	public double getSpeed() {
		if (customClass) { return objc_getSpeedSuper(getSuper(), speed); } else { return objc_getSpeed(this, speed); }
	}
	
	
	private static final Selector course = Selector.register("course");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getCourse(CLLocation __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getCourseSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.2 and later.
	 */
	public double getCourse() {
		if (customClass) { return objc_getCourseSuper(getSuper(), course); } else { return objc_getCourse(this, course); }
	}
	
	
	
	static class Callbacks {
		@Callback @BindSelector("coordinate") public static CLLocationCoordinate2D getCoordinate(CLLocation __self__, Selector __cmd__) { return __self__.getCoordinate(); }
		@Callback @BindSelector("altitude") public static double getAltitude(CLLocation __self__, Selector __cmd__) { return __self__.getAltitude(); }
		@Callback @BindSelector("horizontalAccuracy") public static double getHorizontalAccuracy(CLLocation __self__, Selector __cmd__) { return __self__.getHorizontalAccuracy(); }
		@Callback @BindSelector("verticalAccuracy") public static double getVerticalAccuracy(CLLocation __self__, Selector __cmd__) { return __self__.getVerticalAccuracy(); }
		@Callback @BindSelector("timestamp") public static NSDate getTimestamp(CLLocation __self__, Selector __cmd__) { return __self__.getTimestamp(); }
		@Callback @BindSelector("speed") public static double getSpeed(CLLocation __self__, Selector __cmd__) { return __self__.getSpeed(); }
		@Callback @BindSelector("course") public static double getCourse(CLLocation __self__, Selector __cmd__) { return __self__.getCourse(); }
	}
}
