public class EjercicioCasteo {
    public static void main(String[] args) {
        /*
        1.- char c = ‘z’; conviertelo a int
        2.- int i = 250; conviertelo a long y luego de long a short
        3.- double d = 301.067; conviertelo a long
        4.- int i = 100; súmale 5000.66 y conviertelo a float
        5.- int i = 737; multiplícalo por 100 y conviertelo a byte
        6.- double d = 298.638; divídelo entre 25 y conviertelo a long
         */

        //1.-
        char c = 'z';
        int cCast = (int) c;

        //2.-
        int     i       = 250;
        System.out.println(i);
        long    iCast   = i;
        System.out.println(iCast);
        short   iShort  = (short) iCast;
        System.out.println(iShort);

        //3.-
        double d = 301.067;
        long dCast = (long)d;
        System.out.println(dCast);

        //4.-
        float iFloat = (float) i;
        System.out.println(iFloat);

        //5.-
        int iEntero = 737*100;
        byte iByte = (byte) iEntero;

        //6.-
        double dDoble = 298.638 / 25;
        long dLong = (long) dDoble;
        System.out.println(dLong);


    }
}
