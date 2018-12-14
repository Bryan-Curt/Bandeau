
package bandeau;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Rainbow extends Effect {
    public Rainbow(String text){
        super();
        message=text;
    }
    
    public void launchEffect(Bandeau myBandeau) throws InterruptedException{
        myBandeau.setMessage(message);
        int i = 0;
        while (i <= 25){
        Random r = new Random();
        myBandeau.setBackground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
        myBandeau.sleep(100);        
        i++;
    }
    }
}
