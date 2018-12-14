
package bandeau;

import java.awt.Color;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Rainbow extends Effect {
    public Rainbow(String text){
        super();
        message=text;
    }
    
    public void launchEffect(Bandeau myBandeau, int nbSec) throws InterruptedException{
        myBandeau.setMessage(message);
        int i = -1;
        while (i <= nbSec){
        Random r = new Random();
        myBandeau.setBackground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
        myBandeau.sleep(175);
        if(nbSec!=0){
            i++; 
        }
        
    }
    }
}
