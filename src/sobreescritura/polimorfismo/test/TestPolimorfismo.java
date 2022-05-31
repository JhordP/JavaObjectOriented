package sobreescritura.polimorfismo.test;
import sobreescritura.metodos.domain.*;

public class TestPolimorfismo
{
	public static void main(String[] args) {
		Empleado emp1 = new Empleado("Carlos", 24642.24);
	    //System.out.println(emp1.obtenerDetalles());
	    emp1.setNombre("Jose");
	    imprimir(emp1); //Al utilizar el objeto de Empleado, utiliza el metodo de la clase padre.
	    
	    Gerente ger1 = new Gerente("Karla", 35483.16, "Contabilidad");
	    //System.out.println(ger1.obtenerDetalles());
	    imprimir(ger1); //Al utilizar el objeto de Gerente, utiliza el metodo de la clase hija.
	}
	
	public static void imprimir(Empleado empleado){ //El argumento que debe recibir el metodo en este caso debe ser la clase mas arriba en la jerarquia(el padre).
	
	//Utiliza el metodo obtenerDetalles() del tipo de objeto que lo llame. Si el objeto es la clase padre, usa el metodo de la clase padre. Si es la hija, entonces usa el metodo de la misma.
	    System.out.println(empleado.obtenerDetalles()); 
	}
}
