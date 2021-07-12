public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);//4

        lives--;//Operador decremento
        System.out.println(lives);//3

        lives++;//Operador incremento
        System.out.println(lives);//4


        //Gana un regalo por ganar una vida.
        int gift = 100 + lives++; //postfijo = primero se accede al dato y realiza siguiente instrucción.
        System.out.println(gift);
        System.out.println(lives);

        int gift2 = 100 + ++lives; //postfijo = obtiene dato incrementado
        System.out.println(gift2);
        System.out.println(lives);

        //Otro ejemplo

        //Incremento postfijo
        int vidas = 5;
        int regalo = 100 + vidas++;

        System.out.println("Regalo: " + regalo + ",vidas: " + vidas);

        //Incremento prefijo
        int vidas1 = 5;
        int regalo1 = 100 + ++vidas1;

        System.out.println("Regalo: " + regalo1 + ", vidas: " + vidas1);
    }
}
