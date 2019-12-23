package regex;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.*;
import java.util.stream.Stream;

public class URegex {

    public static void main(String[] args) throws Exception{
        UMatcher();
    }

    public static void UPattern() throws IOException {
        Pattern pattern = Pattern.compile("-");
        System.out.println(pattern.toString());
        String[] string = pattern.split("4 4 4-5 5 5");
        System.out.println(string[0]);
    }
    public static void UMatcher()throws IOException{
        Pattern pattern = Pattern.compile("-");
        Matcher matcher = pattern.matcher("444-555-666-777");
        matcher.find();
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        System.out.println(matcher.group());



    }
}
