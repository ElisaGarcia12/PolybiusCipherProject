import java.util.ArrayList;
import java.util.Arrays;
public class polybiusCipher
{
    public String str="";
    public ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
    public String[][] square = new String[5][5];
    public void polybiusSquare(){
        int x=0;
        int y=0;
        for(int j=0; j<alphabet.size(); j++){
            square[x][y]=alphabet.get(j);
            y++;
            if(y==5){
                x++;
                y=0;
            }
        }
    }
    public void Keyword(String key){
        int x = 0;
        int y = 0;
        key.replace('j','i');
        for(int kw=0; kw<key.length()-1; kw++){
            for (int i=0; i<alphabet.size(); i++){
                if (key.substring(kw,kw+1).equals(alphabet.get(i))){
                    alphabet.remove(i);
                    square[x][y]=key.substring(kw,kw+1);
                    y++;
                    if(y==5){
                        x++;
                        y=0;
                    }
                }
            }
        }
        for(int j=0; j<alphabet.size(); j++){
            square[x][y]=alphabet.get(j);
            y++;
            if(y==5){
                x++;
                y=0;
            }
        }
    }

    public String encryption(String word)
    {
        int x=0;
        int y=0;
        for (int i=0; i<word.length()-1; i++){
            String let=word.substring(i,i+1);
            for (int row=0; row<square.length; row++){
                for (int col=0; col<square[row].length; col++){
                    if (square[row][col].equals(let)){
                        x=row+1;
                        y=col+1 ;
                    }
                }
            }
        }
        return str+x+y+" ";
    }
    
    public String decryption(String code)
    {
        int x;
        int y;
        String decrypt="";
        for(int i=0; i<code.length()-1; i=+2){
            if(code.substring(i).equals(" ")){
                decrypt+=" ";
                i++;
            }
            y= Integer.parseInt(code.substring(i))-1;
            x= Integer.parseInt(code.substring(i+1))-1;
            decrypt+=square[y][x];
        }
        return decrypt;
    }
}
//array list string (ABC's)
//keyword input
//2d arrray (list(?)) (final polybius square)
//i replaces j so if repeats of either it won't pull it to the 2d array
    //i and j can only be found for keyword, otherwise array list will only have i to choose from