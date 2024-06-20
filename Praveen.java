class LeapYear
{
/*check whether given number is a leap year or not*/

	public static void main(String[] args)
	{
	 int year=2020;
	if(year%4==0)
	 System.out.println("Given year "+year+" is a Leap year");
	else
	 System.out.println("Given is "+year+" is not a Leap year");
	}
}




/*Write a program to any input character and check whether it is alphabet, digit or special character*/
class CharTyping

	char c='A';
	if(c>='A' && c<='Z')
	{
	 System.out.println("Given character "+c+" is  capital alphabet");
	}
	else if(c>='a' && c<='z')
	{
	 System.out.println("Given character "+c+" is small alphabet");
	}
	else if(c>='0' && c<='9')
	{
	  System.out.println("Given character "+c+" is a digit");
	}
	 else
	 {
	  System.out.println("Given character "+c+" is a special character");
	 }	
}
