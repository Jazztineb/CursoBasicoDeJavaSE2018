public class SwitchState {
    public static void main(String[] args) {

        String colorModelSelected = "Dark";

        switch (colorModelSelected){

            case "Light":
                //Código de configuración para cambio de color.
                System.out.println("Haz seleccionado light mode.");
                break;

            case "Night": //Ambar
                System.out.println("Haz seleccionado night mode.;");
                break;

            case "Blue Dark":
                System.out.println("Haz seleccionado blue dark mode.;");

            case "Dark":
                System.out.println("Haz seleccionado dark mode.;");
                break;

            default:
                System.out.println("Selecciona una opción correcta.");
        }
    }
}
