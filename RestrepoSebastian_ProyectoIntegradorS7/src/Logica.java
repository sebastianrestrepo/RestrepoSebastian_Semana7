import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private String[] nombresIni, datosIni, color;
	private String nombresUnido, datosUnido;
	private String[] nombresDiv, datosDiv;
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
		nombresUnido = app.join(nombresIni, " ");
		datosUnido = app.join(datosIni, " ");
	}

	public void dividir() {

		for (int i = 0; i < nombresDiv.length; i++) {
			//app.println(nombres[0]);
			nombresDiv = app.splitTokens(nombresUnido, " :");
			//nombres[i] = nombresDiv[0];
			//apellidos[i] = nombresDiv[1];
			p = new Palabra(app, nombresDiv[0], nombresDiv[1], null, null, null);
		}

		datosDiv = app.split(datosUnido, "/");
		//app.println(nombres);
		//app.println(datosDiv);
	}

	// FINAL DE LA CLASE L�GICA
}