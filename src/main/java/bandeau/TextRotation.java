package bandeau;

public class TextRotation extends Effect {
    
    public TextRotation(){
        super();
    }
    public void launchEffect(Bandeau myBandeau){
        for (int i = 0; i <= 100; i++) {
		myBandeau.setRotation(2*Math.PI*i / 100);
		myBandeau.sleep(100);
	}
        myBandeau.setMessage(message);
 
    }
}
