package strcutural.composite.graphic;

public class Main {

	public static void main(String[] args) {
		Picture picture = new Picture();
		picture.add(new Text());
		// composite
		Picture smallPicture = new Picture();
		smallPicture.add(new Rectangle());
		smallPicture.add(new Line());
		
		picture.add(smallPicture);
		
		
		picture.draw();
	}

}
