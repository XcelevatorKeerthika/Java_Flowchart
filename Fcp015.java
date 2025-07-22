public class Fcp015{
public static void main(String[]args){
int a=98;
int b=13;
int c=29;
int d=58;
if(a>b){
	if(a>c){
		if(a>d){
		System.out.println(a);
		}
		else{
		System.out.println(d);
		}
		}
	else{
		if(c>d){
		System.out.println(c);
		}
		else{
		System.out.println(d);
		}
		}
}
else{
	if(b>c){
		if(b>d){
		System.out.println(b);
		}
		else{
		System.out.println(d);
		}
		}
	else{
		if(c>d){
		System.out.println(c);
		}
		else{
		System.out.println(d);
		}
		}
}
}
}