package java_gram;

import java.util.Map;
import org.json.simple.JSONObject;

/**
 * This class  extends JSONObject & is used to encapsulate the information
 * obtainned from the Stats object into a JsonObject.
 * The information will later be sent back as a Json response
 * 
 * @author rahkeemg
 */

public class MetricsObj extends JSONObject {

	public MetricsObj() {
		// TODO Auto-generated constructor stub
	}
	public MetricsObj(Map map) {
		super(map);
		// TODO Auto-generated constructor stub
	}
	public void addMetrics(Stats s){
		this.put("import", s.getImport());
		this.put("package", s.getPackage());
		this.put("comments", s.getComments());
		this.put("total lines", s.totalLines());
		this.put("try", s.getTry());
		this.put("catch", s.getCatch());
		this.put("if", s.getIf());
		this.put("else", s.getElse());
		this.put("do", s.getDo());
		this.put("while", s.getWhile());
		this.put("for", s.getFor());
		this.put("switch", s.getSwitch());
	}
}
