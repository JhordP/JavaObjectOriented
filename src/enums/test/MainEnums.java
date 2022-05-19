package enums.test;
import java.lang.Enum;
public class Main
{
    public static void main(String[] args) {
        
        /*DIAS*/
        System.out.println("Dia 1: "+Dias.LUNES);
        
        //Utiliza el switch del metodo indicarDiaSemana.
        indicarDiaSemana(Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        indicarDiaSemana(Dias.MIERCOLES);
        
        /*CONTINENTES*/
        System.out.println("Paises en "+Continentes.AFRICA+": "+Continentes.AFRICA.getPaises());
        
        //Enum enume = new Enum();
        System.out.println(Continentes.AFRICA.ordinal()); //Intento de traer todos los elementos del enum fallido.
    }
    
    private static void indicarDiaSemana(Dias dia){
        switch(dia) { //Al colocar el objeto, ya puedes usar el atributo debajo sin necesidad de mencionar el objeto.
            case LUNES: System.out.println("Primer dia de la semana.");
                break;
            case MARTES: System.out.println("Segundo dia de la semana.");
                break;
            case MIERCOLES: System.out.println("Tercer dia de la semana.");
                break;
        }
    }
}
