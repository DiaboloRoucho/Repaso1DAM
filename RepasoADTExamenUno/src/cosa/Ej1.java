package cosa;

import java.io.*;

public class Ej1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  try {
		        FileReader f = new FileReader("D:\\Escritorio\\cosa.txt");
		        int i=f.read();
		        while(i!=-1) {
		            char m = (char) i;
		            System.out.print(m);
		            i=f.read();
		        }
		        f.close();
		    } catch (FileNotFoundException e) {
		        // TODO Auto-generated catch block
		        System.out.println("No existe fichero");

		    } catch (IndexOutOfBoundsException e) {
		        // TODO Auto-generated catch block
		        System.out.println("No hay argumento");

		    }
	}

}
