package pacientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

public class AplicacionPacientes {

	public static void main(String[] args) throws IOException {

		TreeSet<Ficha> archivo = new TreeSet<Ficha>();
		BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
		String entrada = null;
		do {
			menu();
			entrada = bufer.readLine();
			switch (Integer.parseInt(entrada)) {
			case 1:
				crear(archivo, bufer);
				break;

			case 2:
				listado(archivo);
				break;

			case 3:
				buscar(archivo, bufer);
				break;

			case 4:
				eliminar(archivo, bufer);
				break;
			case 0:
				System.out.println("----Fin de programa----");
				break;

			default:
				System.out.println("Numero incorrecto, por favor vuelva a introducir");
				break;
			}
		} while (!entrada.equals("0"));
	}

	private static void eliminar(TreeSet<Ficha> archivo, BufferedReader bufer) throws IOException {
		Iterator<Ficha> it = archivo.iterator();
		System.out.println("Introduce el numero de historia de la ficha a eliminar");
		String x = bufer.readLine();
		while (it.hasNext()) {
			Ficha aux = (Ficha) it.next();
			if (x.equals(aux.getNumeroHistoria()))
				archivo.remove(aux);
		}
	}

	private static void buscar(TreeSet<Ficha> archivo, BufferedReader bufer) throws IOException {
		Iterator<Ficha> it = archivo.iterator();
		System.out.println("Introduce el numero de historia de la ficha a mostrar");
		String x = bufer.readLine();
		while (it.hasNext()) {
			Ficha aux = (Ficha) it.next();
			if (x.equals(aux.getNumeroHistoria()))
				System.out.println(aux.toString());
		}
	}

	private static void listado(TreeSet<Ficha> archivo) {
		Iterator<Ficha> it = archivo.iterator();
		int cont = 0;
		while (it.hasNext()) {
			Ficha aux = (Ficha) it.next();
			System.out.println(aux.toString());
			cont++;
		}
		System.out.println("el numero total de fichas es de " + cont);
	}

	private static void crear(TreeSet<Ficha> archivo, BufferedReader bufer) throws IOException {
		System.out.println("Introduce el numero de historia");
		String num = bufer.readLine();
		System.out.println("Introduce el nombre");
		String nom = bufer.readLine();
		System.out.println("Introduce el diagnostico");
		String diag = bufer.readLine();
		archivo.add(new Ficha(num, nom, diag));
	}

	private static void menu() {
		System.out.println("----Menu de opciones----");
		System.out.println("1. A�adir ficha");
		System.out.println("2. Listado");
		System.out.println("3. Buscar ficha");
		System.out.println("4. Eliminar ficha");
		System.out.println("0. Salir");
	}

}
