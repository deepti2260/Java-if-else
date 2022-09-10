import java.lang.*;
import java.util.*;
class Discount{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int u=sc.nextInt();
float d=0.0f;
int d1=u*100;
if(d1>1000){
	d=d1-(d1*0.1f);
	System.out.println(d);
}
else{
	System.out.println(d1);
}
}
}
	