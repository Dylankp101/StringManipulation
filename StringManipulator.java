

public class StringManipulator{
    public String TrimAndConcat(String str1, String str2){
        String a = str1;
        String b = str2;
        String c = a.concat(b);
        return(c);
    }
    public Integer getIndexOrNull(String word, char letter){
        Integer num = word.indexOf(letter);
        if(num == -1){
            num=null;
        }
        return num;
    }
    public Integer getIndexOrNull(String word, String spot) {
        Integer num = word.indexOf(spot);
        if(num == -1) {
            num=null;
        }
        return num;
    }
    public String concatSubstring(String str1, int int1, int int2, String str2) {
        String word = str1.substring(int1, int2);
        String finalWord = word.concat(str2);
        return finalWord;
    }
    
}