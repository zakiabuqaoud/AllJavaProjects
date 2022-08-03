package CompilerDesignProject;

import java.util.List;

public class Parser {
	int lookahead = 0;
	List<Token> tokens;
	
	public Parser(List<Token> tokens){
		this.tokens =tokens;
	}
	
	public void nextToken(){
		lookahead++;
	}
	
	public boolean match(String ng,int tg){
		if((tg == 0 &&  tokens.get(lookahead).name.toUpperCase().equals(ng) && tg == tokens.get(lookahead).type) ||((tg==tokens.get(lookahead).type && tg!=0))){ 
			nextToken();
			return true;
		}else{
			System.out.print("syntax error");
			error(ng,tg);
			//System.exit(0);
			return false ;
			
		}
	}
	public void error(String ng,int tg){
		if(tg == 0){
			System.out.println(">>> It is expected to have a keyword " + tokens.get(lookahead).name + " in line " + tokens.get(lookahead).lineNo + " in type  " + tokens.get(lookahead).type +"<<<");
		}else if(tg ==1){
			System.out.println(">>> It is expected to have a numeric  inline " + tokens.get(lookahead).lineNo + "<<<");
		}else if(tg ==2){
			System.out.println(">>> It is expected to have a id  inline " + tokens.get(lookahead).lineNo + "<<<");
		}
		
	}
	 public void program(){
	        match("PROGRAM",0);
	        identifierlist();
	        match(";",0);
	        declarations();
	        subprogram_declarations();
	        compound_statment();
	        match(".",0);
	    }
	 public void identifierlist(){
		 match("",2);
		 r1();
		 
		 
	 }
	 public void r1(){
		 if(tokens.get(lookahead).name.toUpperCase().equals(",")){
		 match(",",0);
		 match(" ",2);
		 r1();
		 }else{}
	 }
	 public void declarations(){//s
		 if(tokens.get(lookahead).name.toUpperCase().equals("VAR")){
			 match("VAR",0);
			 identifierlist();
			 match(":",0);
			 type();
			 match(";",0);
			 declarations();
		 }else{}
	 }
	 public void type(){
		 if(tokens.get(lookahead).name.toUpperCase().equals("ARRAY")){
			 match("ARRAY",0);
			 match("[",0);
	         match("",1);
		     match("..",0);
		     match("",1);
		     match("]",0);
		     match("OF",0);
		     standrd_Type();
		 }else{
			 standrd_Type();
		 }
		 
	 }
	 public void standrd_Type(){
		 match("INTEGER",0);
	     match("REAL",0);
	 }
	 public void subprogram_declarations(){
		
		 if(subprogram_declaration()){
	            subprogram_declarations();}
	    }

	    public boolean subprogram_declaration(){
	    	
	        if(subprogram_head()){
	            declarations();
	            compound_statment();
	            return true;
	        }
	        return false;
	    }
	    public boolean subprogram_head(){
	    	if(tokens.get(lookahead).name.toUpperCase().equals("FUNCTION")){
	    		match("FUNCTION",0);
	    		match(" ",2);
	    		arguments();
	    		match(":",0);
	    		standrd_Type();
	    		match(";",0);
	    		return true;
	    	} else if(tokens.get(lookahead).name.toUpperCase().equals("PROCEDURE")){
	    		match("PROCEDURE",0);
	            match("",0);
	            arguments();
	            match(";",0);
	            return true;
	        }
	        return false;
	    } 
	    public void arguments(){
	    	if(tokens.get(lookahead).name.toUpperCase().equals("(")){
	    		match("(",0);
	    		prameter_list();
	    		match(")",0);
	    	}else{}
	    }
	    public void prameter_list(){
	    	identifierlist();
	    	match(":",0);
	    	type();
	    	r2();
	    }
	    public void r2(){
	    	if(tokens.get(lookahead).name.toUpperCase().equals(";")){
	    		match(";",0);
	    		identifierlist();
	    		match(":",0);
		    	type();
		    	r2();
	    	}else{}
	    }
	    public boolean compound_statment(){
	    	if(tokens.get(lookahead).name.toUpperCase().equals("BEGIN")){
	    	match("BEGIN",0);
	    	optional_statment();
	    	match("END",0);
	    	return true;
	    	}
	    	return false;
	    }
	    public void optional_statment(){
	    	statment_List();
	    }
	    public void statment_List(){
	    	statment();
	    	r3();
	    }
	    public void r3(){
	    	if(tokens.get(lookahead).name.toUpperCase().equals(";")){
	    		match(";",0);
	    		statment();
		    	r3();
	    	}else{}
	    }
	    public boolean statment(){
	    	
	        if(variable()){
	            match(":=",0);
	            expression();
	            return true;
	            
	        }
	        else if(compound_statment()|| procedure_statment()){
	        	return true;
	            }
	        else if(tokens.get(lookahead).name.toUpperCase().equals("IF")){
	        	match("IF",0);
	            expression();
	            match("THEN",0);
	            statment();
	            match("ELSE",0);
	            statment();
	            return true;
	            
	        }
	        else if(tokens.get(lookahead).name.toUpperCase().equals("WHILE")){
	        	match("WHILE",0);
	            expression();
	            match("DO",0);
	            statment();
	            return true;
	            
	        }else{
	        	return false;
	        }
	    }
	    public boolean variable(){
	    	
	    	lookahead++;
	    	if(tokens.get(lookahead).name.toUpperCase().equals("(")){
	    		lookahead--;
	    		return false; 
	    	}
	    	lookahead--;
	    	
	    	if(tokens.get(lookahead).type == 2){
	    	match(" ",2);
	    	return true;
	    	}
	    	if(tokens.get(lookahead).name.toUpperCase().equals("[")){
	    		match("[",0);
	    		expression();
	    		match("]",0);
	    		return true;
	    	}
	    	return false;
	    }
	    public boolean procedure_statment(){
	    	
	    	match("",2);
	    	if(tokens.get(lookahead).name.toUpperCase().equals("(")){
	    		match("(",0);
	    		expression_List();
	    		match(")",0);
	    		return true;
	    	}
	    	return false;
	    }
	    public void expression_List(){
	    	expression();
	    	r4();
	    }
	    public void r4(){
	    	if(tokens.get(lookahead).name.toUpperCase().equals(",")){
	    		match(",",0);
	    		expression();
	    		r4();
	    	}else{}
	    }
	    public void expression(){
	    	 simple_expression();
	         if(match(">",0)||match("<",0)||match("<=",0)||match(">=",0)||match("<>",0)||match("=",0)){
	         simple_expression();
	         }
	    }
	    public void simple_expression(){
	    	if(match("+",0)||match("-",0)){
	    		term();
	    		r6();
	    	}else{
	    		term();
	    		r6();
	    			
	    		}
	    	
	    }
	    	
	          
		public void r6(){
			if(match("+",0)||match("-",0)||match("OR",0)){
	            term();
				r6();
	          }else{}
			
		}
	    public void term(){
	    	factor();
	    	r5();
	    }
	    public void r5(){
	    	if(match("*",0)||match("/",0)||match("DIV",0)|match("MOD",0)||match("AND",0)){
	    		factor();
	    		r5();
	    	}else{}
	    }
	    public void factor(){// problems
	    	if(tokens.get(lookahead).name.toUpperCase().equals("Not")){
	    		match("NOT",0);
	    		factor();
	    	}else if(tokens.get(lookahead).name.toUpperCase().equals("(")){
	    		match("(",0);
	    		expression();
	    		match(")",0);
	    	}else if(tokens.get(lookahead).type == 2){
	    		match("",2);
	    		match("(",0);
	    		expression_List();
	    		match(")",0);
	    	}else if (isNumeric(tokens.get(lookahead).name)){
	    		match(" ",1);
	    	}else{
	    		variable();
	    	}
	    }
	    
	    public static boolean isNumeric(String str) {
	        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
	    }
}
