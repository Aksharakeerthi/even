# even
import java.io.*;
import java.util.*;
public class even{
public static void main(String args[]){
try{
Scanner sc=new Scanner(System.in);
int k;
System.out.println("Enter the number");
k=sc.nextInt();
for(int i=1;i<=k;i++){
if(i%2==0){
System.out.println(i+",");
}
}
}
catch(Exceptin e){}
}
}
