public class Casting
{
    public static void main(String[] args) {
        int myint=9;
         double mydouble=myint;     /*widening casting  */
        System.out.println(myint);
        System.out.println(mydouble);
        double d=9.78;
        int i=(int)d;
        System.out.println(d);
        System.out.println(i);
    }
}