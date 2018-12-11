package bandeau;

public class TextRotation extends Effect {
    
    public TextRotation(String text){
        super();
        message=text;
    }
    public void launchEffect(Bandeau myBandeau){
        myBandeau.setMessage(message);
        for (int i = 0; i <= 100; i++) {
		myBandeau.setRotation(2*Math.PI*i / 100);
		myBandeau.sleep(100);
	}
 
    }
}
