class q9
{
    public static void main(String [] args)
    {
        chair ob1=new chair("wood","brown",2);
        table ob2=new table("metal","silver",5);
        ob1.stress("true");
        ob1.fire("false");
        ob2.stress("false");
        ob2.fire("true");
    }
}
abstract class furniture
{
    abstract void stress(String stres);
    abstract void fire(String fir);
}
class chair extends furniture
{
    String type,color;
    int size;
    chair(String type,String color,int size)
    {
        this.type=type;
        this.color=color;
        this.size=size;
        System.out.println(this.type);
        System.out.println(this.color);
        System.out.println(this.size);
    }
    void stress(String stres)
    {
        System.out.println(stres);
    }
    void fire(String fir)
    {
        System.out.println(fir);
    }
}
class table extends furniture
{
    String type,color;
    int size;
    table(String type,String color,int size)
    {
        this.type=type;
        this.color=color;
        this.size=size;
        System.out.println(this.type);
        System.out.println(this.color);
        System.out.println(this.size);
    }
    void stress(String stres)
    {
        System.out.println(stres);
    }
    void fire(String fir)
    {
        System.out.println(fir);
    }
}
