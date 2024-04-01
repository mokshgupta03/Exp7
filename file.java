


public class rectangle {
    double a1,b1;
     rectangle(double length, double width)
    {
        a1=length;
        b1=width;
    }

    String check()
    {
        if(a1==b1)
        {
           return "Square";
        }
        else 
        {
           return "Not square";
        }
    }
     
}
