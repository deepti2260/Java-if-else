import java.lang.*;
import java.util.*;
class Attendence1{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int CH=sc.nextInt();
int CA=sc.nextInt();
char m=sc.next().charAt(0);
float per;
per=(CA*100)/CH;
if(per>=75 || m=='y'){
System.out.println("Allowed to sit in exam"+per);
}
else{
System.out.println("Not allowed to sit in exam"+per);
}
}
}
