import java.lang.*;
import java.util.*;
class Upperlower{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
char a=sc.next().charAt(0);
if(a>='a' && a<='z'){
System.out.println("lowercase");
}
else if(a>='A' && a<='Z'){
System.out.println("uppercase");
}
}
}