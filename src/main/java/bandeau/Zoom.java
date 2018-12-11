package bandeau;

import java.awt.Font;

public class Zoom extends Effect {
    
     public Zoom(String text){ 
     super();
     message=text;
             }
     
     public void launchEffect(Bandeau myBandeau){
                myBandeau.setMessage(message);

                for (int i = 5; i < 60 ; i+=5) {
		myBandeau.setFont(new Font(message, Font.ITALIC, 5+i));
		myBandeau.sleep(100);
                }
     
     }
}
 