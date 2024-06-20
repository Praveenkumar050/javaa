public class manohar{
public static void main(String[] args)
{

/*write a  program to check whether a year is leap year or not*/
int year = 2020;
if(year%4 == 0)
{System.out.println("Given year "+year+" is Leap Year");}
else{System.out.println("Given year "+year+" is Not a Leap Year");}

/* Given year 2020 is Leap Year */





/*write a  program to input any character and check whether it is alphabet , digit or character*/

char c = '~';

if(c>='A' && c<='Z')
{
System.out.println("Given character "+c+" is an Capital Alphabet");}
else if(c>='0' && c<='9')
{System.out.println("Given character "+c+" is an digit");}
else{System.out.println("Given character "+c+" is an Special Character");}

/* Given character ~ is an Special Character */




/*A company insures */

String Marital_Status = "Married", Gender= "Male" ;
int Age=35;

if(Marital_Status== "Married")
{System.out.println("The driver is eligibe for insurance");}
else if(Marital_Status== "UnMarried" &&  Gender=="Male" && Age>30)
{System.out.println("The driver is eligibe for insurance");}
else if(Marital_Status== "UnMarried" &&  Gender=="Female" && Age>25)
{System.out.println("The driver is eligibe for insurance");}

/*The driver is eligibe for insurancess*/




}}