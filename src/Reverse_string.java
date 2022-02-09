// 7. Write a Java Program to reverse the letters present in the given String.


public class Reverse_string {
    public static String reverse(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }
    public static void main(String[] args) {

        System.out.println(reverse("hi my name is sweeti"));
        System.out.println(reverse("tathastu internship"));
    }
}
