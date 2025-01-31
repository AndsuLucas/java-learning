/**
 * The HelloWorld class implements an application that
 * simply prints "Hello, World!" to standard output.
 */
class HelloWorld {
    protected static String name = "World";

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(getName());
        System.out.println("Hello, " + getName() + "!");
        System.out.println(a + b);

        int total = a + b;
        System.out.println(a + "+" + b + "=" + total);

        double myDouble = 3.14;

        System.out.println(myDouble);

        double totalDouble = a + myDouble;

        System.out.println("Total double:" + totalDouble);

        int varWithoutValue;

        // System.out.println(varWithoutValue); does not work
    }

    public static String getName() {
        return name;
    }
}