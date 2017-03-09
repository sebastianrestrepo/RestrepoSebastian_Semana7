import processing.core.PApplet;

public class MainAppIntegradorS7 extends PApplet {

	private Logica log;

	public static void main(String[] args) {
		PApplet.main("MainAppIntegradorS7");
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		log = new Logica(this);
	}

	public void draw() {
		background(0);
		log.dividir();
	}

}
