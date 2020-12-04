package projet_log_dev;

import java.util.*;

public class Statistics {
	
	private ArrayList<Line_of_Data> DataList;

	public Statistics(ArrayList<Line_of_Data> Datalist) {
		super();
		this.DataList = Datalist;
	}
	
	public int getNbAdIP() {
		int res = 0;
		
		for(int i = 0;i<DataList.size();i++) {
			res++;
			for(int j = 0; j<i;j++) {
				// If IP adress did appear more than once, we reduce the res by 1 
				if (DataList.get(j).getIP_adress().equals(DataList.get(i).getIP_adress())) {
					res--;
					break;
				}
			}
		}
		return res;
	}
	
	public HashMap<String,Integer> get10FirstIpHits() {
		return null;
	}
	
	public HashMap<String,Integer> get10firstIpKo() {
		return null;
	}
	
	public HashMap<String,Integer> get10FirstUrl() {
		return null;
	}
	
	public float getTotalKo() {
		int total = 0;
		for(int i = 0;i<DataList.size();i++) {
		//	total += DataList.get(i).getKo();
		}
		return total;
	}
	
	public String getOs() {
		return "";
	}
	
	
	public String getBrowser() {
		return "";
	}

}
