package org.robovm.cocoatouch.corelocation;

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
public class CLGeocoder extends NSObject {
	static {
		ObjCRuntime.bind(/*<name>*/ CLGeocoder /*</name>*/.class);
	}

	private static final boolean X86 = Bro.IS_X86;
	private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ CLGeocoder /*</name>*/.class);
	
	private static final Selector geocoding = Selector.register("geocoding");
	@Bridge(symbol = "objc_msgSend") private native static boolean objc_getGeocoding(CLGeocoder __self__, Selector __cmd__);
	@Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_getGeocodingSuper(ObjCSuper __super__, Selector __cmd__);
	/**
	 * @see http://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLGeocoder_class/Reference/Reference.html#//apple_ref/occ/instp/CLGeocoder/geocoding
	 * @since Available in iOS 5.0 and later.
	 */
	public boolean getGeocoding() {
		if (customClass) { return objc_getGeocodingSuper(getSuper(), geocoding); } else { return objc_getGeocoding(this, geocoding); }
	}
	
	
	
	static class Callbacks {
		@Callback @BindSelector("geocoding") public static boolean getGeocoding(CLGeocoder __self__, Selector __cmd__) { return __self__.getGeocoding(); }
	}
}
