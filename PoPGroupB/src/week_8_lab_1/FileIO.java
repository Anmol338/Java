package week_8_lab_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO {
	public void createFile(String filename) {
		// declare
		File file;
		boolean result = false;

		try {
			// input, process, output
			file = new File(filename);
			result = file.createNewFile();
			if (result == true) {
				System.out.println("File create successfully");
			} else {
				System.out.println("Error to create file");
			}

		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void deleteFile(String fileName) {
		// Declare
		File file;
		try {
			// input, process, output
			file  = new File(fileName);
			file.delete();
			System.out.println("Delete File successfully");

		} catch (Exception e) {
			//error message
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	public void writeData(String fileName, String data) {
		//write data on file
		
		//declare
		File file;
		FileWriter fw;
		try {
			file  = new File(fileName);
			fw = new FileWriter(file);
			fw.write(data);
			fw.close();
			System.out.println("Successfully write in file");
		} catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
	
	public void readData(String filename) {
		//read data from file
		//Declare
		File file;
		FileReader freader;
		try {
			file = new File(filename);
			freader = new FileReader(file);
			int ch;
			while((ch=freader.read())!=-1) {
				System.out.print((char)ch);
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
}
