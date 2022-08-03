package DiscreteStructure;


public class RST_Relation extends Relation{
	
	RST_Relation(int [] set){
		super(set,set);
	}
	
	public boolean isReflexive() {
		for(int i=0;i<domain.length;i++)
				if(matrix[i][i]==false)return false;
		return true;
		
	}
	public boolean isSymetric() {
		for(int i=0;i<domain.length;i++)
			for(int j=0;j<codomain.length;j++) {
				if(!(matrix[i][j]&&matrix[j][i]))return false;
			}
		return true;
		
	}
	public boolean isTransitive() {
		for(int i=0;i<domain.length;i++)
			for(int j=0;j<codomain.length;j++)
				for(int c=0;c<codomain.length;c++){
				if(matrix[i][j]&&matrix[j][c]&&!matrix[i][c])
					return false;
				
			}
		return true ;
	}
	public boolean isEquevelance() {
		if(isReflexive()&&isSymetric()&&isTransitive()) return true;
		return false;
	}
	public void printEqClasses() {
		String s[] = new String[domain.length];
		if(this.isEquevelance()){
			for(int i=0 ;i<domain.length;i++)
				for(int j=0;j<codomain.length;j++){
					if(matrix[i][j])
						s[i]=""+domain[i];
				}
		}
		
		
	}

}
