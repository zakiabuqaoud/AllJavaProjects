package project;

public class Sort {
	
	Student s ;
	public Sort(){
		
		
		
		
		int id[] = new int[10];
		
		for(int i=0;i<id.length ; i++){
			for(int t = i+1 ; t<id.length ; t++){
				if(id[i]>id[t]){
					int temp = id[i];
					id[i]= id[t];
					id[t]= temp ;
					
					}
				
				}}
	 for(int m = 0 ;m<id.length;m++)
	        	 System.out.println(id[m]);}
	public static void main (String[]args){
		new Sort();
		
	}

}
