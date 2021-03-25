package session1;

import java.text.DecimalFormat;

    public class Variables {
        public static void main(String[] args) {

            String name = "Anu";
            int age = 21;
            byte b = -127;
            char c = 'c';
            int number = -3554676;
            short shortNumber = -31000;
            long longnumber = 4567878l;
            float decimalNumber = 45.78654f;
            double doubleDecimalNumber = 56.775433376535896;


            System.out.println("Byte is" + b);
            System.out.println("Char is" + c);
            System.out.println("Number is" + number);
            System.out.println("ShortNumber is" + shortNumber);
            System.out.println("longNumber is" + longnumber);
            System.out.println("Decimalnumber is" + decimalNumber);
            System.out.println("DoubledecimalNumber is" + doubleDecimalNumber);

            System.out.printf("Byte is %d. Char is %c. Int is %d. Short is %d. long is %d. Float is %f. Double is %f", b,c, number,shortNumber, longnumber,decimalNumber, doubleDecimalNumber );

        }
    }
