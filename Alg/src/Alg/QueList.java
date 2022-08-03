package Alg;

public class QueList {
	QueNode rear ;
	QueNode front ;
	

	int r,length =0 ;
	
	QueList(int nu){
		QueNode front = new QueNode(nu,null);
		length++ ;
			
	}
	QueList(){
		front = null;
		rear = null ;
		length = 0 ;
		
		
	}
	
	Boolean empty(){
		return length == 0 ;
	}
	
	void insert(int newnu){
		QueNode l =new QueNode();
		l.nu = newnu ;
		l.link =null ;
		if (rear == null){
			front=l;
			rear=l;
		    ++length ;}
		else{
			rear.link= l;
			rear =l ;
			++length ;
		
		}}
		int remove(){
			int number ;
			if(length==0){
				return 0 ;
			}
			if(length==1){
				number = front.nu;
				rear=null ;
				front = null;
				length--;
				return number;
			}
			
				QueNode l = front;
				number =front.nu;
				front=front.link ;
				l.link = null;
				length-- ;
				return number;
				
			
		         
		}
		public QueList concat(QueList q){
			
			while(q.front!=null) {
				this.insert(q.front.nu);
				q.remove();
			}
			return this;
			
		}
	

		
		
		public int[] sort(){
			QueList[] qu = new QueList[10];
			
			for(int i =0;i<10;i++)qu[i] = new QueList();
			
			while(!empty()){
				r=front.nu%10;
				qu[r].insert(front.nu);
			     remove();
			}
			for(int i=0 ; i<10;i++){
				concat(qu[i]);
				
			}
			
				while(!empty()){
					r=front.nu/10%10 ;
					qu[r].insert(front.nu);
				     remove();
				}
			for(int i=0 ; i<10;i++){
				concat(qu[i]);
			}
			while(!empty()){
				r=front.nu/100 ;
				qu[r].insert(front.nu);
			     remove();
			}
			for(int i=0 ; i<10;i++){
				QueList x = concat(qu[i]);
			
			}
			int[] a = new int[length];
			QueNode k = front ;
			for(int i=0;i<length ;i++){
				a[i]= k.nu ;
				k=k.link ;
			}
			
			
			return a ;
		}
		
		
		
		
		/*	public QueList concat(QueList q1,QueList q2){
		if(q1==null) return q2 ;
		if(q2==null) return q1 ;
		else
			q1.link = concat(q1.link,q2);
		return q1 ;	
	
	}*/
                }
			
			
			
			
		
			
			
		
	


