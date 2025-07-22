public class Fcp017{
public static void main(String[]args){
int a=50;
int b=10;
int c=16;
if(a>b){
	if(a>c){
		if(b>c){
			System.out.println(b);
			}
		else{
			System.out.println(c);
		}
		}
	else{
		System.out.println(a);
	}
}
else{
	if(b>c){
		if(a>c){
			System.out.println(a);
			}
		else{
			System.out.println(c);
		}
		}
	else{
		System.out.println(c);
	}
}
}
}
