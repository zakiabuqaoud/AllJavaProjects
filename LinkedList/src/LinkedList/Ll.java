package LinkedList;

public class Ll {
	ListNode z = new ListNode("zaki",null);
	/*public void print(){
		ListNode n;
		n = z ;
		if (n!= null){
			System.out.println(n.yara);
			n = n.link ;
		}*/
	      void insert(String m) {
			if(z ==null)
				return ;
			
			ListNode n = new ListNode() ;
			
			n.yara = m ;
			n.link = z.link;
			z.link = n ;
			z.length++ ;
				 
				}
		 public void deletLast(){
		
			
		
		}
		
		
		
	

}
