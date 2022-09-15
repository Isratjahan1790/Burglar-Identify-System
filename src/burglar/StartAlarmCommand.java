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
public class StartAlarmCommand implements Command {
    AlarmForMotion alarm;  
      
     public StartAlarmCommand(AlarmForMotion alarm) {  
            super();  
     this.alarm = alarm;  
      }  
      
        public void execute() {  
            System.out.println("Starting Alarm.");  
      alarm.start();  
      } 
}
