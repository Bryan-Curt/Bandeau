/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

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
       new Rainbow(text).launchEffect(myBandeau,175);
       String text2="Les couleurs de McDonald's !";
       new BackgroundColor(text2).launchEffect(myBandeau);
       new TextColor(text2).launchEffect(Color.YELLOW,myBandeau);
       new Zoom(text2).launchEffect(myBandeau);
       new TextRotation(text2).launchEffect(myBandeau);
    }
    
}

