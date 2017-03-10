import processing.core.PApplet;

public class BolaLinea extends Bola {

	private int linea;
	
	public BolaLinea(PApplet app, int posX, int posY, int tam, int linea) {
		super(app, posX, posY, tam);
		this.linea = linea;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		app.stroke(linea);
		app.noFill();
		app.ellipse(posX, posY, tam, tam);
	}

}
