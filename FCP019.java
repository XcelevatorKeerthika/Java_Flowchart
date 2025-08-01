import java.util.*;
public class FCP019{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double eb=sc.nextDouble();
double sr=0;
double TEB=0;
double p=0;
if(eb<=50){
	p=0.50*eb;
	sr=0.2*eb;
	TEB=p+sr;
	System.out.println(TEB);
}else if(eb<=150){
		p=(eb-50)*0.75+(50*0.50);
		sr=p*0.2;
		TEB=p+sr;
		System.out.println(TEB);
	}else if(eb<=250){
			p=(eb-150)*1.20+(100*0.75)+(50*0.50);
			sr=p*0.2;
			TEB=p+sr;
			System.out.println(TEB);
		}else if(eb>250){
				p=(eb-250)*1.50+(100*1.20)+(100*0.75)+(50*0.50);
				sr=p*0.2;
				TEB=p+sr;
				System.out.println(TEB);
				}

}}

				
	



			
	



