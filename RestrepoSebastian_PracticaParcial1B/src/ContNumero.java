import processing.core.PApplet;

public class ContNumero extends Contenedor {

	public ContNumero(PApplet app, int posX, int posY, int tam) {
		super(app, posX, posY, tam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		app.stroke(0);
		app.noFill();
		app.textSize(30);
		app.text("N", posX-10, posY+10);
		app.ellipse(posX, posY, tam, tam);
	}

}
