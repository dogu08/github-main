package D2Ders11;

public class StringExample {

	public static void main(String[] args) {
		
		//useDifferentStringCons();
		//useLengthCharAtGetCharMethod();
	
		String name1 ="Bob";
		String name2 = "bob";
		String name3 = "David";
		if(name2.compareTo(name1.toLowerCase())==0)
			System.out.println("These names are equal");
		else if(name2.compareTo(name3)>0)
			System.out.println(name2+ " is greater than "+name3);
		else
			System.out.println(name2+ " is less tahn " +name3);
		
		
		String str1 ="I love programming...";
		String str2 = "Do you love programming...";
		String str3 = "DO YOU LOVE PROGRAMMING...";
		
		System.out.println(str1.regionMatches(0, str2, 0, 4));
		System.out.println(str1.regionMatches(2, str2, 7, 4));
		System.out.println(str1.regionMatches(true, 2, str3, 7,4));
		
		if(name1.equalsIgnoreCase(name2))
            System.out.println("The names are equal");
		else
			System.out.println("The names are not equal");
		
		
		}
		
	public static void useLengthCharAtGetCharMethod() {
		String s1 = "hello there";
		char[] charArray = new char[5];
		
		System.out.printf("s1:%s\n", s1);
		System.out.printf("Lenght of s1:%d\n", s1.length());// 1 den başlıyor 
		
		System.out.println("My string is as follow");
		
		for(int i=0;i<s1.length();i++)
		{
				System.out.print(s1.charAt(i)+" "); 
		}
		
		System.out.println("\nMy reversed string is as follow");
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i)+" ");
		}
		
		System.out.println();
		s1.getChars(0, 3, charArray, 0);
		System.out.println(charArray);
	}
	
	public static void useDifferentStringCons() {
		char[] charArray = {'b','i','r','t','h',' ','d','a','y'};
		String s = new String("hello");
		
		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(charArray);
		String s4 = new String(charArray,6,3);
		
 
		System.out.printf("s1:%s\ns2:%s\ns3:%s\ns4:%s\n", s1,s2,s3,s4);
		
		Object[] myObject= {s1,s2,s3,s4};
		for(int i=0;i<myObject.length;i++) {
			System.out.println(myObject[i]);
		}
	}
}
