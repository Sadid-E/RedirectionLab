public class PigLatin {

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' ||
        s.charAt(0) == 'o' || s.charAt(0) == 'u') {
          s = s + "hay";
        } else {
          s = s.substring(1,s.length()) + s.substring(0,1) + "ay";
        }
    return s;
  }

}
