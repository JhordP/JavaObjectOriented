package interfaces.accesodatos;

public interface IAccesoDatos {
    //NOTA: Todos los atributos declarados en una interfaz son automaticamente constantes (public final static)
    int MAX_REGISTRO = 10;

    //NOTA: Todos los metodos seran abstractos y publicos
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}
