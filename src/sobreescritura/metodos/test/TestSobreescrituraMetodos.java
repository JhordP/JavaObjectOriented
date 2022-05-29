package sobreescritura.metodos.test;

import sobreescritura.metodos.domain.Gerente;

public class TestSobreescrituraMetodos {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Jose", 48756.24, "TI");
        System.out.println(gerente1.obtenerDetalles());
    }
}
