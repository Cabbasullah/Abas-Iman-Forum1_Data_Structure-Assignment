import java.util.Stack;

class Tower_Hanoi_Iteration {

    public static void towerOfHanoi(int n, char disk1, char disk3, char disk2) {

        Stack<Integer> diskA = new Stack<>();
        Stack<Integer> diskB = new Stack<>();
        Stack<Integer> diskC = new Stack<>();

        for (int i = n; i > 0; i--) {
            diskA.push(i);
            /*
             * PegA(1,2,3) pegB( ) pegC( )
             * The smallest on the top, the largest at the bottom.
             */
        }

        boolean MoveFromLeftTORIGHT;
        if (n % 2 == 0) {
            MoveFromLeftTORIGHT = false;
        } else {
            MoveFromLeftTORIGHT = true;
        }

        for (int i = 1; i < Math.pow(2, n); i++) {
            // total number of moves required is 7, power(2,n)-1=7steps
            Stack<Integer> source = null;
            Stack<Integer> destination = null;

            if (i % 3 == 1) {// when n=1
                source = diskA;
                if (MoveFromLeftTORIGHT) {
                    destination = diskC;
                } else {
                    destination = diskB;
                }
            } else if (i % 3 == 2) {// this means when n=2
                source = diskB;
                if (MoveFromLeftTORIGHT) {
                    destination = diskA;
                } else {
                    destination = diskC;
                }
            } else if (i % 3 == 0) {
                source = diskC;
                if (MoveFromLeftTORIGHT) {
                    destination = diskB;
                } else {
                    destination = diskA;
                }
            }
            if (!source.isEmpty() && (destination.isEmpty() || source.peek() < destination.peek())) {
                int movedDisk = source.pop();
                destination.push(movedDisk);
                String sourceStr;
                if (source == diskA) {
                    sourceStr = "A";
                } else if (source == diskB) {
                    sourceStr = "B";
                } else {
                    sourceStr = "C";
                }

                String destinationStr;
                if (destination == diskA) {
                    destinationStr = "A";
                } else if (destination == diskB) {
                    destinationStr = "B";
                } else {
                    destinationStr = "C";
                }

                System.out.println("Move disk " + movedDisk + " from " + sourceStr + " to " + destinationStr);

            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        char disk1 = 'A', disk3 = 'C', disk2 = 'B';
        /*
         * Destination is disk3;
         */
        towerOfHanoi(n, disk1, disk3, disk2);
    }
}
