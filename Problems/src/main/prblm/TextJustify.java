package main.prblm;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class TextJustify {
	 static List<String> textJustify(String[] words, int maxNumOfCharacters) {
	        List<String> result = new ArrayList<>();
	        int numOfWords = words.length; //num of words in string array
	        int index = 0;
	        
	        while (index < numOfWords){
	            int totalChars = words[index].length(); //initialize to length of word index is pointing
	            int lastIndex = index + 1; //lastindex is the word after index
	            int gaps = 0; //initial value of gaps
	            
	            while (lastIndex < numOfWords){ //traverse till reaching the end of array
	                if (totalChars + 1 + words[lastIndex].length() > maxNumOfCharacters){
	                    break; //if we cannot add the lastindex in a line (length of index + lastindex 
	                    		//+ space exceeds the maxnumOfCharacters)
	                }
	                totalChars += 1 + words[lastIndex++].length();
	                gaps++; //if not add already value of totalChars and num of words in last index and the space to totalchars
	                		//and increement gaps and lastindex
	            }
	            
	            StringBuilder sb = new StringBuilder();
	            
	            if (lastIndex == numOfWords || gaps == 0){
	                for (int i = index; i < lastIndex; ++i){
	                    sb.append(words[i]).append(' ');
	                }
	                while(sb.length()>maxNumOfCharacters)
	                {
	                sb.deleteCharAt(sb.length() - 1);
	                }
	                while (sb.length() < maxNumOfCharacters){
	                    sb.append(' ');
	                }
	            } 
	            
	            else {
	                int spaces = (maxNumOfCharacters - totalChars) / gaps; 
	                int restSpaces = (maxNumOfCharacters - totalChars) % gaps;
	                for (int i = index; i < lastIndex - 1; ++i){
	                    sb.append(words[i]).append(' '); //space(gap)
	                    for (int j = 0; j < spaces + (i - index < restSpaces ? 1 : 0); ++j) { //if left - add rest too or add spaces
	                        sb.append(' ');
	                    }
	                }
	                sb.append(words[lastIndex - 1]); // last append the last word of the line
	            }
	            
	            result.add(sb.toString());
	            index = lastIndex;
	        }
	        return result;
	    }
	  
	  public static void main (String[] args){
		  //input number of words in string
	      Scanner sc = new Scanner(System.in);
	      int numOfWords = sc.nextInt();
	      sc.nextLine();
	      //create string array
	      String[] words=new String[numOfWords];
	      //input words in string
	      for(int i=0; i<numOfWords; i++)
	      {
	    	  words[i]=sc.nextLine();
	      }
	      //get max num of chars that can be in a line
	      int maxNumOfCharacters = 0;
	      System.out.println("Enter Maximum Number Of Characters in a line: ");
	      //throw exception if user enters string
	      try
	      {
	    	  maxNumOfCharacters = sc.nextInt();
	      }
	      catch (InputMismatchException e) {
	    	  System.out.println("Maximum Number Of Characters is not of type int");
	      }
	      //Array list to store result
	      List<String> result = new ArrayList<String>();
	      //call textJustify method
	      result = textJustify(words, maxNumOfCharacters);
	      //iterate through each item in result list and print it
	      ListIterator<String> lItr = result.listIterator();
	      
	      while (lItr.hasNext()){
	          System.out.println(lItr.next());
	      }
	      sc.close();
	  }
	
}
