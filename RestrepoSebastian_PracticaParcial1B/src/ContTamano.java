import processing.core.PApplet;

public class ContTamano extends Contenedor {

	public ContTamano(PApplet app, int posX, int posY, int tam) {
		super(app, posX, posY, tam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		app.stroke(0);
		app.noFill();
		app.textSize(10);
		app.text("T", posX, posY);
		app.ellipse(posX, posY, tam, tam);
	}

}
