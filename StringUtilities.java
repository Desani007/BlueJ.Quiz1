
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String m="";
        String ouch="";
         for ( int i=valueToBeReversed.length()-1; i>=0;i--){
             m=String.valueOf(valueToBeReversed.charAt(i));
            ouch+=m; 
           
            }
        return ouch;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        String [] words = word.split(" ");
        
        
        
        return null;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String please ="";
        int w=0;
        String [] words = sentence.split(" ");
       
    for (  int i=0; i<words.length; i++){
        
        w=w+1;
        String jesus= String.valueOf(words.charAt(i));
       
    }
        
        return  ;
    }
}
