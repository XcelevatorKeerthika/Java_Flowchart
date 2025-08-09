import java.util.*;
public class FCP039{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
long a=sc.nextLong();
long b=sc.nextLong();
long min=0;
long max=0;
if(a>b){
max=a;
min=b;
}else{
max=b;
min=a;
}
for(int i=3;i<=N;i++){
	long c=sc.nextLong();
	if(max>c){
		max=max;
		if(min>c){
			min=c;
		}else{
			min=min;
		}
	}else{
	max=c;
		if(min>c){
			min=c;
		}else{
			min=min;
		}
			
	}
}
System.out.println(max);
System.out.println(min);
}}