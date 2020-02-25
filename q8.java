interface myit1{
    public default void display() {
        System.out.println("display method of Interface1");
    }
}
interface myit2{
    public default void display() {
        System.out.println("display method of Interface2");
    }
}
public class q8 implements myit1,myit2{
    public void display() {
        myit1.super.display();
        myit2.super.display();
    }
    public static void main(String args[]) {
        q8 obj = new q8();
        obj.display();
    }
}
