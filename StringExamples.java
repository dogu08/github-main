package D2Ders11;

public class StringExamples {

	public static void main(String[] args) {
		//useStartWithEnd();
		//useIndexofLastIndexof();
		useSubString();
		//useConcat();
		useUpperCaseLowerCaseCharArrayTrim();
		
		boolean booleanValue=true;
		char charValue='R';
		int intValue=14;
		double doubleValue=313.13;
		
		System.out.println(String.valueOf(booleanValue));
		System.out.println(String.valueOf(charValue));
		System.out.println(String.valueOf(intValue));
		System.out.println(String.valueOf(doubleValue));
		
		Object[] myObject = {booleanValue, charValue, intValue, doubleValue};
		
		for(Object a:myObject)
		{
			System.out.println(String.valueOf(a)+" ");
		}
		
		
		
	}
	public static void useStartWithEnd() {
	String[] myString = {"started","starting","ended","ending"};
	
	for(String myValue:myString)
	{
		System.out.print(myValue+" ");
	}
	
	System.out.println();
	
	for(String myValue2:myString)
	{
		if(myValue2.startsWith("st"))
			System.out.print(myValue2+" ");
	}
	System.out.println();
	
	for(String myValue3:myString)
	{
	
		if(myValue3.endsWith("ed"))
			System.out.print(myValue3+" ");
			
	}
	}
	
	public static void useIndexofLastIndexof() {
		String myString = "abcdefgabc";
		System.out.println(myString.indexOf('a'));
		System.out.println(myString.lastIndexOf('a'));
	}
	
	public static void useSubString()
	{
		String myString = "abcdefghtyuoklalrgklasy";
		String myWord = "Where are you from?";
		
		System.out.println(myString.substring(3));
		System.out.println(myString.substring(3, 5));
		System.out.println(myWord.substring(6));
	}
	
	public static void useConcat()
	{
		String s1 = "Happy";
		String s2=" Birthday";
		String s3 = s1.concat(s2);
		
		System.out.println(s1.concat(s2));
		System.out.println(s2);
	}
	
	public static void useUpperCaseLowerCaseCharArrayTrim()
	{
		String s1 ="hello";
		String s2 ="GOODBYE";
		String s3 =" spaces"; //dosyadan okumayla ilgili sorular gelir
		System.out.println(s1.replace('l', 'L'));
		System.out.println(s1);
		s2= s2.toLowerCase();//s2'yi değiştirdik
		System.out.println(s2);
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println(s3);
		System.out.println(s3.trim());//öndeki boşluğu keser
		
		char[] myChar = s1.toCharArray();
		for(char myValue:myChar)
		{
			System.out.print(myValue+" ");
		}
	}
	
}
