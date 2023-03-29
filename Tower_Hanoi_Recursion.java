class Tower_Hanoi_Recursion {

    static void modvedisks(int n, char diskA, char diskB, char diskC) {
        if (n == 1) {
            System.out.println("Move " + diskA + " from Peg1 to peg3");
        }

        else {
            modvedisks(n - 1, diskA, diskC, diskB);
            System.out.println("Move " + diskA + " from Peg1 to peg2");
            System.out.println("Move " + diskA + " from Peg2 to peg3");
            System.out.println("Move " + diskB + " from Peg1 to peg3");
            modvedisks(n - 1, diskC, diskB, diskA);

        }
    }

    public static void main(String[] args) {

        int n = 3;
        char disk1 = 'A';
        char disk2 = 'B';
        char disk3 = 'C';/// the destination peg
        /*
         Although n=3, the code will print all the steps from when n=1 to when n=3, so the steps that will be printed are not just when n=3, which
         are seven steps(minimum) but when n=1, n=2,n=3.
         */

        modvedisks(n, disk1, disk3, disk2);
    }
}
