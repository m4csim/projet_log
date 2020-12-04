package projet_log_dev;

import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		try {
			//Pretraitement.traitement();
			
			ArrayList<Line_of_Data> Dl;
			Statistics Stat;
			String ficname = "FIC_PRE.TXT";
			Search_files Sl = new Search_files("C:\\Log\\LogTraite");
			Export_file Ef = new Export_file("c:\\Log\\LogStat");
			if (Sl.findSearch(ficname)) {
				
				Dl = Sl.createDataList(ficname);
				//System.out.println(Dl.get(0).getProtocol());
				Stat = new Statistics(Dl);
				Ef.generate_file("Log_Stat",Stat.getNbAdIP());
				System.out.println("File created");	
			}
			else {
				System.out.println("non");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
