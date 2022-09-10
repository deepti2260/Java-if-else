import java.lang.*;
import java.util.*;
class Rectangle{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();
if(l>b||l<b){
	System.out.println("rectangle");
}
else{
	System.out.println("not a rectangle");
}
}
}