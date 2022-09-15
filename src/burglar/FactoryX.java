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
public class FactoryX implements SensorFactory  {
    @Override
    public SensorForMotion createMotionSensor() {
        return new XMotionSensor();
    }

    @Override
    public SensorForThief createThiefSensor() {
        return new XThiefSensor();
		}
}
