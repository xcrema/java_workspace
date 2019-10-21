package delhi.work.achyut;

public class SubscriberInfo {
	String userId;
	int opted_category;
	
	//getters
	public String getId(){
		return userId;
	}
	
	public String[] getOptCat(String[] bitToCatArray){
		String[] cat = new String[10];
		int j = 0;
		for(int i = 0 ; i < 32 ; i++) {
			if((opted_category & (1<<(i-1))) >= 1)cat[j++] = bitToCatArray[i];
		}
		return cat;
	}
	
	//setters
	public void setId(String id){
		this.userId = id;
	}
	
	public void setOptCat(String[] cat, String[] bitToCatArray){
		for(int i = 0; i < cat.length ; i++) {
			for(int j = 0 ; j < 32 ; j++) {
				if(bitToCatArray[j] == cat[i])opted_category |= (1<<j-1);
			}
		}
	}
}