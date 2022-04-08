package org.poniperro.furnacedip.main;

import org.poniperro.furnacedip.hardware.GasHeater;
import org.poniperro.furnacedip.hardware.Regulator;
import org.poniperro.furnacedip.hardware.RemoteCommandSensor;
import org.poniperro.furnacedip.interfaces.Heater;
import org.poniperro.furnacedip.interfaces.Thermometer;
import org.poniperro.furnacedip.otherstuff.Jedi;
import org.poniperro.furnacedip.types.RoomTemperature;

public class App 
{
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        temperature = RoomTemperature.getInstance();
        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();

        Heater luke = new Jedi();
        // luke.speak(); // ups, The method speak() is undefined for the type HeaterJava
    }
}
