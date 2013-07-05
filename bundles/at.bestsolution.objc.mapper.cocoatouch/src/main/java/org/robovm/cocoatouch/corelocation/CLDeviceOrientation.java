package org.robovm.cocoatouch.corelocation;

import org.robovm.rt.bro.ValuedEnum;

public enum CLDeviceOrientation implements ValuedEnum {
	CLDeviceOrientationUnknown(0) ,
	CLDeviceOrientationPortrait(1) ,
	CLDeviceOrientationPortraitUpsideDown(2) ,
	CLDeviceOrientationLandscapeLeft(3) ,
	CLDeviceOrientationLandscapeRight(4) ,
	CLDeviceOrientationFaceUp(5) ,
	CLDeviceOrientationFaceDown(6) ;

	private final int n;

	private CLDeviceOrientation(int n) { this.n = n; }
	public int value() { return n; }
}

