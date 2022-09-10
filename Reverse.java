import java.lang.*;
import java.util.*;
class Reverse{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=a,d=-1,r=0;
double sum=0;
while(a>0){
	d+=1;
	a/=10;
}
while(b>0){
	r=b%10;
	sum=sum+r*(Math.pow(10,d));
	d-=1;
	b=b/10;
}
System.out.println((int)sum);
}
}

	
