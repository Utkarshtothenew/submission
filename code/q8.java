public class q8 {
    public static void main(String[] args) {
        String s ="Utkarsh Pratap Singh";
        StringBuffer input = new StringBuffer(s);
        input = input.reverse();
        input = input.delete(4,9);
        System.out.println(input);
    }
}
