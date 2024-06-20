class LeapWhile
{
	public static void main(String[] args)
	{
	 int yr=1900;
	 while(yr<=2024)
	 {
	 if((yr%4==0 && yr%100!=0) || (yr%400==0))
	 {
	  System.out.println(yr);
	 }
	  yr++;
	 
	 }
      }
 }
