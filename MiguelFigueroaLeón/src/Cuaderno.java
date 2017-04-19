
public class Cuaderno {
	public static final int NUMERO_EXAMENES = 15;
	// variables de instancia
	private final int NUMERO_ALUMNOS;
	// Todas los exámenes tienen el mismo número de alumnos (p.e. 5)
	private Examen[] examenes;
	private int numeroExamenes;

	
	public Cuaderno(Examen[] examenes) {
		this.examenes = examenes;
		this.numeroExamenes = examenes.length;
		this.NUMERO_ALUMNOS = examenes[0].NUMERO_ALUMNOS;
	}
	
	public double[] getMedias() {
		Examen[] actualExams = this.getExamenes();
		int numberOfExams = actualExams.length;
		int numberOfStudents = 0;
		if(this.numeroExamenes>0) { 
			numberOfStudents = this.examenes[0].getNotas().length;
		}
		double[] averageOfStudents = new double[numberOfStudents];
		int[] examMarks;
		//double weight = (double) 1/numberOfExams;
		int examWeight = 0;
		for(int i=0;i<numberOfExams;i++) {
			examMarks = this.examenes[i].getNotas();
			examWeight = this.examenes[i].getNUMERO_ALUMNOS();
			for(int j=0;j<numberOfStudents;j++) {
				averageOfStudents[j] += examMarks[j]*examWeight;
			}
		}
		return averageOfStudents;
	}
	/*
	public double[] getVarianzas() {
		
	}
	
	public double[] getDesviacionEstandars() {
		
	}
	
	public int[] getModa() {
		
	}
	
	public double getMediana() {
		
	}
	*/

	public Examen[] getExamenes() {
		Examen[] realExams = new Examen[this.numeroExamenes];
		for(int i = 0; i < realExams.length; i++) {
			realExams[i] = this.examenes[i];
		}
		return realExams;
	}

	public void setExamenes(Examen[] examenes) {
		this.examenes = examenes;
	}

	public int getNumeroExamenes() {
		return numeroExamenes;
	}

	public void setNumeroExamenes(int numeroExamenes) {
		this.numeroExamenes = numeroExamenes;
	}

	public int getNUMERO_ALUMNOS() {
		return NUMERO_ALUMNOS;
	}
}