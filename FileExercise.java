package D2Ders6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExercise {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\hugo9\\eclipse-workspace\\D2Ders6\\src\\D2Ders6\\myFile";
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.createNewFile();
			System.out.println("The file has been created...");
			}
		else {
			System.out.println("The file already exist");
		}
		
		FileWriter fWriter = new FileWriter(f,true);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		bWriter.append("Network Programming12\nWireless5\nLAN5\nNetwork Programming\n");
		//bWriter.append("Wireless");
		//bWriter.append("LAN");
		bWriter.close();
		
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader = new BufferedReader(fReader);
		
		String line = bReader.readLine();
		System.out.println(""+line);
		
		while(line !=null) {
			System.out.println(line);
			line = bReader.readLine();
		}
		
		bReader.close();
		
	}
}
