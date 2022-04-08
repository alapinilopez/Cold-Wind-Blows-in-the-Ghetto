package org.poniperro.furnacedip.interfaces;

import org.poniperro.furnacedip.types.RoomTemperature;

public interface Heater {
	
	void engage(RoomTemperature temperature);
	void disengage(RoomTemperature temperature);

}
