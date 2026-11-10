public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            approxPi += 4.0 * Math.pow(-1, i + 1) / (2 * i - 1);
        }
        System.out.println(approxPi + " " + actualPi);
    }
}
