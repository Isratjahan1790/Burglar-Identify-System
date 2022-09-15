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
public class HomeSecurityRemote {
     Command command;
    
        public void setCommand(Command command) {
            this.command = command;
        }
    
        public void buttonPressed() {
            command.execute();
        }
}
