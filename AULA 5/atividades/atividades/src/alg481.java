public class alg481 {
    public static void main(String[] args) {
        int decimalNumber = 42; // O número decimal que você deseja converter
        int base = 5; // A base para a qual você deseja converter (entre 2 e 10)

        if (base < 2 || base > 10) {
            System.out.println("A base deve estar entre 2 e 10.");
        } else {
            String convertedNumber = convertToBase(decimalNumber, base);
            System.out.println("Número " + decimalNumber + " em base " + base + ": " + convertedNumber);
        }
    }

    public static String convertToBase(int decimalNumber, int base) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            result.insert(0, remainder);
            decimalNumber /= base;
        }

        return result.toString();
    }
}
