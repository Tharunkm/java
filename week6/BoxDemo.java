package week6;
public class BoxDemo extends Box {
        BoxDemo(int width, int height, int depth) {
		super(width, height, depth);
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
		Box bx= new Box(6,8,12);
		bx.volume= bx.CalculateVolume();
		System.out.println("volume="+bx.volume);
	}

}
