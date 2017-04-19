
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] notas = {1,1,2,3,3};
		Examen e1 = new Examen(notas);
		System.out.printf("Media: %.02f%n", e1.getMedia());
		System.out.printf("Varianza: %.02f%n", e1.getVarianza());
		System.out.printf("Desviacion: %.02f%n", e1.getDesviacionEstandar());
		System.out.printf("Mediana: %.02f%n", e1.getMediana());
		
		int[] modas = e1.getModa();
		for(int moda:modas) {
			System.out.println(moda);
		}
		
		/*
		notas = new double[]{1,1,2,2};
		Examen e2 = new Examen(notas);
		System.out.printf("Mediana: %.02f%n", e2.getMediana());
		*/
	}

}
