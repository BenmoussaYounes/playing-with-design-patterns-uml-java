package strcutural.composite.graphic;

import java.util.ArrayList;

public class Picture implements Graphic{
	
	private ArrayList<Graphic> graphics;
	
	public Picture() {
		graphics = new ArrayList<Graphic>();
	}
	
	public void add(Graphic g) {
		graphics.add(g);
	}
	
	public void remove(Graphic g) {
		graphics.remove(g);
	}

	@Override
	public void draw() {
		for(Graphic g:graphics) {
			g.draw();
		}
		
	}

}
