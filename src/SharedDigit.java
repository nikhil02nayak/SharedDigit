public class SharedDigit {

    public static boolean hasSharedDigit (int num1 , int num2)
    {
        if ((num1 <= 9 || num1 >= 100) || (num2 <= 9 || num2 >= 100))
        {
            return false ;
        }

        int number1 = num1 % 10 ;
        int number2 = num2 % 10 ;
        int remainder1 = num1 / 10 ;
        int remainder2 = num2 / 10 ;

        return ((number1 == number2)  || (number1 == remainder1) || (number1 == remainder2) || (number2 == remainder1)
        || (number2 == remainder2) || (number2 == remainder2) || (remainder1 == remainder2) ) ;

    }
}
