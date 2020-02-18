public class q1{
    public static void main(String[] args) {
        // your code goes here
        String input = "My name is utkarsh";
        String replace = "shivam";
        String sub = input.substring(11);

        input = input.replace(sub, replace);
        System.out.println(input);
    }
}