package object.domain;

public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override //Se sobreescribe el metodo desde la clase padre. Lo correcto es usar la notación Override.
    public String obtenerDetalles() {
        //Se puede utilizar supero para utilizar lo que ya retorna la clase padre y entonces agregar la sobreescritura.
        return super.obtenerDetalles() + ", " + this.departamento;
    }
}
