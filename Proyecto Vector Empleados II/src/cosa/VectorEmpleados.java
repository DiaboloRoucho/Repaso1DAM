package cosa;
import java.util.*;
public class VectorEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados e1, e2, e3, e4;
		e1=new Empleados();
		e2=new Empleados();
		e3=new Empleados();
		e4=new Empleados();
		Empleados [] v1= {e1, e2, e3, e4};
		for (int i = 0; i < v1.length; i++) {
			rellemp(v1[i]);
		}
		
	}

	public static void rellemp(Empleados x) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca el nombre del empleado");
		x.nombre=t.nextLine();
		System.out.println("Introduzca la dirección");
		x.setDireccion(t.nextLine());
		System.out.println("Introduzca la edad");
		x.setEdad(t.nextInt());
		System.out.println("Introduzca el salario");
		x.setSalario(t.nextDouble());
		t.close();
	}
}
