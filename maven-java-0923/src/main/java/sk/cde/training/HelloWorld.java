package sk.cde.training;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!!!!");
        for (int a = 0; a < args.length; a++) {
            System.out.println(args[a]);
        }
    }
}