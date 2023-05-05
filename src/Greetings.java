public class Greetings {
    public static String msg = "Good Morning";
    public static void hello(String name) {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        hello("Rafi");
        Greetings g = new Greetings();
        System.out.println(msg);
    }
}
