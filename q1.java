class q1
{
    public static void main(String[] args)
    {
        Bookdetails ob1=new Bookdetails("Muchadoaboutnothing","Oliver",1234,"novel","12-12-2020");
        Bookdetails ob2=new Bookdetails("Engineering maths-2","np-bali",1235,"Tech","13-12-2020");
        ob1.issuedto("utkarsh",168);
        ob2.issuedto("raj",159);
        ob1.getdetails();
        ob2.getdetails();
    }
}
abstract class Book
{
    String Name,Author;
    Book(String Name,String Author)
    {
        this.Name=Name;
        this.Author=Author;
    }
}
interface studentdetails
{
    void issuedto(String stname,int Rollno);
}
class Bookdetails extends Book implements studentdetails
{
    int isdn,Rollno;
    String category,issuedate,stname;
    Bookdetails(String Name,String Author,int isdn,String category,String issuedate)
    {
        super(Name,Author);
        this.isdn=isdn;
        this.category=category;
        this.issuedate=issuedate;
    }
    public void issuedto(String stname,int Rollno){
        this.stname=stname;
        this.Rollno=Rollno;
    }
    void getdetails(){
        System.out.print(Name+" "+Author+" "+isdn+" "+category+" "+issuedate+" "+stname);
        System.out.println(" "+Rollno);
    }
}

