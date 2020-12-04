/**
 * 
 */
package projet_log_dev;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author nouveau
 *
 */
public class Pretraitement {
	public static void traitement() throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader lecteurAvecBuffer = null;
	    String ligne;

	    try
	      {
		lecteurAvecBuffer = new BufferedReader(new FileReader("/Users/nouveau/log.txt"));
	      }
	    catch(FileNotFoundException exc)
	      {
		System.out.println("Erreur d'ouverture");
	      }
	    
	    File yourFile = new File("FIC_PRE.txt");
	    yourFile.createNewFile(); // if file already exists will do nothing 
	    FileOutputStream oFile = new FileOutputStream(yourFile, false); 
	    while ((ligne = lecteurAvecBuffer.readLine()) != null) {
	    	
	    	String[] arrOfStr = ligne.split(" ");
	    	byte[] sp = ",".getBytes();
	    	String ip = arrOfStr[0];
	    	String domain = arrOfStr[1];
	    	String time = arrOfStr[2] + arrOfStr[3] + arrOfStr[4];
	    	time = time.substring(2, time.length() -6);
	    	String date_time = time.substring(0,9);
	    	time = time.substring(11);
	    
	    	String verb = arrOfStr[5];
	    	String request = arrOfStr[6];
	    	String http_code = arrOfStr[8];
	    	ByteArrayOutputStream output = new ByteArrayOutputStream();
	    	 
	    	// <ip> <domain> <time> <verb> <request> <code resp http>
	    	
	    	output.write(ip.getBytes());
	    	output.write(sp);
	    	output.write(domain.getBytes());
	    	output.write(sp);
	    	
	    	// yyyymmddThhmmss
	    	// -[01/Dec/2020:23:06:01+0100]
	    	//01/Dec/2020:00:06:00
	    	
	    	DateFormat formatter = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss"); 
	    	Date date = null;
	    	System.out.println(time);
			try {
				date = (Date)formatter.parse(date_time + " " +time);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("Erreur");
				e.printStackTrace();
			}
	    	time = new SimpleDateFormat("YYYYMMDD'T'HHMMSS").format(date);
	    	
	    	output.write(time.getBytes());
	    	output.write(sp);
	    	output.write(verb.getBytes());
	    	output.write(sp);
	    	output.write(request.getBytes());
	    	output.write(sp);
	    	output.write(http_code.getBytes());
	    	output.write("\n".getBytes());
	    	
	    	oFile.write(output.toByteArray());
	    	
	    	System.out.println("ip: " + arrOfStr[0]);
	    	System.out.println("domain: " + arrOfStr[1]);
	    	System.out.println("time: " + arrOfStr[2] + arrOfStr[3] + arrOfStr[4]);
	    	System.out.println("verb: " + arrOfStr[5]);
	    	System.out.println("request: " + arrOfStr[6]);
	    	System.out.println("code http: " + arrOfStr[8]);
	       /* for (String a : arrOfStr) {
	            System.out.println(a); 
	        } */
		      
	    }
	    lecteurAvecBuffer.close();
	}

}
