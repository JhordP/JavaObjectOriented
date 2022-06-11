package casting.test;

import casting.domain.*;

public class TestCasting {
    public static void main(String[] args) {

        /*Un objeto del tipo padre puede almacenar una referencia del tipo hijo, o mas bien una referencia de tipo hijo puede ser almacenada
         en un objeto tipo padre, ya que el tipo hijo es a la vez tipo padre. Sin embargo, como el objeto sigue siendo del tipo padre, este
         no puede acceder a los elementos que no son en comun entre ambas.*/
        Empleado empleado;
        empleado = new Escritor("Juan", 426.46, TipoEscritura.CLASICO);
        System.out.println(empleado);
        System.out.println(empleado.obtenerDetalles()); //El metodo obtener detalles es comun en la clase padre e hija. No lanza error.
        
        //System.out.println(empleado.getTipo()); Este lanza error porque el metodo getTipo() solamente está en la clase hija. El metodo no esta definido en el tipo padre.

        /*DownCasting*/
        System.out.println(((Escritor) empleado).getTipo()); //Forzar explicitamente usando ((Hijo)elementoPadre) convierte el elemento en tipo hijo de forma momentanea para invocar el metodo.

        Escritor escritor = (Escritor)empleado; 
        System.out.println(escritor.getTipo()); //O tambien, asignar la conversion a una nueva variable y desde esta nueva invocar.

        /*UpCasting*/
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles()); //Asignar un objeto del tipo hijo a tipo padre no es problema debido a que la clase hijo es a la vez del tipo padre por lo que puede utilizar elementos heredados.
        
                /**NOTA: Luego de pensar un rato note que la razon de esto es por el polimorfismo. Si una clase padre tiene varias clases hijas, 
                 * y estas a la vez heredan y modifican el comportamiento de algunos metodos de la clase padre, entonces hay que especificar a 
                 * cual hija se está casteando o haciendo la conversión para saber cual de los metodos en CUAL clase hija se va a utilizar. */

    }
}
