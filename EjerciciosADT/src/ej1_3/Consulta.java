package ej1_3;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		RandomAccessFile r;
		int id = 0;
		try {
			id = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Numero de empleado incorrecto.");
		}
		int reg;
		try {
			char [] apellido = new char[10];
			File f = new File(".\\Maraca.dat");
			r = new RandomAccessFile(f, "r");
			reg = id;
			int d = (reg - 1) * 36;
			int e = (reg - 2) * 36;
			if (f.length() < (d + 1)) {
				System.out.println("ID: " + id + " | El empleado no existe, ID demasiado grande.");
				r.close();
			} else {
				long pos = d;
				r.seek(pos);
				id = r.readInt();
				char aux;
				for (int i = 0; i < apellido.length; i++) {
					aux = r.readChar();
					apellido[i] = aux;
				}
				String a = new String (apellido);
				int dep = r.readInt();
				double sal = r.readDouble();
				if (reg != id) {
					System.out.println("ID: " + reg + " | El empleado no existe - Hueco.");
				} else {
					System.out.println("[ID: " + id + "] [DEPARTAMENTO: " + dep + "] [APELLIDO: " + a.trim() + "] [SALARIO: " + sal + "]");
				}
				r.close();
			}
		} catch (EOFException e) {
			System.out.println("ID: " + id + " | El empleado no existe, ID demasiado grande.");
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		} 
	}

}
