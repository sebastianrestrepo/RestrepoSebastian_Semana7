import java.util.*;
import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private ArrayList<Contenedor> c;
	private ArrayList<Bola> bolas;
	private int bx, by;
	private int cx, cy;
	private Object selector;
	private String[] datos;

	public Logica(PApplet app) {
		this.app = app;
		cx = 100;
		cy = 100;
		c = new ArrayList<Contenedor>();
		bolas = new ArrayList<Bola>();
		c.add(new ContTamano(app, cx, cy, 60));
		c.add(new ContNumero(app, cx, cy + 150, 60));
		c.add(new ContColor(app, cx, cy + 300, 60));
		c.add(new ContRojo(app, cx, cy + 450, 60));
		selector = null;
		datos = app.loadStrings("../data/practica.txt");
		cargarTxt();
	}

	public void cargarTxt() {
		for (int i = 0; i < datos.length; i++) {

			String[] datosDiv = datos[i].split(":");
			int tam = Integer.parseInt(datosDiv[0]);
			int num = Integer.parseInt(datosDiv[1]);
			int linea = Integer.parseInt(datosDiv[2]);
			int r = Integer.parseInt(datosDiv[3]);
			int g = Integer.parseInt(datosDiv[4]);
			int b = Integer.parseInt(datosDiv[5]);
			System.out.println(tam + " " + num + " " + linea + " " + r + " " + g + " " + b);
			bx = (int) app.random(200, 800);
			by = (int) app.random(100, 600);
			bolas.add(new Bola(app, bx, by, tam, num, linea, r, g, b));
		}
	}

	public void pintar() {
		for (int i = 0; i < c.size(); i++) {
			Contenedor cont = c.get(i);
			cont.pintar();
		}
		for (int j = 0; j < bolas.size(); j++) {
			Bola bo = bolas.get(j);
			bo.pintar();
		}
	}

	public void mousePressed() {
		for (int i = 0; i < c.size(); i++) {
			Contenedor cont = c.get(i);
			if (cont.validar(app.mouseX, app.mouseY)) {
				selector = cont;
			}
		}
		//
		for (int j = 0; j < bolas.size(); j++) {
			Bola bo = bolas.get(j);
			if (bo.validar(app.mouseX, app.mouseY)) {
				selector = bo;
			}
		}
	}

	public void mouseDragged() {
		if (selector != null) {
			if (selector instanceof Contenedor) {
				((Contenedor) selector).mover(app.mouseX, app.mouseY);
			} else if (selector instanceof Bola) {
				((Bola) selector).mover(app.mouseX, app.mouseY);
			}
		}
	}

	public void mouseReleased() {
		if (selector != null) {
			selector = null;
		}
	}

}
