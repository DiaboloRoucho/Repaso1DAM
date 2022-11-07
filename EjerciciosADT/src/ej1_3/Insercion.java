package ej1_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class Insercion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f = new File (".\\Maraca.dat");// Se crea el archivo junto con la ruta de acceso relativa
		RandomAccessFile r = new RandomAccessFile(f, "rw");
		System.out.println("Introduzca la posición de inserción: ");
		int id = Integer.parseInt(br.readLine());
		long pos = (id - 1) * 36;
		r.seek(pos);
		System.out.println("Introduzca el departamento: ");//Se mete el dep
		int d = Integer.parseInt(br.readLine());
		int [] departamento = {d};
		System.out.println("Introduzca el apellido: ");//Se mete el apellido
		String a = br.readLine();
		String [] apellido = {a};
		System.out.println("Introduzca el salario: ");//Se mete el salario
		double s = Double.parseDouble(br.readLine());
		double [] salario = {s};
		StringBuffer sb = null;
		int n = apellido.length;
		for (int i = 0; i < n; i++) {
			r.writeInt(id);
			sb = new StringBuffer(apellido[i]);
			sb.setLength(10);
			r.writeChars(sb.toString());
			r.writeInt(departamento[i]);
			r.writeDouble(salario[i]);
		}
		r.close();
	}

}
