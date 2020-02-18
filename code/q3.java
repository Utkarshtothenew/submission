public class q3 {
    public static void main(String[] args)
    {
        String input = "abcdaa";
        int count = input.length()-input.replace("a", "").length();
        System.out.println(count);
    }
}


