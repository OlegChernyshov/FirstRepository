public class Converter {

    static int power(int base, int pwr) {
        int result = 1;
        for (int i = pwr; i > 0; i--) {
            result *= base;
        }
        return result;
    }


    /**
     * Converts n-positional number `nPosNumber` to decimal
     * @param nPosNumber n-positional number
     * @param n n
     * @return converted decimal number
     */
    private static int nPosToDec(int nPosNumber, int n) {
        //TODO check arguments validity
        int result = 0;
        int pwr = 0;
        while (nPosNumber > 0) {
            int a = nPosNumber % 10;
            nPosNumber /= 10;
            result += a * power(n, pwr++);
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 1001101012;
        int b = nPosToDec(a, 3);
        System.out.println(b);
    }

}

