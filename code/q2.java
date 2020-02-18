public class q2 {
    public static void main(String[] args)
    {
        String st="Hello I am Utkarsh. Hello Everyone";
                String[] s1=st.split(" ");
        String s2=st.replace("Hello"," ");
        String[] s3=s2.split(" ");
        int l=s1.length-s3.length;
        System.out.println("Number of Occurences of a word"+l);
    }
}
