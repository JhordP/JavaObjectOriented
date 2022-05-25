package autoboxing_unboxing.test;

public class MainAutoboxingUnboxing
{
	public static void main(String[] args) {
	    //Clases Envolventes o Wrapper de tipos primitivos:
	    /* int -Integer
	       long - Long
	       float -Float
	       double - Double
	       boolean - Boolean
	       byte - Byte
	       char - Character
	       short - Short
	   */
	   
	   //Puedes asignar la clase wrapper a un tipo de dato especifico. Ej:
	   Integer numEntero = 10;
	   Double numDoble = numEntero.doubleValue(); //Lo transforma en doble
	   //Se le llama autoboxing a esto: Utilizar la clase Wrapper del tipo primitivo para utilizar la variable como un objeto
	   
	   int numInt = numEntero;
	   double numDouble = numDoble;
	   //Y se le llama unboxing a tomar la literal de ese objeto, o su valor en si, y colocarlo en una declaracion normal de otra variable del mismo tipo.
		System.out.println(numInt+"\n"+numDouble);
	    
	}
}
