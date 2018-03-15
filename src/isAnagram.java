import java.util.Arrays;

public class isAnagram {

    public boolean isAnagram(String string1, String string2) {
        char[] a = string1.toCharArray();
        char[] b = string2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.toString(a).equals(Arrays.toString(b));
    }
    
}
