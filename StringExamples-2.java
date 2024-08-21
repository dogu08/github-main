package D2Ders12;

import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		useDiffrentStringBuilderConst();
		useLengthCapacity();
		useCharArray();
		useAppend();
		//useCharacterMethod();
		//ConvertIntChar();
		useSplit();
		
		Scanner input = new Scanner(System.in);
		//System.out.println("Enter firstName:");
		//String fName = input.next();
		//System.out.println(validateFirstName(fName));
		//String lName= input.next();
		//System.out.println(validateLastName(lName));
		//System.out.print("Please,enter zip code:");
		//String zipCode = input.next();
		//System.out.println(validateZip(zipCode));
		//System.out.print("Enter phone number:");
		//String phone = input.next();
		//System.out.println(validatePhone(phone));
		
		
		
	}
	
	public static boolean validatePhone(String phone)
	{
		return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	}
	
	public static boolean validateZip(String zip)
	{
		return zip.matches("\\d{5}");
	}
	
	public static boolean validateLastName(String lastName)
	{
		return lastName.matches("[a-zA-Z]+(['-][a-zA-Z]+)*");
	}
	
	public static boolean validateFirstName(String firstName)
	{
		return firstName.matches("[A-Z] [a-zA-Z]*");
	}
	
	public static void useDiffrentStringBuilderConst()
	{
		StringBuilder sBuilder1 = new StringBuilder();
		StringBuilder sBuilder2 = new StringBuilder(14);
		StringBuilder sBuilder3 = new StringBuilder("hello");
		
		System.out.printf("Buffer:%s\n",sBuilder1.toString());
		System.out.printf("Buffer:%s\n",sBuilder2.toString());
		System.out.printf("Buffer:%s\n",sBuilder3.toString());
	}
	
	public static void useLengthCapacity()
	{
		StringBuilder sBuilder= new StringBuilder("ab");
		sBuilder.setLength(7);
		sBuilder.ensureCapacity(1);//Boş hali 15 ile başlar
		
		System.out.printf("Buffer:%s\nCapacity:%d\nLenght:%d\n", sBuilder.toString(),sBuilder.capacity(),sBuilder.length());
	}
	
	public static void useCharArray()
	{
		StringBuilder sBuilder = new StringBuilder("Hello, there");
		System.out.printf("Character at 0 "+sBuilder.charAt(0)+"\nCharacter at 7 "+sBuilder.charAt(7)+"\n");
		
		char[] charArray = new char[sBuilder.length()];
		sBuilder.getChars(0, 3, charArray, 2);
		
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]+" ");
		}
		
		System.out.println();
		sBuilder.setCharAt(0, 'R');
		System.out.println(sBuilder.toString());
		sBuilder.reverse();
		System.out.println(sBuilder.toString());
	}
	
	public static void useAppend()
	{
		boolean boolValue = true;
		int intValue=14;
		double doubleValue=313.50;
		String stringValue="Java";
		StringBuilder sBuilder = new StringBuilder("Math");
		StringBuilder sBuilder3 = new StringBuilder();
		
		Object[] myObject = {boolValue,intValue,doubleValue,stringValue,sBuilder};
		
		for(int i=0;i<myObject.length;i++)
		{
			sBuilder3.append(myObject[i]+ "\n");
			System.out.println(sBuilder3.toString());
		}
		
	}
	
	public static void useCharacterMethod()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character");
		String word =input.next();
		char c = word.charAt(0);
		
		//System.out.println(Character.isDigit(c));
		//System.out.println(Character.isJavaIdentifierPart(c));
		//System.out.println(Character.isLowerCase(c));
		//System.out.println(Character.toLowerCase(c));
		//System.out.println(Character.isLowerCase(c));
		System.out.println(Character.isLetter(c));
	}
	
	public static void ConvertIntChar()
	{

		char[] charArray = {'A','B','C','D','F','a','b'};
		
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]+":"+(int)charArray[i]+"\n");
		}
		
		int[] intArray= {67,68,69,70,71};
		
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]+":"+(char)intArray[i]);
		}
	}
	
	public static void useSplit()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence");
		String myWord = input.nextLine();
		
		String[] parts=myWord.split(" ");
		
		System.out.println("Lenght:"+parts.length);
		
		for(int i=0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
	}
}
