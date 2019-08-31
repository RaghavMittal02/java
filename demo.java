import java.util.*;

 class Book
{
public String Name=new String();
public String author=new String();
public int price;
public int num_pages;

Book()
{
}
Book(String a,String b,int c,int d)
{
Name=a;
author=b;
price=c;
num_pages=d;
}
public void getdetails()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name of the book");
Name=s.next();
System.out.println("enter the author name");
author=s.next();
System.out.println("enter the price of the book");
price=s.nextInt();
System.out.println("enter number of pages");
num_pages=s.nextInt();
}
public void toString1()
{
System.out.println("the name of the book="+Name);
System.out.println("author name="+author);
System.out.println("price of the book="+price);
System.out.println("number of pages ="+num_pages);
}}
public class demo
{
public static void main(String args[])
{
Book b1=new Book();
Book b2=new Book("SACRED GAMES","RAGHAV MITTAL",1499,300);
b2.toString1();
b1.toString1();
b1.getdetails();
}
}
