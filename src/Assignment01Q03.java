public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        System.out.print("1 1 ");
        int prev1 = 1;
        int prev2 = 1;
        int curr;
        int numOdd = 2;
        for (int i = 3; i <= x; i++) {
            curr = prev1 + prev2;
            if (curr % 2 != 0) {
                numOdd++;
            }
            System.out.print(curr + " ");
            prev1 = prev2;
            prev2 = curr;
        }
        System.out.println("");
        System.out.println("The number of odd numbers is: " + numOdd);
    }

}
        

        
        
       