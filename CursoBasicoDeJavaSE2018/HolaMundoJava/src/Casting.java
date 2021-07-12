public class Casting {
    public static void main(String[] args) {

        //En un año ubico 30 perritos
        //Incognita: ¿Cuántos perritos ubiqué al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimacion, unidad
        //Haciendo casting. No redondea, se trunca la parte decimal.
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

        //Casteo de int a double. No existe mayor problema dado que es de chico a grande.
        double c = (double) a/b;
        System.out.println(c);

        //Char cabe en int. Casteo automático.
        char n = '1';
        int nI = n;
        System.out.println(nI); //49 equivale a 1 en la tabla ASCII .

        //Char no cabe en short. Casteo explícito.
        short nS = (short) n;
        System.out.println(nS);


    }
}
