package projet_log_dev;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Search_files {
	
	private String path_to_file;

	public Search_files() {
		super();
	}
	
	public Search_files(String path) {
		super();
		this.path_to_file = path;
	}
	
	
	// Searching in the repository if the file is missing or not
	public boolean findSearch(String filename) {
		File fichier = new File(path_to_file + "\\" + filename);
		return fichier.exists();
	}

	public ArrayList<Line_of_Data> createDataList() throws IOException{
		ArrayList<Line_of_Data> DataList = new ArrayList<Line_of_Data>();
		String line;
		Line_of_Data Dataline;
		String separator = ",";
		
		try {
			FileReader reader = new FileReader(path_to_file);
		
			BufferedReader breader = new BufferedReader(reader);
		
			while((line = breader.readLine()) != null) {
				String SplittedLine[] = line.split(separator);
				if (SplittedLine.length < 6) {
					Dataline = new Line_of_Data(SplittedLine[0],SplittedLine[1],SplittedLine[2],SplittedLine[3],SplittedLine[4],SplittedLine[5]);
					DataList.add(Dataline);
				}
			}
		}
		catch(IOException e) {
			System.err.format("Exception : %s%n", e);
		}
		
		return DataList;
	}

	public String getPath_to_file() {
		return path_to_file;
	}

	public void setPath_to_file(String path_to_file) {
		this.path_to_file = path_to_file;
	}
	
}
