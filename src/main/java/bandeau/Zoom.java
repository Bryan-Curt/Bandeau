import java.awt.Font;

package bandeau;

public class Zoom extends Effect {
    
     public Zoom(){
        for (int i = 5; i < 60 ; i+=5) {
		myBandeau.setFont(new Font(message, Font.ITALIC, 5+i));
		myBandeau.sleep(100);
	}
     }
     
     public void launchEffect(Bandeau myBandeau){
         myBandeau.setMessage(message);
     }
}
 