import processing.core.PApplet;

public class Palabra {

	private PApplet app;
	private String nombres, apellidos, cedula, edad, peso;
	private int r, g, b;

	public Palabra(PApplet app, String nombres, String apellidos, String cedula, String edad, String peso) {
		this.app = app;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
	}

}
