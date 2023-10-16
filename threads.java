class threads extends Thread
{
   /*  perform action for a thread */
    public void run()
    {
        System.out.println("thread is running");
    }
    public static void main(String args[])
{
    threads a=new threads();
    /* The start() method of Thread class is used to start a newly created thread */
    a.start();
}

}