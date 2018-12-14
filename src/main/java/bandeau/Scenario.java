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
    
    public static void main(String[] args) throws InterruptedException {
	    new Scenario().scenario();
    }
    
    
    public void scenario() throws InterruptedException{
       String text="Oui";
       new Rainbow(text).launchEffect(myBandeau);
       new BackgroundColor(text).launchEffect(myBandeau);
       new TextColor(text).launchEffect(myBandeau);
       new Zoom(text).launchEffect(myBandeau);
       new TextRotation(text).launchEffect(myBandeau);
    }
    
}

