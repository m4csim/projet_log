package projet_log_dev;

public class Line_of_Data {
	
	private String IP_adress;
	private String Domain;
	private String Date;
	private String Method;
	private String Url;
	private String Protocol;
	
	public Line_of_Data() {
		super();
	}
	
	public Line_of_Data(String IP_adress,String Domain,String Date,String Method,String Url,String Protocol) {
		super();
		this.IP_adress = IP_adress;
		this.Domain = Domain;
		this.Date = Date;
		this.Method = Method;
		this.Url = Url;
		this.Protocol = Protocol;
	}

	public String getIP_adress() {
		return IP_adress;
	}

	public void setIP_adress(String iP_adress) {
		IP_adress = iP_adress;
	}

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getMethod() {
		return Method;
	}

	public void setMethod(String method) {
		Method = method;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getProtocol() {
		return Protocol;
	}

	public void setProtocol(String protocol) {
		Protocol = protocol;
	}
	
}
