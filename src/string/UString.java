package string;

public class UString {
    public static void main(String[] args) {
        string();
    }

    public static void string(){
        String s = new String(new char[]{'a','b','c','d','a','b'});
        //System.out.println(s.replaceAll("\\W","cd"));
        System.out.println(s.length());
        System.out.println(s.substring(6,6));
        System.out.println(s.length());
        System.out.println(s.indexOf("da"));

    }
}
