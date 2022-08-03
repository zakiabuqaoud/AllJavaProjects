package ConceptProgramLangProject;

public class Token {

	private String name;
	private int type;
	private int level;
	
	public Token(String tChar) {
		this.setName(tChar);
		this.setType();
		this.setLevel(1);
	}
	
	//set token name------------------------------------------
	public void setName(String s) {
		this.name = s;
	}
	
	//get token name------------------------------------------
	public String getName() {
		return this.name;
	}
	
	//set token type------------------------------------------
	public void setType() {
		
		if(this.name.equals("/"))
			this.type = 1;
		else if(this.name.equals("^"))
			this.type = 2;
		else if(this.name.equals("*"))
			this.type = 3;
		else if(ProjectMethods.checkNum(this.name))
			this.type = 4;
		else if(ProjectMethods.checkVar(this.name))
			this.type = 5;
		else
			this.type = 0;
	}
	
	//get token type-------------------------------------------
	public int getType() {
		return this.type;
	}
	
	// set token level-----------------------------------------
	public void setLevel(int l) {
		
		if(this.type == 4 || this.type == 5)
			this.level = 0;
		else if(l==1 || l==2 || l==3)
			this.level = l;
	}
	
	//get token level------------------------------------------
	public int getLevel() {
		return this.level;
	}
	
	//to string for the token----------------------------------
	public String toString() {
		
		String t;
		if(this.type == 1) t = "division operator";
		else if (this.type == 2) t = "power operator";
		else if (this.type == 3) t = "multiple operator";
		else if (this.type == 4) t = "constant";
		else if (this.type == 5) t = "variable";
		else { 
			this.type =0;
			t = "wrog token";
		}
		return this.name + "   =>   " + t;
	}
	
}
