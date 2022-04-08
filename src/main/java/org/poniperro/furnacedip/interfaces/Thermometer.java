package org.poniperro.furnacedip.interfaces;

import org.poniperro.furnacedip.types.RoomTemperature;

public interface Thermometer {
	
	double read(RoomTemperature temperature);
}
