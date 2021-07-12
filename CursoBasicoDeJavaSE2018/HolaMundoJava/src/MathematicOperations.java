public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Imprime valores de constantes
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //Devuelve un entero hacia arriba.
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo.
        System.out.println(Math.floor(x));

        //Devuelve un número elevado a otro número
        //Dos elevado a la tres.
        System.out.println(Math.pow(x,y));

        //Devuelve el valor mayor de dos números.
        System.out.println(Math.max(x,y));

        //Devuelve la ráiz cuadrada
        System.out.println(Math.sqrt(y));

        //Devuelve la raíz cuadrada con casting.
        System.out.println((int) Math.sqrt(y));

        //Área de un círculo (pi * r^2)
        System.out.println(Math.PI * Math.pow(y,2));

        //Área de una esfera (4 * pi * r^2)
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera = (4/3) * pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
