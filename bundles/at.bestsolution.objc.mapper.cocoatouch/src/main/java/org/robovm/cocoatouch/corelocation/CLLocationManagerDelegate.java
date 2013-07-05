package org.robovm.cocoatouch.corelocation;

import org.robovm.cocoatouch.corelocation.CLAuthorizationStatus;
import org.robovm.cocoatouch.corelocation.CLHeading;
import org.robovm.cocoatouch.corelocation.CLLocation;
import org.robovm.cocoatouch.corelocation.CLLocationManager;
import org.robovm.cocoatouch.corelocation.CLRegion;
import org.robovm.cocoatouch.foundation.NSArray;
import org.robovm.cocoatouch.foundation.NSError;
import org.robovm.cocoatouch.foundation.NSObject;
import org.robovm.cocoatouch.foundation.NSObjectProtocol;
import org.robovm.objc.Selector;
import org.robovm.objc.annotation.BindSelector;
import org.robovm.objc.annotation.NotImplemented;
import org.robovm.rt.bro.annotation.Callback;

public interface CLLocationManagerDelegate extends NSObjectProtocol {
	
	public void didUpdateLocations(CLLocationManager locationManager,NSArray didUpdateLocations);
	public void didFailWithError(CLLocationManager locationManager,NSError didFailWithError);
	public void didFinishDeferredUpdatesWithError(CLLocationManager locationManager,NSError didFinishDeferredUpdatesWithError);
	public void didUpdateToLocation(CLLocationManager locationManager,CLLocation didUpdateToLocation,CLLocation fromLocation);
	public void locationManagerDidPauseLocationUpdates(CLLocationManager locationManagerDidPauseLocationUpdates);
	public void locationManagerDidResumeLocationUpdates(CLLocationManager locationManagerDidResumeLocationUpdates);
	public void didUpdateHeading(CLLocationManager locationManager,CLHeading didUpdateHeading);
	public boolean locationManagerShouldDisplayHeadingCalibration(CLLocationManager locationManagerShouldDisplayHeadingCalibration);
	public void didEnterRegion(CLLocationManager locationManager,CLRegion didEnterRegion);
	public void didExitRegion(CLLocationManager locationManager,CLRegion didExitRegion);
	public void monitoringDidFailForRegion(CLLocationManager locationManager,CLRegion monitoringDidFailForRegion,NSError withError);
	public void didStartMonitoringForRegion(CLLocationManager locationManager,CLRegion didStartMonitoringForRegion);
	public void didChangeAuthorizationStatus(CLLocationManager locationManager,CLAuthorizationStatus didChangeAuthorizationStatus);

	public static class Adapter extends NSObject implements CLLocationManagerDelegate {
		@NotImplemented("locationManager:didUpdateLocations:") public void didUpdateLocations(CLLocationManager locationManager,NSArray didUpdateLocations) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:didFailWithError:") public void didFailWithError(CLLocationManager locationManager,NSError didFailWithError) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:didFinishDeferredUpdatesWithError:") public void didFinishDeferredUpdatesWithError(CLLocationManager locationManager,NSError didFinishDeferredUpdatesWithError) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:didUpdateToLocation:fromLocation:") public void didUpdateToLocation(CLLocationManager locationManager,CLLocation didUpdateToLocation,CLLocation fromLocation) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManagerDidPauseLocationUpdates:") public void locationManagerDidPauseLocationUpdates(CLLocationManager locationManagerDidPauseLocationUpdates) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManagerDidResumeLocationUpdates:") public void locationManagerDidResumeLocationUpdates(CLLocationManager locationManagerDidResumeLocationUpdates) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:didUpdateHeading:") public void didUpdateHeading(CLLocationManager locationManager,CLHeading didUpdateHeading) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManagerShouldDisplayHeadingCalibration:") public boolean locationManagerShouldDisplayHeadingCalibration(CLLocationManager locationManagerShouldDisplayHeadingCalibration) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:didEnterRegion:") public void didEnterRegion(CLLocationManager locationManager,CLRegion didEnterRegion) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:didExitRegion:") public void didExitRegion(CLLocationManager locationManager,CLRegion didExitRegion) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:monitoringDidFailForRegion:withError:") public void monitoringDidFailForRegion(CLLocationManager locationManager,CLRegion monitoringDidFailForRegion,NSError withError) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:didStartMonitoringForRegion:") public void didStartMonitoringForRegion(CLLocationManager locationManager,CLRegion didStartMonitoringForRegion) { throw new UnsupportedOperationException(); }
		@NotImplemented("locationManager:didChangeAuthorizationStatus:") public void didChangeAuthorizationStatus(CLLocationManager locationManager,CLAuthorizationStatus didChangeAuthorizationStatus) { throw new UnsupportedOperationException(); }
	}
	
	static class Callbacks {
		@Callback @BindSelector("locationManager:didUpdateLocations:") public static void didUpdateLocations(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,NSArray didUpdateLocations) { __self__.didUpdateLocations( locationManager,didUpdateLocations); }
		@Callback @BindSelector("locationManager:didFailWithError:") public static void didFailWithError(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,NSError didFailWithError) { __self__.didFailWithError( locationManager,didFailWithError); }
		@Callback @BindSelector("locationManager:didFinishDeferredUpdatesWithError:") public static void didFinishDeferredUpdatesWithError(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,NSError didFinishDeferredUpdatesWithError) { __self__.didFinishDeferredUpdatesWithError( locationManager,didFinishDeferredUpdatesWithError); }
		@Callback @BindSelector("locationManager:didUpdateToLocation:fromLocation:") public static void didUpdateToLocation(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,CLLocation didUpdateToLocation,CLLocation fromLocation) { __self__.didUpdateToLocation( locationManager,didUpdateToLocation,fromLocation); }
		@Callback @BindSelector("locationManagerDidPauseLocationUpdates:") public static void locationManagerDidPauseLocationUpdates(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManagerDidPauseLocationUpdates) { __self__.locationManagerDidPauseLocationUpdates( locationManagerDidPauseLocationUpdates); }
		@Callback @BindSelector("locationManagerDidResumeLocationUpdates:") public static void locationManagerDidResumeLocationUpdates(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManagerDidResumeLocationUpdates) { __self__.locationManagerDidResumeLocationUpdates( locationManagerDidResumeLocationUpdates); }
		@Callback @BindSelector("locationManager:didUpdateHeading:") public static void didUpdateHeading(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,CLHeading didUpdateHeading) { __self__.didUpdateHeading( locationManager,didUpdateHeading); }
		@Callback @BindSelector("locationManagerShouldDisplayHeadingCalibration:") public static boolean locationManagerShouldDisplayHeadingCalibration(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManagerShouldDisplayHeadingCalibration) { return __self__.locationManagerShouldDisplayHeadingCalibration( locationManagerShouldDisplayHeadingCalibration); }
		@Callback @BindSelector("locationManager:didEnterRegion:") public static void didEnterRegion(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,CLRegion didEnterRegion) { __self__.didEnterRegion( locationManager,didEnterRegion); }
		@Callback @BindSelector("locationManager:didExitRegion:") public static void didExitRegion(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,CLRegion didExitRegion) { __self__.didExitRegion( locationManager,didExitRegion); }
		@Callback @BindSelector("locationManager:monitoringDidFailForRegion:withError:") public static void monitoringDidFailForRegion(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,CLRegion monitoringDidFailForRegion,NSError withError) { __self__.monitoringDidFailForRegion( locationManager,monitoringDidFailForRegion,withError); }
		@Callback @BindSelector("locationManager:didStartMonitoringForRegion:") public static void didStartMonitoringForRegion(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,CLRegion didStartMonitoringForRegion) { __self__.didStartMonitoringForRegion( locationManager,didStartMonitoringForRegion); }
		@Callback @BindSelector("locationManager:didChangeAuthorizationStatus:") public static void didChangeAuthorizationStatus(CLLocationManagerDelegate __self__, Selector __cmd__, CLLocationManager locationManager,CLAuthorizationStatus didChangeAuthorizationStatus) { __self__.didChangeAuthorizationStatus( locationManager,didChangeAuthorizationStatus); }
	}
}
