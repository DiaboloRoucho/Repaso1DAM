import java.util.Scanner;

public class Habitacion {

	private String[][]superficie;
	private int ancho;
	private int largo;
	
	public void inicializarSuperficie(){
		String simbolo="-";
        for(int fila=0;fila<superficie.length;fila++)
            for(int col=0;col<superficie[fila].length;col++){
                superficie[fila][col]=simbolo;
            }
	}	
    
    public Habitacion() {
    	Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el ancho de la habitacion");
        ancho=teclado.nextInt();
        System.out.println("Introduce el largo de la habitacion");
        largo=teclado.nextInt();
        superficie=new String[ancho][largo];
        System.out.println("Habitación Creada");
        inicializarSuperficie();        
    }
    
    public void mostrarHabitacion(){
        for(int fila=0;fila<superficie.length;fila++){
            for(int col=0;col<superficie[fila].length;col++){
                System.out.print(superficie[fila][col]+" ");
                
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void crearSituarMosca(int f,int c, Mosca m){
        boolean continuar=true;
        
        do {
        	m.setX((int)(Math.random()*f));
        	m.setY((int)(Math.random()*c));
        	if (superficie[m.getX()][m.getY()]=="-") {
        		superficie[m.getX()][m.getY()]=m.getNombre();
        		continuar=false;
        	}
        }        		
        while (continuar);
    }

    public String[][] getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String[][] superficie) {
        this.superficie = superficie;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
}

