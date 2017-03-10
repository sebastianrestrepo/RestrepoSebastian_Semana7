import processing.core.PApplet;

public class Bola {

	protected PApplet app;
	protected int posX, posY, tam, num, linea, r, g, b;

	public Bola(PApplet app, int posX, int posY, int tam, int num, int linea, int r, int g, int b) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.num = num;
		this.linea = linea;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public void pintar() {
		app.strokeWeight(2);
		app.stroke(linea);
		app.fill(r, g, b);
		app.textSize(30);
		app.text("num", posX - 10, posY + 50);
		app.ellipse(posX, posY, tam, tam);
	}

	public void pintarTam(int cx, int cy) {
		app.noStroke();
		app.fill(r, g, b);
		app.ellipse(cx, cy, tam, tam);
	}

	public void pintarNum(int cx, int cy) {
		app.noStroke();
		app.textSize(30);
		app.text("num", posX - 10, posY + 50);
		app.ellipse(cx, cy, tam, tam);
	}

	public void pintarLinea(int cx, int cy) {
		app.strokeWeight(2);
		app.stroke(linea);
		app.noFill();
		app.ellipse(cx, cy, tam, tam);
	}

	public void pintarRojo(int cx, int cy) {
		app.noStroke();
		app.fill(r, g, b);
		app.ellipse(cx, cy, tam, tam);
	}

	public boolean validar(int nx, int ny) {
		return nx > posX - (tam / 2) && nx < posX + (tam / 2) && ny > posY - (tam / 2) && ny < posY + (tam / 2);
	}

	public void mover(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

}
