package object.domain;

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

    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        return this.getNombre()+", "+this.getSueldo();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sueldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
            return false;
        return true;
    }
    
}
