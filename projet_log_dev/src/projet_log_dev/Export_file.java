package projet_log_dev;

import java.io.*;
public class Export_file {
	
	private String path_to_file;

	public Export_file() {
		super();
	}

	public Export_file(String path) {
		super();
		this.path_to_file = path;
	}
	
	// Generate a file with the data askde by the user
	public void generate_file(String name,String core) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(name + ".txt"));
		writer.write(core);
		writer.close();
	}
}
