package datenbasis;

public class Entry {
	private String key;
	private String content;
	public Entry(){
		key="empty";
		content="empty";
	}
	public Entry(String key,String content){
		this.key=key;
		this.content=content;
	}
	public String getKey(){
		return key;
	}
	public String getContent(){
		return content;
	}
	public void setKey(String key){
		this.key=key;
	}
	public void setContent(String content){
		this.content=content;
	}
	
}
