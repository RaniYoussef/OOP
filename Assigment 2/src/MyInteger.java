public class MyInteger {

    /*• An int data field named value that stores the int value represented by this
object.*/

    private int value ;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

/*• A constructor that creates a MyInteger object for the specified int value. A
getter method that returns the int value.*/

    public MyInteger(int value)
    {
        this.value=value ;
    }

    /*• The methods isEven(), isOdd(), and isPrime() that return true if the value in
this object is even, odd, or prime, respectively.*/

    public boolean isEven ()
    {

        if (value%2==0)
        {
            return true ;
        }

        return false;
    }

    public boolean isOdd ()
    {

        if (value%2!=0)
        {
            return true ;
        }

        return false;
    }

    public boolean isPrime ()
    {

        int i = 2;
        boolean flag = false;
        while (i <= value / 2) {
            // condition for nonprime number
            if (value % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            return true ;
        else
            return false ;
    }


    /*• The static methods isEven(int), isOdd(int), and isPrime(int) that return true if
the specified value is even, odd, or prime, respectively.*/



    public static boolean isEven (int x )
    {

        if (x%2==0)
        {
            return true ;
        }

        return false;
    }

    public static boolean isOdd (int x)
    {

        if (x%2!=0)
        {
            return true ;
        }

        return false;
    }

    public static boolean isPrime (int x)
    {

        int i = 2;
        boolean flag = false;
        while (i <= x / 2) {
            // condition for nonprime number
            if (x % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            return true ;
        else
            return false ;
    }


/*• The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd, or
prime, respectively.*/

    public static boolean isEven (MyInteger x )
    {

        if (x.value%2==0)
        {
            return true ;
        }

        return false;
    }

    public static boolean isOdd (MyInteger x)
    {

        if (x.value%2!=0)
        {
            return true ;
        }

        return false;
    }

    public static boolean isPrime (MyInteger x)
    {

        int i = 2;
        boolean flag = false;
        while (i <= x.value / 2) {
            // condition for nonprime number
            if (x.value % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            return true ;
        else
            return false ;
    }


/*• The methods equals(int) and equals(MyInteger) that return true if the value
in this object is equal to the specified value.*/



    public boolean Equals (int x)
    {
        if (x == value)
            return true ;
        return false ;

    }

    public boolean Equals (MyInteger x)
    {
        if (x.value == value)
            return true ;
        return false ;

    }







}
