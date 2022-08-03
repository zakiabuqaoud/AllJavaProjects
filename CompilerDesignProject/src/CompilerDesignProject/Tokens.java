package CompilerDesignProject;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Tokens {
	List<String> lineCode = new ArrayList<>() ; 
	static List<Token> tokens = new ArrayList<>() ;
	List<String> keywords = Arrays.asList(new String[]{"PROGRAM","INTEGER","BOOLEAN","BEGIN","END","PROCEDURE","IF","THEN","ELSE","FOR","TRUE","FALSE","DO","WRITE","MOD","DIV","REED","AND","OR","NOT","OF","ARRAY","<=",">=","VAR","*","<>",":=",";",",","..","<",">","(",")","[","]","/","+","-",".","=",":"});
	int lookahead = -1 ;
	
 	public Tokens(String codeFile) throws IOException{
		BufferedReader reedingLines= new BufferedReader(new FileReader(codeFile)); 
		String line = null ;
		while ((line = reedingLines.readLine()) != null){
			  lineCode.add(line); 
		  }
		for (int i = 0; i < lineCode.size(); i++){
			String[] tokenArray = lineCode.get(i).split(" ");
			for (int j = 0; j < tokenArray.length; j++){
				if(keywords.contains(tokenArray[j].toUpperCase())){
					Token t = new Token(tokenArray[j],0,i+1);
					tokens.add(t);
				}else if(isNumeric(tokenArray[j])){
					Token t = new Token(tokenArray[j],1,i+1);
					tokens.add(t);
				}else if(tokenArray[j].matches("[A-z]")){
					Token t = new Token(tokenArray[j],2,i+1);
					tokens.add(t);
					
				}
				
			}
		}
		
	}
 	public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
 	
 	public void toStringToken(){
 		for(int i=0;i<tokens.size();i++){
 			System.out.println(tokens.get(i).toString());
 		}
 		
 	} 
 	public static String printRow(){
		return "Name " + "Type " + "Line";
	}
 	
 	
	
	public static void main(String[] args)throws IOException{
		
		Tokens t = new Tokens("C:/Users/ThinkPad/workspace/CompilerDesignProject/PascalCode.txt");
		Parser parser = new Parser(tokens);
		parser.program();
		//System.out.println(parser.match("program",0));
		//System.out.println(printRow());
		//t.toStringToken();
	}
	//nextToken
	//functions => nontermnal ==> grammer 
	// match
	//error
	
	
	

}
