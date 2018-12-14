
package bandeau;

import java.awt.Color;

public class Rainbow extends Effect {
    public Rainbow(String text){
        super();
        message=text;
    }
    
    public void launchEffect(Bandeau myBandeau){
    myBandeau.setMessage(message);
    }
}
