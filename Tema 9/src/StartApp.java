import java.util.ArrayList;


// TODO: Auto-generated Javadoc
/**
 * The Class StartApp.
 */
public class StartApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Objeto","Persona","dni", Sexo.HOMBRE);
		Persona p2 = new Trabajador("Objeto","Trabajador","dni",Sexo.HOMBRE, "nss");
		Persona p3 = new EmpleadoComision("Objeto","Trabajador","dni",Sexo.HOMBRE, "nss",0,0);
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		Persona.clasifica(personas);
		
	}
}