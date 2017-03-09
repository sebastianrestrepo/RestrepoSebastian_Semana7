import java.util.Comparator;

public class OrdenarEdad implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof Palabra && o2 instanceof Palabra){
			Palabra tempA = (Palabra)  o1;
			Palabra tempB = (Palabra)  o2;
			return tempB.getEdad() - tempA.getEdad();
		}
		return -1;
	}

}
