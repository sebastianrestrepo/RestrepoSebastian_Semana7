import java.util.*;
import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private ArrayList<Contenedor> c;
	private int cx, cy;
	private Contenedor selector;

	public Logica(PApplet app) {
		this.app = app;
		cx = 100;
		cy = 100;
		c = new ArrayList<Contenedor>();
		c.add(new ContTamano(app, cx, cy, 60));
		c.add(new ContNumero(app, cx, cy + 150, 60));
		c.add(new ContColor(app, cx, cy + 300, 60));
		c.add(new ContRojo(app, cx, cy + 450, 60));
		selector = null;
	}

	public void cargarTxt(){
		
	}
	
	public void pintar() {
		for (int i = 0; i < c.size(); i++) {
			Contenedor cont = c.get(i);
			cont.pintar();
		}
	}

	public void mousePressed() {
		for (int i = 0; i < c.size(); i++) {
			Contenedor cont = c.get(i);
			if (cont.validar(app.mouseX, app.mouseY)) {
				selector = cont;
			}
		}
	}

	public void mouseDragged() {
		if (selector != null) {
			selector.mover(app.mouseX, app.mouseY);
		}
	}

	public void mouseReleased() {
		if (selector != null) {
			selector = null;
		}
	}

}
