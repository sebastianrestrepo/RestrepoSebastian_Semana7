import processing.core.PApplet;

public class Palabra implements Comparable<Palabra>{

	private PApplet app;
	private String nombres, apellidos, cedula;
	private int edad, peso;
	private int r, g, b;
	private int posX, posY;
	private int sumaColor;

	public Palabra(PApplet app, String nombres, String apellidos, String cedula, int edad, int peso, int r, int g,
			int b, int posX) {
		this.app = app;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		this.r = r;
		this.g = g;
		this.b = b;
		this.posX = posX;
		System.out.println(nombres + " " + apellidos + " " + cedula + " " + edad + " " + peso);
	}

	public void pintar(int posY) {
		sumaColor = r + g + b;
		this.posY = posY;
		app.fill(r, g, b);
		app.text(nombres + " " + apellidos + " " + cedula + " " + edad + " " + peso, posX, posY);
	}

	@Override
	public int compareTo(Palabra o) {
		// TODO Auto-generated method stub
		return getNombres().compareTo(o.getNombres());
	}
	
	public boolean equals(Palabra o){
		return sumaColor == o.getSumaColor();
	}
	
	public int hashCode(){
		return sumaColor;
	}
	
	//Getters y setters
	public String getNombres() {
		return nombres;
	}

	public int getSumaColor() {
		return sumaColor;
	}

	public void setSumaColor(int sumaColor) {
		this.sumaColor = sumaColor;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
