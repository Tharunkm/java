package week6;
public class Box {
	int width;
	int height;
	int depth;
	public Float volume;
    Box(int width, int height, int depth){
    	this.width =width;
    	this.height =height;
    	this.depth =depth;
    
	}
	Float CalculateVolume() {
    	return (float) (width*height*depth);
    }
}
