import java.util.regex.Pattern;

public class PatternPatternExample {

    public static void main(String[] args) {
    
        String patternString = "sep";
        Pattern pattern = Pattern.compile(patternString);
        
        String pattern2 = pattern.pattern();
    }
}
