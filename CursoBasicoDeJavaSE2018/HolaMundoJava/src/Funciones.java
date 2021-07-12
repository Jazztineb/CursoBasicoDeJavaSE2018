public class Funciones {


    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        double quantity;
        String currency;

        //Área de un círculo (pi * r^2)
        double area = circleArea(y);
        System.out.println(area);
        System.out.println(circleArea(y)); //Imprimiendo valor de retorno.

        //Área de una esfera (4 * pi * r^2)
        System.out.println(sphereArea(y));

        //Volumen de una esfera = (4/3) * pi * r3
        System.out.println(y);

        //Conversion de móneda
        System.out.println("pesos a dolares: " + convertToDolar(quantity=200, currency="MXN"));

    }

    //Funciones deben vivir al nivel de la clase.
    //Siempre salir del método main().

    //static solo aplica para métodos que comparten el método main.

    /**
     * Descripción: Función que calcula el área de un círculo.
     * @param r
     * @return r
     */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Función que calcula el área de una esfera.
     * @param r Radio.
     * @return r
     */
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Función que calcula el volumen de una esfera.
     * @param r Radio.
     * @return r
     */
    public  static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares.
     *
     * @param quantity Cantidad de dinero.
     * @param currency Tipo de cambio: Solo acepta MXN o COP.
     * @return quantity Devuelve la cantidad actualizada en dolares.
     */
    public static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
