package object.test;

import casting.domain.Empleado;

public class TestObject {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 5000.00);
        Empleado emp2 = new Empleado("Juan", 5000.00);

        System.out.println(emp1.equals(emp2));
    }
}
