public class PigLatin {

  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    String[] vowels = {"a","e","i","o","u"};
    boolean a = false;
    for (int i = 0; i < vowels.length; i++) {
      if (vowels[i].equals(s.substring(0,1))) {
          a = true;;
      }
    }
    if (a) {
      s = s + "hay";
    } else {
        s = s.substring(1,s.length()) + s.substring(0,1) + "ay";
      }
    return s;
  }

}
