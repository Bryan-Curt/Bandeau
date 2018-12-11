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
public class TextColor extends Effect{
    private String text;
    
    public TextColor(String text){
        super();
        this.text=text;
    }
    
    public void launchEffect(Bandeau myBandeau){
        myBandeau.setMessage("Hello");
 
    }
}
