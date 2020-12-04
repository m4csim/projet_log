package projet_log_dev;

import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		try {
			Pretraitement.does();
			
			ArrayList<Line_of_Data> Dl;
			Statistics Stat;
			String ficname = "FIC_PRE.TXT";
			Search_files Sl = new Search_files("/Users/nouveau/eclipse-workspace/projet_log/projet_log_dev");
			Export_file Ef = new Export_file("/Users/nouveau/eclipse-workspace/projet_log/projet_log_dev/FIC.txt");
			if (Sl.findSearch(ficname)) {
				
				Dl = Sl.createDataList(ficname);
				//System.out.println(Dl.get(0).getProtocol());
				Stat = new Statistics(Dl);
				Ef.generate_file("Log_Stat",Stat.getNbAdIP());
				System.out.println("File created");	
			}
			else {
				System.out.println("fichier non trouvé");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
