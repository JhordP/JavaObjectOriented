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
}
