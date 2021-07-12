import java.util.Date;

import static ui.UIMenu.*;


public class Main {
    public static void main(String[] args) {
        /*
        1.-Declaras nombre de la clase (Doctor).
        2.- Nombre de objeto (myDoctor)
        3.- Poner en orbita el objeto (new Doctor()). Es el método constructor.
         */

                            //Método constructor.
        //Doctor myDoctor =   new Doctor();
        //myDoctor.name= "Blanca Briceño Silva";
        //myDoctor.showName();
        //myDoctor.showIdDoctor();
        //System.out.println(Doctor.id);

        //Doctor myDoctorAracely = new Doctor();
        //myDoctor.showIdDoctor();
        //System.out.println(Doctor.id);

        //showMenu();
        Doctor myDoctor = new Doctor("Blanca Esther Briceño Silva ","Dermatologia");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 pm");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Patient patient = new Patient("Heriberto Alva Trujillo", "heriberto@mail.com");
        patient.setWeight(54.6); //setter
        System.out.println(patient.getWeight()); //getter
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        /*Explicación de variables y objetos en memoria
        int i = 0;
        int b = 2;
        b = i;

        System.out.println();
        System.out.println();
        Patient patient     = new Patient("Angel", "abc123@mail.com");
        Patient patient1    = new Patient("Fernanda", "fernanda@mail.com");

        System.out.println(patient.name); //Si no ponemos .name solo imprime la memoria.
        System.out.println(patient1.name);
        patient1 = patient;

        System.out.println(patient.name);
        System.out.println(patient1.name);*/

        //patient1.setName("Manuel");

    }
}
