/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burglar;

/**
 *
 * @author Asus-Shabbir
 */
public class Burglar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SingleObject logFile = SingleObject.getInstance();

        SensorFactory factory;
        factory = new FactoryX();

        AlarmForMotion alarm = new AlarmForMotion();
        

        SensorForThief thiefsensor =  factory.createThiefSensor();
        SensorForMotion motionsensor = factory.createMotionSensor();

        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register((SensorListener) thiefsensor);
        sensorSystem.register((SensorListener) motionsensor);
        sensorSystem.notifyUser();

        HomeSecurityRemote remote = new HomeSecurityRemote();
        remote.setCommand(new StopAlarmCommand( alarm ));
        remote.buttonPressed();

       
        remote.buttonPressed();
	    }
    }
    

