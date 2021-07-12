public class DataTypes {
    public static void main(String[] args) {
        /*
        byte
        Tipo de dato entero (no decimales)
        Ocupa 1 byte.
         */

        /*
        short
        Tipo de dato entero (no decimales)
        Ocupa 2 bytes.
         */

        /*int solo almacena 10 digitos.
        Tipo de dato entero (no decimales)
        Ocupa 4 bytes*/
        int n = 1234567890;

        /*
        long
        Tipo de dato entero (no decimales)
        Ocupa 8 bytes.
         */
        long nL = 12345678901L;

        /*
        Double
        tipo de dato decimal con mayor precision.
         */
        double nD = 123.789654;

        /*
        Float
        tipo de dato decimal con menor precision.
         */
        float nF = 123.985F;

        /*
        Char
        Tipo de dato unicode.
        Un solo elemento para este tipo de dato.
        Ocupa 2 bytes.
        Comilla simples.
         */

        /*
        Boolean
        Tipo de dato logico (V,F)
        Ocupa 2 bytes
         */

        //Java 10 infiere tipo de dato.
        var salary = 1000; //int
        //pension 3%
        var pension = salary*0.03;//double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        //Java 10 infiere cadenas de texto
        var employeeName = "Justine Briceno Cortez";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
