public class Main {
    static int a = 25;
    static int b = 5;
    static int addition = a + b;
    static int subtraction = a - b;
    static int multiplication = a * b;
    static int division = a / b;
    public static void main(String[] args){
        System.out.println("El resultado de " + a + " más " + b + " es igual a = "+ addition);
        System.out.println("El resultado de " + a + " menos " + b + " es igual a = "+ subtraction);
        System.out.println("El resultado de " + a + " multiplicado por " + b + " es igual a = "+ multiplication);
        System.out.println("El resultado de " + a + " dividido entre " + b + " es igual a = "+division);
    }
}