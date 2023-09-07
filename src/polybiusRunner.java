import static java.lang.System.*;
import java.util.*;
public class polybiusRunner
{
    public static void main( String args[] ){
        polybiusCipher instance = new polybiusCipher();
        Scanner keyboard = new Scanner(System.in);
        String choice=" ";
        for(int z=0;z<1;z++){
            out.print("cypher or decypher? : ");
            String answer = keyboard.next();
            if(answer.toLowerCase().equals("cypher")){
                for(int i=0;i<1;i++){
                    out.print("Do you want to enter a keyword? (y or n) : ");
                    answer = keyboard.next();
                    if(answer.toLowerCase().equals("y")){
                        out.print("Enter keyword : ");
                        String key = keyboard.next();
                        instance.Keyword(key);
                    }else if (answer.toLowerCase().equals("n")){
                        instance.polybiusSquare();
                    }else{
                        out.print("please enter your answer, y for yes, n for no.");
                        i--;
                    }
                }
                out.print("Enter the word or statement you would like to be cyphered : ");
                String words=keyboard.next();
                out.print("Your cyphered statement is: " + instance.encryption(words));
            }
            else if(answer.toLowerCase().equals("decypher")){
                for(int i=0;i<1;i++){
                    out.print("Do you want to enter a keyword? (y or n) : ");
                    answer = keyboard.next();
                    if(answer.toLowerCase().equals("y")){
                        out.print("Enter keyword : ");
                        String key = keyboard.next();
                        instance.Keyword(key);
                    }else if (answer.toLowerCase().equals("n")){
                        instance.polybiusSquare();
                    }else{
                        out.print("please enter your answer, y for yes, n for no.");
                        i--;
                    }
                    out.print("Enter the code you would like to decrypt : ");
                    String code=keyboard.next();
                    out.print("Your decyphered code is: " + instance.decryption(code));
                }
            }else{
                out.print("Please enter whether you would like to cypher or decypher.");
                z--;
            }
        }
    }
}
