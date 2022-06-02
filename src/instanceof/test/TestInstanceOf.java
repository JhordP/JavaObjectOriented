package instanceof.test;
import instanceof.domain.*;

//***A TENER EN CUENTA EN CUANTO A COMPATIBILIDAD CON INSTANCIAS Y REFERENCIAS DE CLASES***//
/**
1.Las clases hijas son al mismo tiempo, tipo hija y tipo padre/s. En este caso un objeto tipo Gerente es tambien tipo Empleado.

2.Al ser del tipo del padre al mismo tiempo, una referencia o instancia (la parte derecha de una asignacion de objeto) puede ser considerada
  por un argumento como un elemento del tipo padre.
  
3.Un objeto del tipo padre no es al mismo tiempo un objeto de clase hija(Ya que si esta clase padre tiene varias clases hijas, eso significase
  que es al mismo tiempo su propio tipo y el de todas sus clases hijas. Por tanto, una clase padre NO es una instancia de ninguna de sus hijas,
  sino solamente su tipo y el de su padre Object o cualquier otra clase padre que tenga de por medio.
  
4. Debido al punto 3, las clases padres no pueden ser tratadas como ninguna de sus clases hijas en ninguna parte del codigo(declaraciones, metodos,
argumentos, etc.) por lo que un objeto del tipo padre no se puede declarar como una instancia de alguna de sus hijas ya que nuevamente, una clase
padre no es del tipo de su hija/s. Asi que, una clase padre no tiene acceso a los atributos, metodos, etc. de ninguna de sus hijas.
*/

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
