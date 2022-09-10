import java.lang.*;
import java.util.*;
class Greatest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a>b){
	System.out.println("a is greatest"+a);
}
else if(a<b){
	System.out.println("b is greatest"+b);
}
else{
	System.out.println("both are equal"+a);
}
}