import java.util.ArrayList;
import java.util.Date;

public class Doctor  { //Tipo de objeto
    static  int     id = 0; //Autoincrement
    private     String          name;
    private     String          email;
    private     String          speciality;

    Doctor(){
        System.out.println("Construyendo el objeto doctor.");
    }

    Doctor(String name, String speciality){

        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
        this.name       =   name;
        this.speciality =   speciality;
    }

    //Comportamientos
    //public = modificador de acceso
    public void showName(){
        System.out.println(name);
    }

    public void showIdDoctor(){
        System.out.println("Id doctor: " + id);
    }

    //Coleciones
    //Incrementa y cre nuevas citas.
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    //Devuelve lista completa de citas.
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    //Clase estática anidada.
    public static class AvailableAppointment{
        private int     id;
        private Date    date;
        private String  time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
