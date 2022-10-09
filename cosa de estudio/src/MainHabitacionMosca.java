import java.util.Scanner;

public class MainHabitacionMosca {

   
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion();
        Mosca m1=new Mosca("m1");
        Mosca m2=new Mosca("m2");
        Mosca m3=new Mosca("m3");
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce numero de veces a ejecutar");
        int numeroVecesEjecutar=teclado.nextInt();
        
        for(int i=0;i<numeroVecesEjecutar;i++){
        	System.out.println("Posición "+i);
        	habitacion.mostrarHabitacion();
        	habitacion.inicializarSuperficie();
        	habitacion.crearSituarMosca(habitacion.getAncho(),habitacion.getLargo(),m1);
        	habitacion.crearSituarMosca(habitacion.getAncho(),habitacion.getLargo(),m2);
        	habitacion.crearSituarMosca(habitacion.getAncho(),habitacion.getLargo(),m3);
        }
    }
}

