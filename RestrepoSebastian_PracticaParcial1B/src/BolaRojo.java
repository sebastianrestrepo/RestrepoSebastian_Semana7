import processing.core.PApplet;

public class BolaRojo extends Bola {

	private int r, g, b;
	
	public BolaRojo(PApplet app, int posX, int posY, int tam, int r, int g, int b) {
		super(app, posX, posY, tam);
		// TODO Auto-generated constructor stub
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		app.noStroke();
		app.fill(r, g, b);
		app.ellipse(posX, posY, tam, tam);
	}

}
