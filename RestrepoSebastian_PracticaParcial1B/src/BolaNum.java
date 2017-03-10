import processing.core.PApplet;

public class BolaNum extends Bola {

	private String numero;
	
	public BolaNum(PApplet app, int posX, int posY, int tam, String numero) {
		super(app, posX, posY, tam);
		this.numero = numero;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		app.stroke(0);
		app.noFill();
		app.textSize(30);
		app.text("numero", posX-10, posY+10);
		app.ellipse(posX, posY, tam, tam);
	}

}
