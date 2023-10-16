class bank{
    int getRateOfInterest()
    {
        return 0;
    }
}
class SBI extends bank{
     int getRateOfInterest()
    {
        return 8;
    }
}
class ICICI extends bank{
     int getRateOfInterest()
    {
        return 3;
    }
}
class AXIS extends bank{
     int getRateOfInterest()
    {
        return 9;
    }
}
class test1
{
    public static void main(String[] args)
    {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI rate of interest:"+s.getRateOfInterest());
         System.out.println("ICICI rate of interest:"+i.getRateOfInterest());
          System.out.println("AXIS rate of interest:"+a.getRateOfInterest());
    }
}
