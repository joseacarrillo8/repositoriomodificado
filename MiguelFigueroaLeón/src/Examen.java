import java.util.Arrays;

public class Examen {
	//variable de clase
	public static final int MAXIMA_CALIFICACION = 10;
	//variables de instancia
	public final int NUMERO_ALUMNOS;
	int[] notas;
	
	public Examen(int[] notas) {
		this.NUMERO_ALUMNOS = notas.length;
		this.notas = notas;
	}
	
	public double getMedia() {
		double sumaDeTodasLasNotas = 0;
		for(double nota:this.notas) {
			sumaDeTodasLasNotas += nota;
		}
		return sumaDeTodasLasNotas/notas.length;
	}
	
	public double getVarianza() {
		double media = getMedia(); 
		int numeroElementos = notas.length;
		double sumatorio = 0;
		for(double x:notas) {
			sumatorio += Math.pow(x-media,2);
		}
		return (double)sumatorio/numeroElementos;
	}
	
	public double getDesviacionEstandar() {
		return Math.sqrt(getVarianza());
	}
	
	public int[] getModa() {
		int[] arrayFrecuencias = new int[11];
		for(int i=0;i<notas.length;i++) {
			arrayFrecuencias[notas[i]]++;
		}
		int maxFrecuencia = 0;
		for(int i=0;i<arrayFrecuencias.length;i++) {
			if(arrayFrecuencias[i]>maxFrecuencia) maxFrecuencia= arrayFrecuencias[i];
		}

		int numMaxFrecuencia = 0;
		for(int i=0;i<arrayFrecuencias.length;i++) {
			if(arrayFrecuencias[i]==maxFrecuencia) numMaxFrecuencia++;
		}
		int[] moda = new int[numMaxFrecuencia];
		int indice = 0;
		for(int i=0;i<arrayFrecuencias.length;i++) {
			if(arrayFrecuencias[i]==maxFrecuencia) moda[indice++]=i;
		}
		return moda;
	}
	
	public double getMediana() {
		Arrays.sort(notas);
		double mediana = 0;
		int numeroElementos = notas.length;
		if(numeroElementos%2==0) {
			mediana = (notas[numeroElementos/2-1]+notas[numeroElementos/2])/2;
			return mediana;
		}
		else return notas[numeroElementos/2];
	}
	
	private int[] getArrayFrecuencias() {
		return notas;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public static int getMaximaCalificacion() {
		return MAXIMA_CALIFICACION;
	}

	public int getNUMERO_ALUMNOS() {
		return NUMERO_ALUMNOS;
	}
}

