
public class LoopFun
{

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number){
        int num = 1;

        for (int i = number; i > 0; i--) {
            num = num * i;
        }
        return num;

    }
    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String damn= "";
        String f="";
        String [] word = phrase.split(" ");
        int i=0;
        int j=0;
        for(String m: word){
            i++;
            damn+= m.substring(0,1).toUpperCase();
        }

        return damn;
    }

               
            
    
    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */

      
    public String encrypt(String word) {
        String [] letters  =word.split("");
        String please="";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String [] alphabet = chars.split("");
        String a="";

        int i=0;;

        for ( int h=0;h<letters.length;h++){
            String b=letters[h]; 
            for (i=0;i<alphabet.length;i++){
                a=alphabet[i];
                if ( b.equals(a)){
                    a=alphabet[(i+3)%26];
                
                please+=a;
                break;
                }
            }

        }

        return please;

    }

     
}


