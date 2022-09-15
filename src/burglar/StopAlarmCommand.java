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
public class StopAlarmCommand implements Command {
     AlarmForMotion alarm;
    
        public StopAlarmCommand(AlarmForMotion alarm) {
            super();
            this.alarm = alarm;
        }
    
        public void execute() {
            System.out.println("Stopping Alarm.");
            alarm.stop();
        }
}
