package instanceof.test;
import instanceof.domain.*;

public class TestInstanceOf {
    public static void main (String[] args) {
       	Empleado emp1 = new Empleado("Carlos", 24642.24);
	    determinarTipo(emp1); //Solo indica que es del tipo padre y el padre mas arriba(Object) eso si se usa solamente IF.
	    
	    emp1 = new Gerente("Karla", 35483.16, "Contabilidad"); //Hace una nueva referencia a la clase hija.
	    determinarTipo(emp1); //Indica que es de los 3 tipos. La hija, el padre y Object que es padre de Empleado.
	}
	
	public static void determinarTipo(Empleado empleado){ //El argumento que debe recibir el metodo en este caso debe ser la clase mas arriba en la jerarquia(el padre).
	    System.out.println("---Separador de funcion---");
	    if (empleado instanceof Gerente){ //Se recomienda primero preguntar por las clases hijas y luego ir jerarquicamente hacia arriba
	        System.out.println("Es de tipo Gerente.");
	    }
	    if (empleado instanceof Empleado) { //Ya aqui se pregunta del padre.
	        System.out.println("Es de tipo Empleado.");
	    }
	    if (empleado instanceof Object) {
	        System.out.println("Es de tipo Object."); //Y por ultimo si es tipo Object que es la padre de todos los objetos.
	    }
	    /*Si solo se pone IF y no ELSE IF, entonces la funcion respondera dependiendo de si es del tipo hijo o padre, el tipo que es.
	    Si es del tipo hijo, entonces dira que es del tipo hijo, y tambien de sus padres mas arriba. Si la clase referenciada tiene 
	    subclases, entonces no dira que es del tipo de las subclases sino del tipo de ella misma y las mas arriba.*/
  }
}
