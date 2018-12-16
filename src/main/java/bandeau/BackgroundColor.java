package bandeau;

import java.awt.Color;

public class BackgroundColor extends Effect {
    private Color color;
    public BackgroundColor(String text,Color color){
        super();
        message=text;
        this.color=color;
    }
    
    public void launchEffect(Bandeau myBandeau){
    myBandeau.setMessage(message);
    myBandeau.sleep(1000);
    myBandeau.setBackground(color);
    }
}
