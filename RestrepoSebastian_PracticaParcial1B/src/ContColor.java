import processing.core.PApplet;

public class ContColor extends Contenedor {

	public ContColor(PApplet app, int posX, int posY, int tam) {
		super(app, posX, posY, tam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		app.stroke(0);
		app.fill(0);
		app.textSize(30);
		app.text("C", posX-10, posY+10);
		app.noFill();
		app.ellipse(posX, posY, tam, tam);
	}

}
