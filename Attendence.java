import java.lang.*;
import java.util.*;
class Attendence{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int CH=sc.nextInt();
int CA=sc.nextInt();
float per;
per=(CA*100)/CH;
if(per>=75){
System.out.println("Allowed to sit in exam"+per);
}
else{
System.out.println("Not allowed to sit in exam"+per);
}
}
}
