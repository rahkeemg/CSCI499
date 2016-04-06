package java_gram;

/**
 * This class is to represent a complete Java file.
 * Objects made with this class will encapsulate smaller 
 * the FileItem objects.
 */

import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class FileObject extends JSONObject {

	private String file_name, abs_path, rel_path, commit_id, repository;
	private JSONArray file_items = new JSONArray();
	private MetricsObj metrics;
	
	
	public FileObject() {
		// TODO Auto-generated constructor stub
	}

	public FileObject(Map map) {
		super(map);
		// TODO Auto-generated constructor stub
	}
	
	public void addFileItem(JSONObject obj){
		this.file_items.add(obj);
	}
	public void setMetrics(MetricsObj m) {
		this.metrics = m;
	}

	public void generate(){

		JSONObject object = new JSONObject();

		object.put("metrics", metrics);		
		object.put("file_items", file_items);
		this.put(this.file_name, object);
	}

	//GETTERS AND SETTERS
	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getAbs_path() {
		return abs_path;
	}

	public void setAbs_path(String abs_path) {
		this.abs_path = abs_path;
	}

	public String getRel_path() {
		return rel_path;
	}

	public void setRel_path(String rel_path) {
		this.rel_path = rel_path;
	}

	public String getCommit_id() {
		return commit_id;
	}

	public void setCommit_id(String commit_id) {
		this.commit_id = commit_id;
	}

	public String getRepository() {
		return repository;
	}

	public void setRepository(String repository) {
		this.repository = repository;
	}

	public JSONArray getFile_items() {
		return file_items;
	}

	public void setFile_items(JSONArray file_items) {
		this.file_items = file_items;
	}
	
	
}
