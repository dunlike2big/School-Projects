import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Hailstone2 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Hailstone2() {
    }

    /**
     * Generates and outputs the Hailstone series and its length starting with
     * the given integer.
     *
     * @param n
     *            the starting integer
     * @param out
     *            the output stream
     */
    private static void generateSeries(int n, SimpleWriter out) {
        int x = n, len = 1;
        final int three = 3;
        out.print(x + " ");
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
                out.print(x + " ");
            } else {
                x = three * x + 1;
                out.print(x + " ");
            }
            len++;
        }
        out.println();
        out.println("The length of the series is " + len);
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        out.print("Enter a positive integer: ");
        int userNum = in.nextInteger();
        generateSeries(userNum, out);

        in.close();
        out.close();
    }

}
