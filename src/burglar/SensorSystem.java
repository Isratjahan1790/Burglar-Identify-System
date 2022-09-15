/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burglar;

  import java.util.Enumeration;  
    import java.util.Vector;

public class SensorSystem {
    private Vector listeners = new Vector();  
      
     public void register(SensorListener sensorListener) {  
            listeners.addElement(sensorListener);  
      }  
      
        public void notifyUser() {  
            for (Enumeration e = listeners.elements(); e.hasMoreElements();) {  
                ((SensorListener) e.nextElement()).detected();  
	    }  
       }
}
