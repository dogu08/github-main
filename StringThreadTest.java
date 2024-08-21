package D2Ders14;

import java.util.ArrayList;
import java.util.List;

public class StringThreadTest {
public static void main(String[] args) {
	
	List myList =new ArrayList<>();
	String word="Java";
	String word2="Network";
	
	
	StringThread thread1 = new StringThread(myList,word);
	thread1.start();
	
	StringThread thread2 = new StringThread(myList,word2);
	thread2.start();
}
}
