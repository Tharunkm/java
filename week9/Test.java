package week9;
import week9.Playable;
import week9.Veena;
import week9.Saxophone;
public class Test {
	public static void main(String args[]) {
		Veena veena=new Veena();
		veena.play();
		Saxophone saxophone= new Saxophone();
		saxophone.play();
		Playable playableVeena = new Veena();
		playableVeena.play();
		Playable playableSaxophone = new Saxophone();
		playableSaxophone.play();
	}
}
