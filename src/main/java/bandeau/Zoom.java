package bandeau;

import java.awt.Font;

public class Zoom extends Effect {
    private int fontSize;
    private int percentZoom;
    private String font;
     public Zoom(String text,String font, int fontSize,int percentZoom){ 
     super();
     message=text;
     this.font=font;
     this.fontSize=fontSize;
     this.percentZoom=percentZoom;
     }
     
     public int launchEffect(Bandeau myBandeau){
                myBandeau.setMessage(message);
                int count = fontSize;
            for (int i = fontSize; i < fontSize+fontSize*(percentZoom/100) ; i++) {
		myBandeau.setFont(new Font(font, Font.PLAIN, fontSize+i));
		myBandeau.sleep(100);
                count=i;
                }
                return count;
     }
}
 