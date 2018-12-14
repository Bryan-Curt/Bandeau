
package bandeau;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class Rainbow extends Effect {
    public Rainbow(String text){
        super();
        message=text;
    }
    
    public void launchEffect(Bandeau myBandeau) throws InterruptedException{
        int i = 0;
        while (i <= 5){
        myBandeau.setBackground(Color.RED);
        TimeUnit.SECONDS.sleep(2);
    }
    myBandeau.setMessage(message);
    }
}
