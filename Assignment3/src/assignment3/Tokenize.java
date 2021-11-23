package assignment3;

import java.util.StringTokenizer;
import java.util.Vector;

public class Tokenize {
	
	int count=0;
	
	BST objBST=new BST();
	Vector<String> vector = new Vector<String>();
	
	public Tokenize() //default constructor
	{
		
	}
	
	void TokenizeString(String str)  //function to tokenize string
	{
		StringTokenizer tok = new StringTokenizer(str," ");  
		  while (tok.hasMoreTokens()) {  
			  String temp=tok.nextToken();
			 
			  
			 addToVector(temp);
		     }  
	}
	
	void addToVector(String word)
	{
		vector.add(word);
		count++;
		System.out.println(vector);
		
		
		
	}
	
	public int receiveString(String str)
	{
		int counter=0;
		for(int i=0; i<count; i++)
		{
			
			if(str.equals(vector.get(i)))
			{
				
				counter++;
			}
		}
		return counter;
	}
	
	

	
}
