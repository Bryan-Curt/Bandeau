package bandeau;

import java.awt.Color;

public class BackgroundColor extends Effect {
    public BackgroundColor(String text){
        super();
        message=text;
    }
    
    public void launchEffect(Bandeau myBandeau){
    myBandeau.setMessage(message);
    myBandeau.sleep(1000);
    myBandeau.setBackground(Color.RED);
    }
}
