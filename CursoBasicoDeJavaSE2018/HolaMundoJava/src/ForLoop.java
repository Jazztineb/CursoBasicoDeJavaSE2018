public class ForLoop {
    static boolean isLightTurnOn = false;
    public static void main(String[] args) {
        turnOnOffLight();
        for (int i = 1; i <= 10; i++) {
            printSOS();

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
