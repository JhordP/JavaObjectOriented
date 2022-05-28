package modifacceso.test;
import modifacceso.paquete1.Clase1;
import modifacceso.paquete2.ClaseHija;

public class TestModifAcceso {
    public static void main(String[] args) {
        
        //Public: Permite acceder a objetos que esten incluso en diferente paquete.
        //Protected: Permite acceder a objetos desde las clases hijas utilizando super aunque estén en diferente paquete.
        //Default o Package: Ausencia de modificador. Es un "public" que solo funciona dentro del paquete. Una clase en otro paquete no puede heredar de una clase sin modificador de acceso.
        //Privado: Solo se puede acceder directamente desde la misma clase. Desde otras se puede a través de Get&Set.

        Clase1 clase1 = new Clase1();
        System.out.println(clase1.atributoPublico);
        clase1.metodoPublico();

        ClaseHija claseHija = new ClaseHija();
        System.out.println(claseHija);

    }
}
