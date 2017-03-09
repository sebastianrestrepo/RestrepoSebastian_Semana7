import processing.core.PApplet;

public class Palabra {

	private PApplet app;
	private String nombres, apellidos, cedula;
	private int edad, peso;
	private int r, g, b;
	private int posX, posY, x;

	public Palabra(PApplet app, String nombres, String apellidos, String cedula, int edad, int peso, int r, int g,
			int b) {
		this.app = app;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		this.r = r;
		this.g = g;
		this.b = b;
		System.out.println(nombres + " " + apellidos + " " + cedula + " " + edad + " " + peso);
	}

	public void pintar(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		app.fill(r, g, b);
		app.text(nombres + " " + apellidos + " " + cedula + " " + edad + " " + peso, posX, posY);
	}

}
