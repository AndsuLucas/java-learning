class LoopAndIfs {
    public static void main(String[] args) {
        callTabulate(3);
        if (12 > 11) {
            System.out.println("12 > 11");
            return;
        }

        System.out.println("12 < 11");
    }


    public static void callTabulate(int n) {
        for (int i = 1; i <= 10; i++) {
            int total = n * i;
            System.out.println(n + "x" + i + " = " + total);
            System.out.print("\n");
        }
    }
}