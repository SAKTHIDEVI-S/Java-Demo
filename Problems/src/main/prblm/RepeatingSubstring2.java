package main.prblm;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Scanner;

public class RepeatingSubstring2 {
	public List<String> results = new ArrayList<String>();

        public static List<String> RepeatingSubstring(String str,int substringLengthStart)
        {
            Hashtable<String, Integer> subStringCounter = new Hashtable<>();
            List<String> results = new ArrayList<String>();

            String lower_str = str.toLowerCase();
            String[] words = lower_str.split(" ");
            //looping through each word in words
            for(String word:words) {
            	//subStringLength begins with 2
                for (int substringLength = substringLengthStart; substringLength < word.length()+1; substringLength++) {

                    for (int index = 0; index < (word.length() - substringLength + 1); index++) {

                    	//making all possible substrings starting with length 2
                        String subString = word.substring(index, index + substringLength); 
                        if (subStringCounter.containsKey(subString)) {
                            subStringCounter.put(subString, subStringCounter.get(subString) + 1);

                            subStringCounter = OnlyLongString(subStringCounter,subString);
                            //System.out.println(subStringCounter);
                        } else {
                            subStringCounter.put(subString, 1);
                        }
                    }
                }
            }

            Set<String> allSubStrings = subStringCounter.keySet();
            for(String subString : allSubStrings){
                if (subStringCounter.get(subString) > 1){
                    results.add(subString);
                }
            }
            return results;
            
            


        }
    static Hashtable<String, Integer> OnlyLongString(Hashtable<String, Integer> subStringCounter,String longString)
    {
        Set<String> allSubStrings = subStringCounter.keySet();
        for(String subString : allSubStrings){
        	//if ever contains eve
            if ((longString.contains(subString)) && (!longString.equals(subString))){

                subStringCounter.put(subString,1);

            }
        }
        return subStringCounter;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> results = new ArrayList<String>();
        results = RepeatingSubstring(str,2);
        ListIterator<String> lItr = results.listIterator();
	      
	      while (lItr.hasNext()){
	          System.out.println(lItr.next());
	      }
	      if(results.isEmpty())
	      {
	    	  System.out.println("None");
	      }
        sc.close();

    }
}

