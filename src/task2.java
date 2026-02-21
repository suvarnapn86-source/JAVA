
public class task2
{
    private float inkqty;
    public void write()
    {
        if(inkqty>0)
        {
            System.out.println("write some info");
            inkqty--;
        }
        else
        {
            System.out.println("cant write please fill ink");
        }

    }
}

