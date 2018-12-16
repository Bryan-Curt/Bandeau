/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author bcurt
 */
public class TextSettings extends Effect{
    
    private Color color;
    private int fontSize;
    private String font; 
    public TextSettings(String text,Color color,String font,int fontSize){
        super();
        message=text;
        this.color=color;
        this.font=font;
        this.fontSize=fontSize;
 
    }
    
    public void launchEffect(Bandeau myBandeau){
        myBandeau.setMessage(message);
        myBandeau.setForeground(this.color);
        myBandeau.setFont(new Font(this.font,Font.PLAIN,fontSize));
 
    }
}
