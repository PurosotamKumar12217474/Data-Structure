package PODT;

public class MakeFancyString {
    public String makeFancyString(String s){
        char[] chars = s.toCharArray();
        char last = chars[0];
        int count = 1;
        int pos =1 ;

        for(int i=1 ; i<chars.length ; i++){
            if(chars[i] != last){
                last = chars[i];
                count =0;

            }

            if(++count > 2) continue;

            chars[pos++] = chars[i];
        }

        return new String (chars ,0 ,pos);

    }

    public static void main(String[] args) {
        MakeFancyString mfs = new MakeFancyString();

        String input = "aaabaaaa";
        String result = mfs.makeFancyString(input);

        System.out.println("Original String: " + input);
        System.out.println("Fancy String: " + result);
    }
}
