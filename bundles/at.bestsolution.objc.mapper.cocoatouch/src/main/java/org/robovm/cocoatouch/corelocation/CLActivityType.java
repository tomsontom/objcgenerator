package org.robovm.cocoatouch.corelocation;

import org.robovm.rt.bro.ValuedEnum;

public enum CLActivityType implements ValuedEnum {
	CLActivityTypeOther(1) ,
	CLActivityTypeAutomotiveNavigation(2) ,
	CLActivityTypeFitness(3) ,
	CLActivityTypeOtherNavigation(4) ;

	private final int n;

	private CLActivityType(int n) { this.n = n; }
	public int value() { return n; }
}

