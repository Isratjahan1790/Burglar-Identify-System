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
public class MotionSmsAdapter implements Sms{
     private MotionSms adaptee;

    public MotionSmsAdapter(MotionSms motionsms){
        this.adaptee = motionsms;
    }

    @Override
    public void sendMessage(String s){
        System.out.println("SMS from MOTION ADAPTER: " +s);
        
	    }
}
