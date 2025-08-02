import java.util.*;
public class FCP038{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0;
int b=0;
int m=0;
int c=0;
for(m=n;m>0;m=m/10)
{
	a=m%10;
	b=a*a*a;
	c=b+c;
}
if(n==c){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}}