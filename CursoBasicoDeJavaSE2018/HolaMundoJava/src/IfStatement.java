public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled  = false;
        int     file                = 3;

        if (isBluetoothEnabled){
            //Send file
            file++;
            System.out.println("Archivo enviado :3");

            //Variable con scope limitada
            int i = 0;
            i++;
        } else {
            file--;
            System.out.println("Favor de asegurar que el bluetooth este habilitado para iniciar la transferencia.");
        }

        //Variables con scope mayor.
        System.out.println(isBluetoothEnabled);
        System.out.println(file);

    }
}
