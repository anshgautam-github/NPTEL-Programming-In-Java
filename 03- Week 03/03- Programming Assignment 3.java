//Use while loop to count number of digits in an integer
int count = 0;
if(num==0)count = 1;
else{
  while(num!=0){
  		num=num/10;
    	count++;
  	
  }
  
}
System.out.print(count);
