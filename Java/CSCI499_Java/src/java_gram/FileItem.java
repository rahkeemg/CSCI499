package java_gram;

import java.util.Map;
import org.json.simple.JSONObject;

/**
 * This class is designed to be a representation
 * of the parts of a Java file.  ex: Class, methods
 * constructors, enums, interface (& its parts), etc.
 * 
 * This class holds the metrics asigned to the individual 
 * parts of its respecive Java program part.  
 */

public class FileItem extends JSONObject {

	private String name;
	private MetricsObj metrics;
	
	public FileItem() {
		// TODO Auto-generated constructor stub
	}

	public FileItem(Map map) {
		super(map);
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String s){
		name = s;
	}

	public void setMetric(MetricsObj obj){
		metrics = obj;
	}
	
	public void generate(){
		this.put(this.name, this.metrics);
	}
}
