package bandeau;

import java.awt.Font;

public class Zoom extends Effect {
    
     public Zoom(){ }
     
     public void launchEffect(Bandeau myBandeau){
                for (int i = 5; i < 60 ; i+=5) {
		myBandeau.setFont(new Font(message, Font.ITALIC, 5+i));
		myBandeau.sleep(100);
	}
                myBandeau.setMessage(message);
     
     }
}
 