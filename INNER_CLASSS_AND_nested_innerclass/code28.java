class parent{
    void fun()
    {
        System.out.println("IN FUNN P");
    }
    void run()
    {
        System.out.println("IN RUN P");
    }
}
class child extends parent
{
    void fun()
    {
        System.out.println("IN FUN CH");
    }
    void run()
    {
        System.out.println("IN RUNNN c");
    }
    void mun()
    {
        System.out.println("in munnn c");
    }
}
class client
{
    public static void main(String[] args) {
        parent p=new parent();
        p.fun();
        p.run();
        //p.mun();


        child c=new child();
        c.fun();
        c.run();
        c.mun();
    }
    
}