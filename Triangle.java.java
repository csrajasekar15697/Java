import java.util.*
class Triangle {
    public static void main(String[] args)  
{  
    int i=0,j=0,mid=0;
Scanner sc= new Scanner(System.in);
System.out.print("Enter a string: ");  
String str= sc.next(); 
char[] ch = sc.toCharArray();       
System.out.println("Character Array...");
      for (i = 0; i < ch.length; i++) {
         System.out.print(ch[i]+" "); 
      }
  if(ch.length%2!=0){
         mid = (ch.length/2)+1;
    for(i=mid; i<ch.length; i++){
        for(j = 2*(ch.length-i); j >=0; j--){
            System.out.print(" ");
            }
        for(j = mid; j <= i; j++){
        System.out.print(ch[j]+" ");
        }
        }
    }     

  }
  else{
      System.out.print("Invalid input");
  }
}  
}  