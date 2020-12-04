package projet_log_dev;

import java.util.*;

public class Statistics {
	
	private ArrayList<Line_of_Data> DataList;

	public Statistics(ArrayList<Line_of_Data> Datalist) {
		super();
		this.DataList = Datalist;
		System.out.println("Statistics in progress ...");
	}
	
	public String getNbAdIP() {
		String retour = "";
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
		retour = "Numbers of different Ip address : " + String.valueOf(res);
		return retour;
	}
	
	public HashMap<String,Integer> get10FirstIpHits() {
		HashMap<String,Integer> IpHits = new HashMap<String,Integer>();
		
		for(int i = 0;i<DataList.size();i++) {
			
			for (String s : IpHits.keySet()) {
				
				if(DataList.get(i).getIP_adress() == s) {
					IpHits.put(s,IpHits.get(s) + 1);
				}
				else {
					IpHits.put(DataList.get(i).getIP_adress(),1);
				}				
			}			
		}
		
		
		return IpHits;
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
