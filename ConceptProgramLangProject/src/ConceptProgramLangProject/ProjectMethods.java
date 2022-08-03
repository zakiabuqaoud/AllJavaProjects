package ConceptProgramLangProject;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProjectMethods {

	//get the tokens list arranged-----------------------------------------------
	public static ArrayList<Token> getTokens(String expression) {
		
		char expChars [] = new char[expression.length()+1];
		ArrayList<Token> tokens = new ArrayList<Token>();
		
		for(int i=0; i<expression.length(); i++)
			expChars[i] = expression.charAt(i);
		
		int i = 0;
		do {
			if(expChars[i] == '/') {
				tokens.add(new Token("/"));
				i++;
			}else if(expChars[i] == '^') {
				tokens.add(new Token("^"));
				i++;
			}else if(expChars[i] == '*') {
				tokens.add(new Token("*"));
				i++;
			}else if(checkNum(expChars[i]+"")) {
				String num = "";
				
				do{
					num = num + expChars[i];
					i++;
				}while(checkNum(expChars[i]+""));
				
				tokens.add(new Token(num));
				
			}else if(checkVar(expChars[i]+"")) {
				
				try {
					if(checkVar(expChars[i+1]+"")){
						String vars = "";
						
						do{
							vars = vars + expChars[i];
							i++;
						}while(checkVar(expChars[i]+""));
						
						tokens.add(new Token(vars));
					}else {
						tokens.add(new Token(expChars[i]+""));
						i++;
					}
				}catch(ArrayIndexOutOfBoundsException e) {
					tokens.add(new Token(expChars[i]+""));
					i++;
				}
				
			}else {
				tokens.add(new Token(expChars[i]+""));
				i++;
			}
			
		}while(i<expression.length());
		
		return tokens;	
	}
	
	//check if all tokens is acceptable------------------------------------------
	public static boolean isTokensAcceptable(ArrayList<Token> tokens) {
		
		for(int i=0; i<tokens.size(); i++) {
			if(tokens.get(i).getType() == 0)
				return false;
		}
		
		return true;
	}
		
	//check if a string is a number----------------------------------------------
		public static boolean checkNum(String s) {
			try {
				double x = Double.parseDouble(s);
				return true;
			}catch(Exception e) {
				return false;
			}
		}
	
	//check if a string is an alphabet character---------------------------------
	public static boolean checkVar(String s) {
		
		if(s.length() == 1) {
			
			if(s.charAt(0)>='a' && s.charAt(0)<='z')
				return true;
			else
				return false;
			
			}else
				return false;
		}
	
	//get strongest operand------------------------------------------------------
	public static int getStrongest(ArrayList<Token> tokens) {
		
		int index = -1;
		int level = 3;
		Token t;
		
		for(int i=0; i<tokens.size(); i++) {
			t = tokens.get(i);
			if(t.getLevel() == 1) return i;
			
			if(t.getLevel()>0 && t.getLevel()<=level) {
				
				index = i;
				level = t.getLevel();
			}
		}
		
		return index;
	}
	
	//parsing method-------------------------------------------------------------
	public static double parse(String expression, int way, int[] levels) {
		
		ArrayList<Token> tokens = getTokens(expression);
		if(!isTokensAcceptable(tokens)) {
			JOptionPane.showMessageDialog(null, "Unacceptable Expression", "Error", 2);
			JOptionPane.showMessageDialog(null, "Wrong Result", "Error", 2);
			return 0.0;
		}
		ArrayList<Token> tokensWork;//list to work on............................
		
		//filling levels.........................................................
		for(int i=0; i<tokens.size(); i++) {
			if(tokens.get(i).getType() == 1)
				tokens.get(i).setLevel(levels[0]);
			else if(tokens.get(i).getType() == 2)
				tokens.get(i).setLevel(levels[1]);
			else if(tokens.get(i).getType() == 3)
				tokens.get(i).setLevel(levels[2]);
		}
		
		//the way of computation from left or right..............................
		if(way == 1) {
			tokensWork = new ArrayList<Token>();
			for(int k=0; k<tokens.size(); k++) tokensWork.add(tokens.get(k));
			
		}else {
			tokensWork = new ArrayList<Token>();
			for(int j=tokens.size()-1; j>=0; j--) {
				tokensWork.add(tokens.get(j));
			}
			
		}
		
		//filling variables......................................................
		for(int i=0; i<tokensWork.size(); i++) {
			if(tokensWork.get(i).getType() == 5) {
				try {
					double num = Double.parseDouble(JOptionPane.showInputDialog("Enter value of " + tokensWork.get(i).getName() + " :"));
					tokensWork.get(i).setName(num+"");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Wrong Entries", "Error", 0);
					i--;
					continue;
				}
			}
		}
		
		//evaluation process.....................................................
		int index;
		Token t;
		double op1, op2, r;
		
		if(tokensWork.isEmpty() || tokensWork.size()<=2) {
			JOptionPane.showMessageDialog(null, "Empty Expression");
		}else {
			try {
				while(tokensWork.size()>2) {
					index = getStrongest(tokensWork);
					t = tokensWork.get(index);
					op1 = Double.parseDouble(tokensWork.get(index-1).getName());
					op2 = Double.parseDouble(tokensWork.get(index+1).getName());
					
					if(t.getType() == 1) {
						r = op1 / op2;
						tokensWork.remove(index);
						tokensWork.remove(index);
						tokensWork.remove(--index);
						tokensWork.add(index, new Token(r+""));
						
					}else if(t.getType() == 2) {
						r = Math.pow(op1,op2);
						tokensWork.remove(index);
						tokensWork.remove(index);
						tokensWork.remove(--index);
						tokensWork.add(index, new Token(r+""));
						
					}else if(t.getType() == 3) {
						r = op1 * op2;
						tokensWork.remove(index);
						tokensWork.remove(index);
						tokensWork.remove(--index);
						tokensWork.add(index, new Token(r+""));
						
					}
				}
				
				if(tokensWork.size() == 1)
					return Double.parseDouble(tokensWork.get(0).getName());
				else {
					JOptionPane.showMessageDialog(null, "Unacceptable Expression", "Error", 2);
					JOptionPane.showMessageDialog(null, "Wrong Result", "Error", 2);
					return 0.0;
				}
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Unacceptable Expression catch", "Error", 2);
			}
		}
		
		JOptionPane.showMessageDialog(null, "Unacceptable Expression", "Error", 2);
		return 0.0;
		
	}
	
}
