public class NumConversion {
    public static void main(String[] args) {
        int firstArg = 0;
        for (String s : args) {
            int mIntArg = 0;
            try {
                mIntArg = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + s + " must be an integer");
                System.exit(2);
            }
            System.out.println("You entered " + mIntArg);
        }
    }
}