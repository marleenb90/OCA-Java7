package nl.marleenberg.javase7.chapter2.Exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        int bDecimal = 267;          // normal integer
        int oValue = 0413;           // ??? waarom zelfde als bDecimal
        int hValue = 0x10B;          // B = 12........ good question..
        int bValue = 0b100001011;    //
        long Decimal = 100_267_760;  // a long value, split with underscore
        long oVal = 04_13;           // a long value, split with underscore
        long hVal = 0x10_BA_75;      //
        long bVal = 0b1_0000_10_11;  // same as bValue, split with underscore

        double floatingPointNumber = 0b1_0000_10_11;


//        when parsing an integer, underscores not allowed (numberFormatException)
//        int toString = Integer.parseInt("100_267_760");

        System.out.print(oValue);

    }

}
