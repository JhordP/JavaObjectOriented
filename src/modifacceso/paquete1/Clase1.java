package modifacceso.paquete1;

public class Clase1 {
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtected = "Valor atributo protected";

    protected Clase1 (String v) {
        System.out.println(v);
    }

    public Clase1() {
        System.out.println("Constructor publico.");
    }

    protected void metodoProtected() {
        System.out.println("Metodo protected.");
    }

    public void metodoPublico() {
        System.out.println("Metodo Publico.");
    }
}
