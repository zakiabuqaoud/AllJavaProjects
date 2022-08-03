package DiscreteStructure;


public class Relation {
	
	protected int[] domain;
	protected int[] codomain;
	protected boolean[][] matrix;
	protected boolean[] ddef;
	protected boolean[] range;
	String string;
	
	Relation(){
		
	}
	Relation(int[] domain,int[] codomain){
		this.domain = domain;
		this.codomain = codomain;
		matrix = new boolean[domain.length][codomain.length];
		ddef = new boolean[domain.length];
		range = new boolean[codomain.length];
	}
	
	public void setDomain(int[] d) {
		this.domain = d;
		matrix = new boolean[domain.length][codomain.length];
		ddef = new boolean[domain.length];
		range = new boolean[codomain.length];
		//ÚãáÊ åíß ÚÔÇä áãÇ íÚÏáåÇ íÛíÑ ÇáãÕİæİÉ æÊÕÈÍ ÇáÌÏíÏÉ
	}
	
	public void setCodomain(int[] d) {
		this.codomain = d;
		matrix = new boolean[domain.length][codomain.length];
		ddef = new boolean[domain.length];
		range = new boolean[codomain.length];
	}
	
	public void setDomain(int f,int l) {
		int c=l-f;
		for(int i=0;i<=c;i++) {
			this.domain[i]=f;
			f++;
		}
	}
	
	public void setCodomain(int f,int l) {
		int c=l-f;
		for(int i=0;i<=c;i++) {
			this.codomain[i]=f;
			f++;
		}
	}
	
	public void domainOfDef() {
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j])
					ddef[i]=true;
			}
		
	}
	
	public void range() {
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j])
					range[j]=true;
			}
	}
	
	public int getPos(int a, int[] s) {
		for(int i=0;i<s.length;i++) {
			if(s[i]==a)return i;
		}
		return -1;
	}
	
	public boolean addElement(int x,int y) {
		if(isInDomain(x)&&isInDomain(y)) {
			int p1 = getPos(x,domain);
			int p2 = getPos(y,codomain);
			matrix[p1][p2] = true;
		string =	string.concat("("+x+","+y+")");
			return true;
		}else return false;
	}
	
	public String toString() {
		return string;
	}
	public boolean isInDomain(int x) {
		for(int i=0;i<domain.length;i++) 
			if(domain[i]==x) return true;
		return false;
	}
	public boolean isInCodomain(int x) {
		for(int i=0;i<codomain.length;i++) 
			if(codomain[i]==x) return true;
		return false;
	}
	
public static void main (String[] args){
	new Relation();
}
}
