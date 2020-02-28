public class q4 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();

        System.out.println(singleton.str);
        System.out.println(anotherSingleton.str);
    }
}

class Singleton{
    private static Singleton partOfSingleton = null;
    public String str;
    private Singleton(){
        str="hey there";
    }
    public static Singleton getInstance() {
        if (partOfSingleton == null){
            partOfSingleton = new Singleton();
        }
        return partOfSingleton;
    }

}