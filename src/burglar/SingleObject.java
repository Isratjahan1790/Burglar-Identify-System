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
public class SingleObject {
    
    private static SingleObject instance = new SingleObject();
   
    private SingleObject(){}

    
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(String s){
        System.out.println(s+" detected");
	    }
}
