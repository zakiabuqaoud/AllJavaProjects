package OS;

public class OS {
	public static void main (String[] args){
		int in =0 ;
		int out=0 ;
		int size=10 ;
		String b[] = new String[size] ;
		boolean c=true ;
		
		while(c){
			if((in+1)% (size+1) == out  && (in==size)){
				System.out.print(in);
				System.out.print("no");
				c=false ;
				
			}
			else{
				b[in] ="next" ;
				System.out.print(b[in] + in);
				in = (in+1)% (size+1) ;
				
			}
		}
		
		c=true ;
		
		while(c){
			if(in==out){
				System.out.print("no");
				c=false ;
				
			}
			else{
				String s= b[out] ;
				System.out.print(s);
				out = (out+1)% (size+1) ;
				
			}
		}
		
		
		
	}

}
