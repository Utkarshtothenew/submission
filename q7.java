interface myAnotherInterface {
    default void show() {
        System.out.println("Hey from default method");
    }
}
public class q7 implements myAnotherInterface {
    public void show() {
        System.out.println("hey from class");
    }

    public static void main(String[] args) {
        q7  an7 = new q7();
        an7.show();
    }

}