package abstracts.test;
import abstracts.domain.*;

public class TestAbstract {
    public static void main(String[] args) {
        //NOTA: No se pueden crear objetos de clases abstractas

        /*Al asignar la instancia a un objeto del tipo padre, puedo hacer instancias de cualquiera de las clases hijas, mientras que si
          utilizo un objeto del tipo hijo tendré que hacer varios objetos ya que no se relacionan entre ellas mismas*/
        FiguraGeometrica fig = new Rectangulo("Rectangulo"); 
        fig.dibujar();
    }
}
