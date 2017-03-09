import java.util.*;
import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private String[] nombresIni, datosIni, color;
	private ArrayList<Palabra> palabras;
	private ArrayList<Palabra> palabrasUno;
	private TreeSet<Palabra> palabrasDos;
	private HashSet<Palabra> palabrasTres;
	private int posX, posY;
	private int pantalla;

	public Logica(PApplet app) {
		this.app = app;
		palabras = new ArrayList<Palabra>();
		palabrasUno = new ArrayList<Palabra>();
		palabrasDos = new TreeSet<Palabra>(new OrdenarEdad());
		palabrasTres = new HashSet<Palabra>();
		posX = 100;
		posY = 100;
		cargar();
		dividir();
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
			palabras.add(new Palabra(app, nombres, apellidos, cedula, edad, peso, r, g, b, posX));
		}
	}

	public void pintar() {
		switch (pantalla) {
		case 0:
			app.fill(255);
			app.text("ORIGINAL", 100, 80);
			for (int i = 0; i < palabras.size(); i++) {
				Palabra p = palabras.get(i);
				p.pintar(posY + (i * 20));
			}
			break;
		case 1:
			// Creación de las estructuras necesarias para ordenar y mostrar los
			// elementos, utilizando el	orden natural de estos sin excluir repetidos.
			Collections.sort(palabras);
			app.fill(255);
			app.text("ORDEN NATURAL", 100, 80);
			for (int i = 0; i < palabras.size(); i++) {
				Palabra p = palabras.get(i);
				p.pintar(posY + (i * 20));
			}
			break;
		case 2:
			// Creación de las estructuras necesarias para ordenar los elementos
			// mostrados en forma
			// ascendente según su peso, con un ordenamiento parcial sin excluir repetidos en peso.
			Collections.sort(palabrasUno, new OrdenarPeso());
			app.fill(255);
			app.text("SEGÚN PESO (ASCENDENTE)", 100, 80);
			for (int i = 0; i < palabrasUno.size(); i++) {
				Palabra p = palabrasUno.get(i);
				p.pintar(posY + (i * 20));
			}
			break;
		case 3:
			// Mostrar los elementos ordenados de acuerdo a la edad forma
			// descendente sin mostrar elementos repetidos en edad.
			app.fill(255);
			app.text("SEGÚN EDAD SIN REPETIDOS (DESCENDENTE)", 100, 80);
			Iterator<Palabra> it = palabrasDos.iterator();
			int i = 0;
			while (it.hasNext()) {
				Palabra p = it.next();
				p.pintar(posY + (i * 20));
				i++;
			}
			break;
		case 4:
			// Mostrar los no ordenados sin repetidos (según la igualdad base).
			app.fill(255);
			app.text("NO ORDENADOS SIN REPETIDOS (SUMA COLOR)", 100, 80);
			Iterator<Palabra> ite = palabrasTres.iterator();
			int j = 0;
			while (ite.hasNext()) {
				Palabra p = ite.next();
				p.pintar(posY + (j * 20));
				j++;
			}
			break;
		}
		// FIN DEL MÉTODO PINTAR
	}

	public void tecla() {
		switch (pantalla) {
		case 0:
			if (app.keyCode == '1') {
				pantalla = 1;
			}
			break;
		case 1:
			if (app.keyCode == '2') {
				pantalla = 2;
				palabrasUno.addAll(palabras);
			}
			break;
		case 2:
			if (app.keyCode == '3') {
				pantalla = 3;
				palabrasDos.addAll(palabras);
			}
			break;
		case 3:
			if (app.keyCode == '4') {
				pantalla = 4;
				palabrasTres.addAll(palabras);
			app.printArray(palabras);
			System.out.println(palabrasUno);
			System.out.println(palabrasDos);
			System.out.println(palabrasTres);
			break;
		}
		// FIN DEL MÉTODO TECLA
	  }
	}

	// FINAL DE LA CLASE LÓGICA
}