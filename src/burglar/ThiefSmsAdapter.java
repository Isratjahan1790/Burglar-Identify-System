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
public class ThiefSmsAdapter implements Sms {
    private ThiefSms adaptee;
    
        public ThiefSmsAdapter(ThiefSms Thiefsms){
            this.adaptee = Thiefsms;
        }

    
        @Override
        public void sendMessage(String s){
            System.out.println("SMS from Thief ADAPTER: " +s);
            
        }
}
