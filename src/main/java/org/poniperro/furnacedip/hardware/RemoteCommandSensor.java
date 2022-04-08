package org.poniperro.furnacedip.hardware;

import org.poniperro.furnacedip.interfaces.Thermometer;
import org.poniperro.furnacedip.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
	
	public double read(RoomTemperature temperature){
		return temperature.getTemperature();
	}

}
