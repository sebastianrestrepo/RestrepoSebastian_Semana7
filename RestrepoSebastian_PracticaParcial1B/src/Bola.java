import processing.core.PApplet;

public abstract class Bola {
	
	protected PApplet app;
	protected int posX, posY, tam;

	public Bola(PApplet app, int posX, int posY, int tam) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
	}
	
	public abstract void pintar();

	public boolean validar(int nx, int ny) {
		return nx > posX - (tam/2) && nx < posX + (tam/2) && ny > posY - (tam/2) && ny < posY + (tam/2);
	}
	
	public void mover(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}

}
