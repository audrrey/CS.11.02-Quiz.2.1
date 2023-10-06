public class Main {

    public static void main(String[] args) {

        int resultOne = add(4, 4);
        System.out.println(resultOne);

        String resultTwo = greeting("Bob");
        System.out.println(resultTwo);

        String toBePrinted = "Hello, world!";
        printMe(toBePrinted);

    }


    public static int add (int numOne, int numTwo)
    {
              return numOne + numTwo;


    }

    public static String greeting (String name) {
        String s = "Bonjour," + name + "!";
        return s;

    }

            public static void printMe(String toBePrinted) {
            System.out.println(toBePrinted);
        }
}
