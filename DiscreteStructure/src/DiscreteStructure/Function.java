package DiscreteStructure;

import javax.swing.JOptionPane;

public class Function extends Relation{
	
	private boolean injectiveFlag;
	
	Function(){
		
	}
	Function(int[] domain,int[] codomain){
		super(domain,codomain);
	}
	
	public int getImg(int x) {
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==true) return codomain[j];
			}
		return -1;
	}
	public int getPreImg(int y) {
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==true) return domain[i];
			}
		return -1;
	}
	public boolean addElement(int x,int y) {
		if(isInDomain(x)&&isInCodomain(y)) {
			int p1 = getPos(x,domain);
			int p2 = getPos(y,codomain);
			
			for (int i=0;i<matrix.length;i++)
				for(int j=0;j<matrix[i].length;j++)
					if(matrix[i][j]) return false;
			
			matrix[p1][p2] = true;
			return true;
		}
		return false;
	}
	public boolean isLeftTotal() {
		injectiveFlag = true ;
		for(int i=0 ;i<ddef.length;i++){
			if(ddef[i]= true)injectiveFlag =true;
			injectiveFlag =false;
		}
		return injectiveFlag;
	}
	public boolean isRightTotal() {
		injectiveFlag = true ;
		for(int i=0 ;i<range.length;i++){
			if(range[i]= true)injectiveFlag =true;
			injectiveFlag =false;
		}
		return injectiveFlag;
		
	}
	public boolean isInjective() {
		boolean check[] = new boolean[codomain.length];
		int count=0;
		for(int i=0;i<codomain.length;i++) {
			for(int j=0;j<domain.length;j++) {
				if(matrix[j][i]) count++;
			}
			if(count==1) check[i]=true;
			else check[i] = false;
		}
		
		for(int i=0;i<codomain.length;i++)
			if(check[i]==false)return false;
		return true;
		
	}
	public boolean isSurjective() {
		boolean check[] = new boolean[codomain.length];
		
		for(int i=0;i<codomain.length;i++) 
			for(int j=0;j<domain.length;j++) {
				if(matrix[j][i]) check[i] = true;
			}
		
		for(int i=0;i<codomain.length;i++)
			if(check[i]==false)return false;
		return true;
		
	}
	public boolean isBijective() {
		if(isInjective()&&isSurjective())
			return true;
		return false;
		
	}
    public Function composite(Function g) {
    	injectiveFlag= true ;
    	for(int i=0;i<codomain.length;i++){
    		if(this.codomain[i]==g.domain[i]){
    			injectiveFlag= true ; ;
    		}else {
    			injectiveFlag= false ;
    			return null ;}
    	}
    	for(int i=0;i<domain.length;i++){
    		if((this.ddef[i]=true)&&(this.range[i]==true)&&(g.ddef[i]==true)&&(g.range[i]==true)){
    			injectiveFlag= true ;
    		}else
    			injectiveFlag= false;
    		return null ;
    	}
    	
    	Function f = new Function();
    	f.setDomain(domain);
    	f.setCodomain(codomain);
    	for(int i=0;i<domain.length;i++)
    		f.addElement(domain[i], codomain[i]);
    

		return f ;
    	
    	
    	
    	
	}
	
	
	

}
