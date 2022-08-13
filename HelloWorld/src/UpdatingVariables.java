public class UpdatingVariables {
    public static void main (String[] args){
        int salary = 1000;

        //bono por $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50 descuento

        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //comida: $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actiualizando cadenas de texto
        String emplyeeName = "Abel";
        emplyeeName = emplyeeName + " Amarilla";
        System.out.println(emplyeeName);

        emplyeeName = "A. " + emplyeeName;
        System.out.println( "Your name is: " + emplyeeName);


    }
}
