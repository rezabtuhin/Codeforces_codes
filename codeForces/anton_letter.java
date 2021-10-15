import java.util.*;
public class anton_letter{
    private static char[] getCharArray(char[] array) {
        String _array = "";
        for(int i = 0; i < array.length; i++) {
            if(_array.indexOf(array[i]) == -1) 
                _array = _array+array[i];
        }
        return _array.toCharArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll(" ", "");
        s = s.replaceAll(",", "");
        s = s.replace("{", "");
        s = s.replace("}", "");
        char [] c = s.toCharArray();
        char [] c2 = anton_letter.getCharArray(c);
        System.out.println(c2.length);
    }
}