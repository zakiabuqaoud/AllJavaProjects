package CompilerDesignProject;

public class Token {
	String name ;
	int type ;
	int lineNo ;
	
	public Token(String name , int type , int lineNo){
		this.name =name ;
		this.type = type ;
		this.lineNo= lineNo;
	}
	
	public String toString(){
		return this.name + " " + this.type + " " + this.lineNo ;
	}
	
}
