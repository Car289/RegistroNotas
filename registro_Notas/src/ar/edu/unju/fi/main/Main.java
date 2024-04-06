package ar.edu.unju.fi.main;
import java.util.Scanner;
import ar.edu.unju.fi.notas.Alumno;
import ar.edu.unju.fi.notas.Materia;
import ar.edu.unju.fi.notas.RegistroNotas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 2);
		
	}	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		scanner.close();
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMateria) {
		Scanner scanner = new Scanner(System.in);
		while(numMateria <= 2) { //permite cargar 2 materias
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo de registro de nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNotas registroNotas = new RegistroNotas(codigoNota, alumno, materia, nota);
			System.out.println(registroNotas.toString());
			numMateria++;
			scanner.close();
		}
			
	}
	
}
