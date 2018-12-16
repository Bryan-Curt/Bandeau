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
       String text="Bienvenue chez McDonald's";
       int fontSize = 20;
       String font = "Comic Sans MS";
       new TextSettings(text,Color.YELLOW,font,fontSize).launchEffect(myBandeau);
       new BackgroundColor(text,new Color(0,100,0)).launchEffect(myBandeau);
       myBandeau.sleep(2000);
       fontSize = new Zoom(text,font,fontSize,100).launchEffect(myBandeau);
                       System.out.println(fontSize);

       String text2="Venez comme vous êtes !";
       new TextSettings(text2,Color.ORANGE,font,fontSize).launchEffect(myBandeau);
       new Rainbow(text2).launchEffect(myBandeau,25);
       
       String text3="Avec la vraie couleur c'est mieux";
       new BackgroundColor(text3,Color.RED).launchEffect(myBandeau);
       new TextSettings(text3,Color.YELLOW,font,fontSize).launchEffect(myBandeau);
       myBandeau.sleep(2000);
       
       
       String text4="Mais venez quand même";
       new TextSettings(text4,Color.YELLOW,font,fontSize).launchEffect(myBandeau);
       new TextRotation(text4).launchEffect(myBandeau);

       new TextSettings("PALAPA",Color.YELLOW,font,fontSize).launchEffect(myBandeau);
       myBandeau.sleep(1000);
       new TextSettings("PA  PA",Color.YELLOW,font,fontSize).launchEffect(myBandeau);

    }
    
}

