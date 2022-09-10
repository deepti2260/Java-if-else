import java.lang.*;
import java.util.*;
class Grade{
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
int u=sc.nextInt();
if(u<25){
System.out.println("F");
}
else if(u>=25 && u<45){
System.out.println("E");
}
else if(u>=45 && u<50){
System.out.println("D");
}
else if(u>=50 && u<60){
System.out.println("c");
}
else if(u>=60&&u<80){
System.out.println("B");
}
else{
System.out.println("A");
}
}
}
