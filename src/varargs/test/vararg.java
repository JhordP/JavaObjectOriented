package varargs.test;
public class Vararg
{
    public static void main(String[] args) {
        imprimirNumeros(3,4,5); // Aqui solo toma 3 argumentos.
        imprimirNumeros(1,2,6,7,8); // Aqui toma 5. Y asi, puede variar la cantidad de argumentos de un mismo tipo.
    }
    
    //Se escribe el tipo de parametro y 3 puntos suspensivos. El static es solo porque se llama desde main, no obligatorio.
    //La diferencia entre varargs y arreglos es que el array tienes que saber que cantidad de elementos trae, el varargs pues.. varia y no hay problema.
    private static void imprimirNumeros(int... numeros) //NOTA: El varargs debe ser el ultimo argumento del metodo.
    {
        for(int numero : numeros) {
            System.out.println("Elemento: "+numero);
        }
        System.out.println("----");
    }
}
