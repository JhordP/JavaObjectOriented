package abstracts.domain;

public class Rectangulo extends FiguraGeometrica{
    
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibuja un: "+this.getClass().getSimpleName());
    }
}
