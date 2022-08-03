package LinkedList;

public class ListNode {
	String yara ;
	ListNode link ;
	int length ;
	
	public ListNode(){
		yara = null ;
		link = null ;
	}
	public ListNode(String yara ,ListNode Link ){
		this.yara = yara ;
		this.link = link ;
		
	}
	public void  setyara (String n){
		yara = n ;
		
	}
	public String  getyara (){
		return  this.yara ;
		
	}
	public ListNode getlink(){
		return this.link = link ;
		
	}
	public ListNode setlink(ListNode l){
		return this.link = l ;
		
	}
	
}
