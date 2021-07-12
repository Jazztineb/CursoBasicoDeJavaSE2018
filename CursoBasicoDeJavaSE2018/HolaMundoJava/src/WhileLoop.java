public class WhileLoop {

    static boolean isLightTurnOn = false;
    public static void main(String[] args) {
        turnOnOffLight();

        int i = 1;
        while (isLightTurnOn && i <= 10){ //Mientras la luz este encendida e i es menor o igual a 10.
            printSOS();
            i++;
        }

    }
    public static void  printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        //Operador ternario.
        isLightTurnOn = (isLightTurnOn)?false:true;
        return isLightTurnOn;
    }
}
