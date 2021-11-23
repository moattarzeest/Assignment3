package assignment3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Files {
	
	
	private static Scanner input;
	static Scanner scint = new Scanner(System.in);
    public static void main(String[] args) {
    	
    	int counter=0;
        if(args.length == 0) {
            System.out.println("No file entered.");
            System.exit(1);
        }

        
        try {
            File file = new File(args[0]);
            input = new Scanner(file);
           // System.out.println("successfuly executed");
        } catch (IOException ioException) {
            System.err.println("Sorry, Cannot open file.");
            System.exit(1);
        }
        
        System.out.println("===================");
        System.out.println("Files entered are: ");
        System.out.println("===================");
        for(int i=0; i<args.length; i++)
        {
        	counter++;
        	System.out.println(args[i]);
        	
        }
        System.out.println("===================");
        System.out.println("Number of files entered: "+counter);
        System.out.println("===================");
        //Class objects
        BST objBST=new BST();
        Tokenize objToken=new Tokenize();
       
        //objBST.fileRead(args[0]);
        
        
       //***************************************************************************//
      //  System.out.println("===================");
        System.out.println("Words in vocabulary.txt");
        System.out.println("===================");
        
        //Reading vocabulary.txt
        try
        {
        File myObj=new File(args[0]);
        Scanner read=new Scanner(myObj);
        while(read.hasNextLine())
        {
        	String data=read.nextLine();
        	objBST.addString(data);
        	//BST obj2=new BST(data);
        	//objBST.getData(data);
        	System.out.println(data);
        	
        }
        read.close();
        }
        
        catch(FileNotFoundException e)
        {
        	System.out.println("Couldnot find file, try again later.");
        }
        while(true)
        {
        
        System.out.println("\n");
        System.out.println("Press 1 to view Binary Search Tree");
        System.out.println("Press 2 to view Vectors");
        System.out.println("Press 3 to view matches");
        System.out.println("Press 4 to exit");
        int choice = scint.nextInt();
     
        
        
        if(choice==1)
        {
        
        System.out.println("===================");
        System.out.println("The Binary Search Tree is: ");
        System.out.println("===================");
        objBST.traverseInOrder(objBST.root);
        
        
        }
        else if(choice==2)
        {
        	try
        	{
        		for(int i=1; i<args.length; i++)
        		{
        			File objRead=new File(args[i]);
        			Scanner read2=new Scanner(objRead);
        			while(read2.hasNextLine())
        			{
        				String data2=read2.nextLine();
        				//objMatch.matchString(data2);
        				objToken.TokenizeString(data2);
        				
        			}
        		}
        	}
        	
        	catch(FileNotFoundException e)
            {
            	System.out.println("Could not find file, try again later.");
            }
        	
        }
        else if(choice==3)
    	{
        	int var=0;
    	try
    	{
        	File newObj=new File(args[0]);
            Scanner read3=new Scanner(newObj);
            while(read3.hasNextLine())
            {
            	String data3=read3.nextLine();
            	var=objToken.receiveString(data3);
            	System.out.println("Frequency of  "+data3 +" " +var);
    		
    	    }
            
    	}
    	catch(FileNotFoundException e)
        {
        	System.out.println("Could not find file, try again later.");
        }
    	
    	}
        
        else if(choice==4)
        {
        	System.exit(1);
        }
        
        
        
        
     

        input.close();
        }
    }

}
