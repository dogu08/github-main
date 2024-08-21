package D2Ders11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner input=new Scanner(System.in);
		
		while(true)
		{
		   showMenu();
		   System.out.print(">> ");
		   int option=input.nextInt();
		   
		   switch( option)
		   {
		   case 1:
			  // System.out.println("1");
			   addBook(input);
			   break;
		   case 2:
			  // System.out.println("2");
			   readFile();
			   break;
		   case 3:
			  // System.out.println("3");
			   //System.out.println("Enter title of the book that you want search");
			   System.out.println("Enter category of the book that you want search");
			   String search=input.next();
			   search(search);
			   break;
		   case 4:
			   System.out.println("Enter delete word:");
			   String delete = input.next();
			   deleteBook(delete);
			   break;
		   case 5:
			   System.out.println("Enter the title of the book you want to update:");
               String updateTitle = input.next();
               System.out.println("Enter the parameter you want to update (title/author/category/price/publicationYear):");
               String parameter = input.next();
               update(updateTitle, parameter, input);
               break;
		   case 6:
               System.out.println("Exiting the program...");
               System.exit(0);
           default:
               System.out.println("Invalid option. Please try again.");
		   }
		}
		
	}
	
	public static void showMenu()
	{
		System.out.println("Add:1, List:2, Search:3, Delete:4, Update:5, Exit:6");
	}
	
	public static void addBook(Scanner input) throws IOException
	{
		String title, author, category, price, publicationYear;
		
		System.out.print("Title?");
		title=input.next();
		System.out.print("Author?");
		author=input.next();
		System.out.print("Catgeory?");
		category=input.next();
		System.out.print("Price?");
		price=input.next();
		System.out.print("PublicationYear?");
		publicationYear=input.next();	
		
		writeFile(title, author, category, price, publicationYear);
		
	  
	}
	
	public static void writeFile(String title, String author, String category, String price, String publicationYear) throws IOException
	{
		File f=new File("C:\\Users\\hugo9\\\\eclipse-workspace\\D2Ders11\\src\\D2Ders11\\myFile");
	    FileWriter fWriter=new FileWriter(f, true);
	    BufferedWriter bWriter=new BufferedWriter(fWriter);
	    bWriter.write(title+"\t"+author+"\t"+category+"\t"+price+"\t"+publicationYear+"\n");  
	    bWriter.close();
	}
	
	public static void readFile() throws IOException
	{
		String path="C:\\Users\\hugo9\\eclipse-workspace\\D2Ders11\\src\\D2Ders11\\myFile";
		File f=new File(path);
		FileReader fReader=new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		
		
		
		String line=bReader.readLine();
		boolean isExist=false;
		
		StringBuilder sBuilder=new StringBuilder();
		
		while(line!=null)
		{
			//System.out.println(line);
			sBuilder.append(line+"\n");
			line=bReader.readLine();
			isExist=true;
			
		}
		bReader.close();
		
		if(isExist)
			System.out.println(sBuilder.toString());
		else
			System.out.println("There are no books to list in the system...");		
		
	}
	
	public static void search(String searchedWord) throws IOException
	{
		String path="C:\\Users\\hugo9\\eclipse-workspace\\D2Ders11\\src\\D2Ders11\\myFile";
		File f=new File(path);
		FileReader fReader=new FileReader(f);
		BufferedReader bReader=new BufferedReader(fReader);
		
		
		
		String line=bReader.readLine();
		boolean isExist=false;
		
		StringBuilder sBuilder=new StringBuilder();
		
		while(line!=null)
		{
			
		String[] parts	=line.split("\t");
		if(parts[2].equalsIgnoreCase(searchedWord))
			System.out.println(line);
			
			line=bReader.readLine();
			isExist=true;
			
		}
		bReader.close();
	}
	
	
	public static void deleteBook(String deleteWord) throws IOException {
		
		File f = new File ("C:\\Users\\hugo9\\eclipse-workspace\\D2Ders11\\src\\D2Ders11\\myFile");
		FileReader fReader = new FileReader(f);
		BufferedReader bReader = new BufferedReader(fReader);
		String line = bReader.readLine();
		StringBuilder sBuilder = new StringBuilder();
		
		
		while(line!=null) {
			String[] parts = line.split("\t");
			if(!parts[0].equalsIgnoreCase(deleteWord))
				sBuilder.append(line);
			line = bReader.readLine();	
			
		}
		bReader.close();
		
		FileWriter fWriter = new FileWriter(f,false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.append(sBuilder);
		bWriter.close();
		
	}
	
    public static void update(String titleToUpdate, String parameter, Scanner input) throws IOException {
        String path = "C:\\Users\\hugo9\\eclipse-workspace\\D2Ders11\\src\\D2Ders11\\myFile";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        StringBuilder updatedContent = new StringBuilder();

        boolean isExist = false;

        while (line != null) {
            String[] parts = line.split("\t");
            if (parts[0].equalsIgnoreCase(titleToUpdate)) {
                System.out.print("Enter new " + parameter + ": ");
                String newValue = input.next();

                
                if (parameter.equalsIgnoreCase("title"))
                    parts[0] = newValue;
                else if (parameter.equalsIgnoreCase("author"))
                    parts[1] = newValue;
                else if (parameter.equalsIgnoreCase("category"))
                    parts[2] = newValue;
                else if (parameter.equalsIgnoreCase("price"))
                    parts[3] = newValue;
                else if (parameter.equalsIgnoreCase("publication year"))
                    parts[4] = newValue;

                
                StringBuilder updatedLine = new StringBuilder();
                for (String part : parts) {
                    updatedLine.append(part).append("\t");
                }
                updatedLine.deleteCharAt(updatedLine.length() - 1); 
                updatedContent.append(updatedLine).append("\n");

                isExist = true;
            } else {
                updatedContent.append(line).append("\n");
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        if (!isExist) {
            System.out.println("Book not found!");
            return;
        }

        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(updatedContent.toString());
        bufferedWriter.close();

        System.out.println("Book information updated successfully!");
    }

}

