package lab3;
public class ParserUtils {
    public static String[] splitAll(String str){
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++){
            split[i] = split[i].replaceAll("\"", "");
        }
        return split;
    }
}
