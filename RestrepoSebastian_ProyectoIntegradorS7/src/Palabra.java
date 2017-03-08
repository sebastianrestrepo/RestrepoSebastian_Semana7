import processing.core.PApplet;

public class Palabra {

	private PApplet app;
	private String nombres, apellidos, cedula;
	private int edad, peso;
	private int r, g, b;

	public Palabra(PApplet app, String nombres, String apellidos, String cedula, int edad, int peso) {
		this.app = app;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		System.out.println(nombres + " " + apellidos + " " + cedula + " " + edad + " " + peso);
	}
	
}
