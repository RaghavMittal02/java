import.java.util.*;
 class Bank
{
Scanner s=new Scanner(System.in);
public double samount;
public double camount;
public float principal;
public float rate=3%;
 public float time;
public void sav() 
{
System.out.println("enter the amount u want to store in saving account:");
double samount =s.nextDouble();
samount=samount+x;
System.out.println("total no of amount store in saving account is:"+samount):
}
public void cur()
{
System.out.println("enter the amount u want to store in current account:");
double camount=s.nextDouble();
camount=camount+y;
System.out.println("total no of amount store in current account is:"+camount);
}
class savings extends Bank
{
public void withdrawal()
{
System.out.println("enter amount u want to withdraw:");
double amount=s.nextDouble():
samount=samount-amount;
System.out.println("amount after withdrawing is:"+samount);
}
public void compound()
{
double num;
num=1+rate;
samount=samount*pow(num,time);
System.out.println("amount after impending compound interest is:"+samount);
class current extends Bank
{
public void min()
{
if(camount<=500)
{
camount=camount-((5*camount)/100);
System.out.println("current amount="+camount);
}}
public void cheque()
{
System.out.println("enter the amount u want to pay in cheque");
}
}
public class Bank_demo()
{
public static void main(String args[])
{ 
Scanner a=new Scanner (System.in);
current c=new current();
savings s=new savings();
}


