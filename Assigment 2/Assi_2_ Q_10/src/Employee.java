import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.Date;

public class Employee extends Person
{
/* An employee has an office, salary, and
date hired.*/

    protected String office;
    protected double salary;
    protected Date date ;

    public static void ToString()
    {
        String.format("Employee");
    }







}
