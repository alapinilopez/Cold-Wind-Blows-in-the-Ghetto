package org.poniperro.furnacedip.hardware;

import org.poniperro.furnacedip.interfaces.Heater;
import org.poniperro.furnacedip.types.RoomTemperature;

public class GasHeater implements Heater {
	
	public void engage(RoomTemperature temperature){
		temperature.incrementTemperature(1);
	}
	
	public void disengage(RoomTemperature temperature){
		temperature.incrementTemperature(-1);
	}
}
