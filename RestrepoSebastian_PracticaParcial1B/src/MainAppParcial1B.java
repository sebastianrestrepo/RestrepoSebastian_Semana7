import processing.core.PApplet;

public class MainAppParcial1B extends PApplet {

	private Logica log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("MainAppParcial1B");
	}

	public void settings() {
		size(900, 700);
	}

	public void setup() {
		log = new Logica(this);
	}

	public void draw() {
		background(255);
		log.pintar();
	}

	public void mousePressed() {
		log.mousePressed();
	}

	public void mouseDragged() {
		log.mouseDragged();
	}

	public void mouseReleased() {
		log.mouseReleased();
	}

}
