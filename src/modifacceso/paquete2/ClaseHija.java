package modifacceso.paquete2;
import modifacceso.paquete1.Clase1;

public class ClaseHija extends Clase1 {
    public ClaseHija() {
        super("Constructor protected");
        this.atributoProtected = "Modif atributo protected.";
        System.out.println(this.atributoProtected);
        this.metodoProtected();
    }
}
