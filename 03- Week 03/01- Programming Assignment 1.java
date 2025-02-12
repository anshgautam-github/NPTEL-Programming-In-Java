//Create recursive method to find factorial of a number

public static int factorial(int n){
  
  if(n==0 || n==1){
  		return 1;
  }
  int res=n* factorial(n-1);
  return res;
}
