public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //Recibe bono $200
        salary = salary + 200;
        System.out.println(salary);

        //pension -$50
        salary = salary - 50;
        System.out.println(salary);

        //Horas extra $30 c/u
        //Comida: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizar cadenas de texto
        String employeeName = "Justine Briceño";
        employeeName = employeeName + " Cortez";
        System.out.println(employeeName);

        employeeName = "Bonette " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);

    }
}
