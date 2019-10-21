package delhi.work.achyut;
import java.util.*;

class CategoryInfo{
	String id;
	String description;
	String data;
	ArrayList<SubCategoryInfo> mySubCategory = new ArrayList<SubCategoryInfo>();
	//Getters
	public String getId(){
		return id;
	}
	public String getDesc(){
		return description;
	}
	public String getData(){
		return data;
	}
	public ArrayList<SubCategoryInfo> getSubCategory(){
		return mySubCategory;
	}
	//Setters
	public void setId(String id){
		this.id = id;
	}
	public void setDesc(String desc){
		this.description = desc;
	}
	public void setData(String data){
		this.data = data;
	}
	public void setSubCategory(SubCategoryInfo obj){
		mySubCategory.add(obj);
	}
}