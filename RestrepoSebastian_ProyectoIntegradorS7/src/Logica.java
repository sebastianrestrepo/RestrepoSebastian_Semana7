import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private String[] nombresIni, datosIni, color;
	private String nombresUnido, datosUnido;
	private String[] nombres, apellidos;
	private Palabra p;

	public Logica(PApplet app) {
		this.app = app;
		p = null;
		cargar();
		unir();
		dividir();
	}

	public void cargar() {
		nombresIni = app.loadStrings("../data/nombres.txt");
		datosIni = app.loadStrings("../data/datos.txt");
	}

	public void unir() {

	}

	public void dividir() {
		for (int i = 0; i < nombresIni.length; i++) {
			String[] nombresDiv = nombresIni[i].split(":");
			String[] datosNum = datosIni[i].split("/");
			String cedula = datosNum[0];
			int edad = Integer.parseInt(datosNum[1]);
			int peso = Integer.parseInt(datosNum[2]);
			p = new Palabra(app, nombresDiv[0], nombresDiv[1], cedula, edad, peso);
		}
	}

	// FINAL DE LA CLASE L�GICA
}