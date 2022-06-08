public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
         this.nombre = nombre;
         this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return this.nombre+", "+String.valueOf(this.sueldo);
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
