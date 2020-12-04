package projet_log_dev;

import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		//try {
			//Pretraitement.traitement();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		//}
		try {
			ArrayList<Line_of_Data> Dl;
			Statistics Stat;
			Search_files Sl = new Search_files("C:\\Log");
			if (Sl.findSearch("fic_log_ISS.txt")) {
				System.out.println("ui");	
				Dl = Sl.createDataList("fic_log_ISS.txt");
				//System.out.println(Dl.get(0).getProtocol());
				Stat = new Statistics(Dl);
				System.out.println("Nombr d'ip diff : " + Stat.getNbAdIP());
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
