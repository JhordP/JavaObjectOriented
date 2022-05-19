package enums;

public enum Continentes {
    //Se puede colocar separado por comas mas argumentos(igual que la llamada de un metodo) pero debe ser especificado en el constructor.
    AFRICA(53), 
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14); //Cuando vas a seguir codeando debajo del ultimo atributo, debes colocar ;
    
    private final int paises;
    
    Continentes(int paises) { //Los constructores son por defecto public
        this.paises = paises;
    }
    
    public int getPaises() {
        return this.paises;
    }
    /* Intento fallido de traer todos los objetos del enum desde la clase (no es posible sin usar uno de los elementos)
    public Object getContinentes() {
        return Continentes.getDeclaringClass().getEnumConstants();
    }*/
    
}
