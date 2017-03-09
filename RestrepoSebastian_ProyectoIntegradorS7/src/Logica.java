import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private String[] nombresIni, datosIni, color;
	private Palabra p;
	private int posX, posY,x;

	public Logica(PApplet app) {
		this.app = app;
		p = null;
		posX = 100;
		posY = 100;
		cargar();
	}

	public void cargar() {
		nombresIni = app.loadStrings("../data/nombres.txt");
		datosIni = app.loadStrings("../data/datos.txt");
		color = app.loadStrings("../data/colores.txt");
	}

	public void dividir() {
		for (int i = 0; i < nombresIni.length; i++) {
			String[] nombresDiv = nombresIni[i].split(":");
			String[] datosNum = datosIni[i].split("/");
			String nombres = nombresDiv[0];
			String apellidos = nombresDiv[1];
			String cedula = datosNum[0];
			int edad = Integer.parseInt(datosNum[1]);
			int peso = Integer.parseInt(datosNum[2]);
			String[] colorDiv = color[i].split("/");
			int r = Integer.parseInt(colorDiv[0]);
			int g = Integer.parseInt(colorDiv[1]);
			int b = Integer.parseInt(colorDiv[2]);
			p = new Palabra(app, nombres, apellidos, cedula, edad, peso, r, g, b);
			p.pintar(posX, posY + (i*20));
		}
	}

	// FINAL DE LA CLASE LÓGICA
}