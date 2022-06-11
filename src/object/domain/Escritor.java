package object.domain;

public class Escritor extends Empleado {
    final TipoEscritura tipo;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipo) {
        super(nombre,sueldo);
        this.tipo = tipo;
    }
    
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", "+tipo.getDescripcion();
    }

    public TipoEscritura getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", "+ this.tipo;
    }
}
