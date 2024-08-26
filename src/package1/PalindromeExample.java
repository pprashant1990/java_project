package package1;

/*Palindrome number algorithm
 * 
Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "palindrome number"
Else print "not palindrome number"
*/

class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=121;//It is the number variable to be checked for palindrome  
  
   temp=n;
   System.out.println("temp number : "+temp);
   System.out.println("######################");
   while(n>0){    
   r=n%10;  //getting remainder
   System.out.println("remainder : "+r);
   sum=(sum*10)+r;
   System.out.println("sum : "+sum);
   n=n/10;   
   System.out.println("number : "+n);
   System.out.println("######################");
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
} 
