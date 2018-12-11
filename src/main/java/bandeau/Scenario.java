/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author bcurt
 */
public class Scenario {
    private final Bandeau myBandeau = new Bandeau();
    
    public static void main(String[] args) {
	    new Scenario().scenario();
    }
    
    
    public void scenario(){
       new TextColor("dgdgs").launchEffect(myBandeau);
       new Zoom("dgdgs").launchEffect(myBandeau);
       //new TextRotation().launchEffect(myScenario);
    }
    
}

