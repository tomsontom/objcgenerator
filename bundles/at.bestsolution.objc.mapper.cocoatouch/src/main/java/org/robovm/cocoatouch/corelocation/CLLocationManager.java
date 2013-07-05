package org.robovm.cocoatouch.corelocation;

import org.robovm.cocoatouch.corelocation.CLActivityType;
import org.robovm.cocoatouch.corelocation.CLDeviceOrientation;
import org.robovm.cocoatouch.corelocation.CLHeading;
import org.robovm.cocoatouch.corelocation.CLLocation;
import org.robovm.cocoatouch.corelocation.CLLocationManagerDelegate;
import org.robovm.cocoatouch.foundation.NSObject;
import org.robovm.cocoatouch.foundation.NSSet;
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
public class CLLocationManager extends NSObject {
	static {
		ObjCRuntime.bind(/*<name>*/ CLLocationManager /*</name>*/.class);
	}

	private static final boolean X86 = Bro.IS_X86;
	private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ CLLocationManager /*</name>*/.class);
	
	private static final Selector delegate = Selector.register("delegate");
	@Bridge(symbol = "objc_msgSend") private native static CLLocationManagerDelegate objc_getDelegate(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLLocationManagerDelegate objc_getDelegateSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public CLLocationManagerDelegate getDelegate() {
		if (customClass) { return objc_getDelegateSuper(getSuper(), delegate); } else { return objc_getDelegate(this, delegate); }
	}
	
	private static final Selector setDelegate$ = Selector.register("setDelegate:");
	@Bridge(symbol = "objc_msgSend") private native static void objc_setDelegate(CLLocationManager __self__, Selector __cmd__, CLLocationManagerDelegate delegate);
	@Bridge(symbol = "objc_msgSendSuper") private native static void objc_setDelegateSuper(ObjCSuper __super__, Selector __cmd__, CLLocationManagerDelegate delegate);
	public void setDelegate(CLLocationManagerDelegate delegate) {
		if (customClass) { objc_setDelegateSuper(getSuper(), setDelegate$, delegate); } else { objc_setDelegate(this, setDelegate$, delegate); }
	}
	
	private static final Selector pausesLocationUpdatesAutomatically = Selector.register("pausesLocationUpdatesAutomatically");
	@Bridge(symbol = "objc_msgSend") private native static boolean objc_getPausesLocationUpdatesAutomatically(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_getPausesLocationUpdatesAutomaticallySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 6.0 and later.
	 */
	public boolean getPausesLocationUpdatesAutomatically() {
		if (customClass) { return objc_getPausesLocationUpdatesAutomaticallySuper(getSuper(), pausesLocationUpdatesAutomatically); } else { return objc_getPausesLocationUpdatesAutomatically(this, pausesLocationUpdatesAutomatically); }
	}
	
	private static final Selector setPausesLocationUpdatesAutomatically$ = Selector.register("setPausesLocationUpdatesAutomatically:");
	@Bridge(symbol = "objc_msgSend") private native static void objc_setPausesLocationUpdatesAutomatically(CLLocationManager __self__, Selector __cmd__, boolean pausesLocationUpdatesAutomatically);
	@Bridge(symbol = "objc_msgSendSuper") private native static void objc_setPausesLocationUpdatesAutomaticallySuper(ObjCSuper __super__, Selector __cmd__, boolean pausesLocationUpdatesAutomatically);
	public void setPausesLocationUpdatesAutomatically(boolean pausesLocationUpdatesAutomatically) {
		if (customClass) { objc_setPausesLocationUpdatesAutomaticallySuper(getSuper(), setPausesLocationUpdatesAutomatically$, pausesLocationUpdatesAutomatically); } else { objc_setPausesLocationUpdatesAutomatically(this, setPausesLocationUpdatesAutomatically$, pausesLocationUpdatesAutomatically); }
	}
	
	private static final Selector distanceFilter = Selector.register("distanceFilter");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getDistanceFilter(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getDistanceFilterSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public double getDistanceFilter() {
		if (customClass) { return objc_getDistanceFilterSuper(getSuper(), distanceFilter); } else { return objc_getDistanceFilter(this, distanceFilter); }
	}
	
	private static final Selector setDistanceFilter$ = Selector.register("setDistanceFilter:");
	@Bridge(symbol = "objc_msgSend") private native static void objc_setDistanceFilter(CLLocationManager __self__, Selector __cmd__, double distanceFilter);
	@Bridge(symbol = "objc_msgSendSuper") private native static void objc_setDistanceFilterSuper(ObjCSuper __super__, Selector __cmd__, double distanceFilter);
	public void setDistanceFilter(double distanceFilter) {
		if (customClass) { objc_setDistanceFilterSuper(getSuper(), setDistanceFilter$, distanceFilter); } else { objc_setDistanceFilter(this, setDistanceFilter$, distanceFilter); }
	}
	
	private static final Selector desiredAccuracy = Selector.register("desiredAccuracy");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getDesiredAccuracy(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getDesiredAccuracySuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public double getDesiredAccuracy() {
		if (customClass) { return objc_getDesiredAccuracySuper(getSuper(), desiredAccuracy); } else { return objc_getDesiredAccuracy(this, desiredAccuracy); }
	}
	
	private static final Selector setDesiredAccuracy$ = Selector.register("setDesiredAccuracy:");
	@Bridge(symbol = "objc_msgSend") private native static void objc_setDesiredAccuracy(CLLocationManager __self__, Selector __cmd__, double desiredAccuracy);
	@Bridge(symbol = "objc_msgSendSuper") private native static void objc_setDesiredAccuracySuper(ObjCSuper __super__, Selector __cmd__, double desiredAccuracy);
	public void setDesiredAccuracy(double desiredAccuracy) {
		if (customClass) { objc_setDesiredAccuracySuper(getSuper(), setDesiredAccuracy$, desiredAccuracy); } else { objc_setDesiredAccuracy(this, setDesiredAccuracy$, desiredAccuracy); }
	}
	
	private static final Selector activityType = Selector.register("activityType");
	@Bridge(symbol = "objc_msgSend") private native static CLActivityType objc_getActivityType(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLActivityType objc_getActivityTypeSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 6.0 and later.
	 */
	public CLActivityType getActivityType() {
		if (customClass) { return objc_getActivityTypeSuper(getSuper(), activityType); } else { return objc_getActivityType(this, activityType); }
	}
	
	private static final Selector setActivityType$ = Selector.register("setActivityType:");
	@Bridge(symbol = "objc_msgSend") private native static void objc_setActivityType(CLLocationManager __self__, Selector __cmd__, CLActivityType activityType);
	@Bridge(symbol = "objc_msgSendSuper") private native static void objc_setActivityTypeSuper(ObjCSuper __super__, Selector __cmd__, CLActivityType activityType);
	public void setActivityType(CLActivityType activityType) {
		if (customClass) { objc_setActivityTypeSuper(getSuper(), setActivityType$, activityType); } else { objc_setActivityType(this, setActivityType$, activityType); }
	}
	
	private static final Selector headingFilter = Selector.register("headingFilter");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getHeadingFilter(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getHeadingFilterSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public double getHeadingFilter() {
		if (customClass) { return objc_getHeadingFilterSuper(getSuper(), headingFilter); } else { return objc_getHeadingFilter(this, headingFilter); }
	}
	
	private static final Selector setHeadingFilter$ = Selector.register("setHeadingFilter:");
	@Bridge(symbol = "objc_msgSend") private native static void objc_setHeadingFilter(CLLocationManager __self__, Selector __cmd__, double headingFilter);
	@Bridge(symbol = "objc_msgSendSuper") private native static void objc_setHeadingFilterSuper(ObjCSuper __super__, Selector __cmd__, double headingFilter);
	public void setHeadingFilter(double headingFilter) {
		if (customClass) { objc_setHeadingFilterSuper(getSuper(), setHeadingFilter$, headingFilter); } else { objc_setHeadingFilter(this, setHeadingFilter$, headingFilter); }
	}
	
	private static final Selector headingOrientation = Selector.register("headingOrientation");
	@Bridge(symbol = "objc_msgSend") private native static CLDeviceOrientation objc_getHeadingOrientation(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLDeviceOrientation objc_getHeadingOrientationSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 4.0 and later.
	 */
	public CLDeviceOrientation getHeadingOrientation() {
		if (customClass) { return objc_getHeadingOrientationSuper(getSuper(), headingOrientation); } else { return objc_getHeadingOrientation(this, headingOrientation); }
	}
	
	private static final Selector setHeadingOrientation$ = Selector.register("setHeadingOrientation:");
	@Bridge(symbol = "objc_msgSend") private native static void objc_setHeadingOrientation(CLLocationManager __self__, Selector __cmd__, CLDeviceOrientation headingOrientation);
	@Bridge(symbol = "objc_msgSendSuper") private native static void objc_setHeadingOrientationSuper(ObjCSuper __super__, Selector __cmd__, CLDeviceOrientation headingOrientation);
	public void setHeadingOrientation(CLDeviceOrientation headingOrientation) {
		if (customClass) { objc_setHeadingOrientationSuper(getSuper(), setHeadingOrientation$, headingOrientation); } else { objc_setHeadingOrientation(this, setHeadingOrientation$, headingOrientation); }
	}
	
	private static final Selector monitoredRegions = Selector.register("monitoredRegions");
	@Bridge(symbol = "objc_msgSend") private native static NSSet objc_getMonitoredRegions(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSSet objc_getMonitoredRegionsSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 4.0 and later.
	 */
	public NSSet getMonitoredRegions() {
		if (customClass) { return objc_getMonitoredRegionsSuper(getSuper(), monitoredRegions); } else { return objc_getMonitoredRegions(this, monitoredRegions); }
	}
	
	
	private static final Selector maximumRegionMonitoringDistance = Selector.register("maximumRegionMonitoringDistance");
	@Bridge(symbol = "objc_msgSend") private native static double objc_getMaximumRegionMonitoringDistance(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static double objc_getMaximumRegionMonitoringDistanceSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 4.0 and later.
	 */
	public double getMaximumRegionMonitoringDistance() {
		if (customClass) { return objc_getMaximumRegionMonitoringDistanceSuper(getSuper(), maximumRegionMonitoringDistance); } else { return objc_getMaximumRegionMonitoringDistance(this, maximumRegionMonitoringDistance); }
	}
	
	
	private static final Selector location = Selector.register("location");
	@Bridge(symbol = "objc_msgSend") private native static CLLocation objc_getLocation(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLLocation objc_getLocationSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public CLLocation getLocation() {
		if (customClass) { return objc_getLocationSuper(getSuper(), location); } else { return objc_getLocation(this, location); }
	}
	
	
	private static final Selector heading = Selector.register("heading");
	@Bridge(symbol = "objc_msgSend") private native static CLHeading objc_getHeading(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static CLHeading objc_getHeadingSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 4.0 and later.
	 */
	public CLHeading getHeading() {
		if (customClass) { return objc_getHeadingSuper(getSuper(), heading); } else { return objc_getHeading(this, heading); }
	}
	
	
	private static final Selector purpose = Selector.register("purpose");
	@Bridge(symbol = "objc_msgSend") private native static NSString objc_getPurpose(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static NSString objc_getPurposeSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.2 and later.
	 */
	public NSString getPurpose() {
		if (customClass) { return objc_getPurposeSuper(getSuper(), purpose); } else { return objc_getPurpose(this, purpose); }
	}
	
	private static final Selector setPurpose$ = Selector.register("setPurpose:");
	@Bridge(symbol = "objc_msgSend") private native static void objc_setPurpose(CLLocationManager __self__, Selector __cmd__, NSString purpose);
	@Bridge(symbol = "objc_msgSendSuper") private native static void objc_setPurposeSuper(ObjCSuper __super__, Selector __cmd__, NSString purpose);
	public void setPurpose(NSString purpose) {
		if (customClass) { objc_setPurposeSuper(getSuper(), setPurpose$, purpose); } else { objc_setPurpose(this, setPurpose$, purpose); }
	}
	
	private static final Selector headingAvailable = Selector.register("headingAvailable");
	@Bridge(symbol = "objc_msgSend") private native static boolean objc_getHeadingAvailable(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_getHeadingAvailableSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 3.0 and later.
	 */
	public boolean getHeadingAvailable() {
		if (customClass) { return objc_getHeadingAvailableSuper(getSuper(), headingAvailable); } else { return objc_getHeadingAvailable(this, headingAvailable); }
	}
	
	
	private static final Selector locationServicesEnabled = Selector.register("locationServicesEnabled");
	@Bridge(symbol = "objc_msgSend") private native static boolean objc_getLocationServicesEnabled(CLLocationManager __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_getLocationServicesEnabledSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * 
	 * @since Available in iOS 2.0 and later.
	 */
	public boolean getLocationServicesEnabled() {
		if (customClass) { return objc_getLocationServicesEnabledSuper(getSuper(), locationServicesEnabled); } else { return objc_getLocationServicesEnabled(this, locationServicesEnabled); }
	}
	
	
	
	static class Callbacks {
		@Callback @BindSelector("delegate") public static CLLocationManagerDelegate getDelegate(CLLocationManager __self__, Selector __cmd__) { return __self__.getDelegate(); }
		@Callback @BindSelector("delegate:") public static void setDelegate(CLLocationManager __self__, Selector __cmd__, CLLocationManagerDelegate delegate) { __self__.setDelegate(delegate); }
		@Callback @BindSelector("pausesLocationUpdatesAutomatically") public static boolean getPausesLocationUpdatesAutomatically(CLLocationManager __self__, Selector __cmd__) { return __self__.getPausesLocationUpdatesAutomatically(); }
		@Callback @BindSelector("pausesLocationUpdatesAutomatically:") public static void setPausesLocationUpdatesAutomatically(CLLocationManager __self__, Selector __cmd__, boolean pausesLocationUpdatesAutomatically) { __self__.setPausesLocationUpdatesAutomatically(pausesLocationUpdatesAutomatically); }
		@Callback @BindSelector("distanceFilter") public static double getDistanceFilter(CLLocationManager __self__, Selector __cmd__) { return __self__.getDistanceFilter(); }
		@Callback @BindSelector("distanceFilter:") public static void setDistanceFilter(CLLocationManager __self__, Selector __cmd__, double distanceFilter) { __self__.setDistanceFilter(distanceFilter); }
		@Callback @BindSelector("desiredAccuracy") public static double getDesiredAccuracy(CLLocationManager __self__, Selector __cmd__) { return __self__.getDesiredAccuracy(); }
		@Callback @BindSelector("desiredAccuracy:") public static void setDesiredAccuracy(CLLocationManager __self__, Selector __cmd__, double desiredAccuracy) { __self__.setDesiredAccuracy(desiredAccuracy); }
		@Callback @BindSelector("activityType") public static CLActivityType getActivityType(CLLocationManager __self__, Selector __cmd__) { return __self__.getActivityType(); }
		@Callback @BindSelector("activityType:") public static void setActivityType(CLLocationManager __self__, Selector __cmd__, CLActivityType activityType) { __self__.setActivityType(activityType); }
		@Callback @BindSelector("headingFilter") public static double getHeadingFilter(CLLocationManager __self__, Selector __cmd__) { return __self__.getHeadingFilter(); }
		@Callback @BindSelector("headingFilter:") public static void setHeadingFilter(CLLocationManager __self__, Selector __cmd__, double headingFilter) { __self__.setHeadingFilter(headingFilter); }
		@Callback @BindSelector("headingOrientation") public static CLDeviceOrientation getHeadingOrientation(CLLocationManager __self__, Selector __cmd__) { return __self__.getHeadingOrientation(); }
		@Callback @BindSelector("headingOrientation:") public static void setHeadingOrientation(CLLocationManager __self__, Selector __cmd__, CLDeviceOrientation headingOrientation) { __self__.setHeadingOrientation(headingOrientation); }
		@Callback @BindSelector("monitoredRegions") public static NSSet getMonitoredRegions(CLLocationManager __self__, Selector __cmd__) { return __self__.getMonitoredRegions(); }
		@Callback @BindSelector("maximumRegionMonitoringDistance") public static double getMaximumRegionMonitoringDistance(CLLocationManager __self__, Selector __cmd__) { return __self__.getMaximumRegionMonitoringDistance(); }
		@Callback @BindSelector("location") public static CLLocation getLocation(CLLocationManager __self__, Selector __cmd__) { return __self__.getLocation(); }
		@Callback @BindSelector("heading") public static CLHeading getHeading(CLLocationManager __self__, Selector __cmd__) { return __self__.getHeading(); }
		@Callback @BindSelector("purpose") public static NSString getPurpose(CLLocationManager __self__, Selector __cmd__) { return __self__.getPurpose(); }
		@Callback @BindSelector("purpose:") public static void setPurpose(CLLocationManager __self__, Selector __cmd__, NSString purpose) { __self__.setPurpose(purpose); }
		@Callback @BindSelector("headingAvailable") public static boolean getHeadingAvailable(CLLocationManager __self__, Selector __cmd__) { return __self__.getHeadingAvailable(); }
		@Callback @BindSelector("locationServicesEnabled") public static boolean getLocationServicesEnabled(CLLocationManager __self__, Selector __cmd__) { return __self__.getLocationServicesEnabled(); }
	}
}
