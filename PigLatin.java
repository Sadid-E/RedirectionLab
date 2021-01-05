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

  public static String pigLatin(String s) {
    s = s.toLowerCase();
    String[] digraphs = {"bl","br","ch","ck","cl","cr","dr","fl",
    "fr","gh","gl","gr","ng","ph","pl","pr","qu","sc","sh","sk",
    "sl","sm","sn","sp","st","sw","th","tr","tw","wh","wr"};
    boolean b = false;
    for (int i = 0; i < digraphs.length; i++) {
      if (digraphs[i].equals(s.substring(0,2))) {
          b = true;;
      }
    }
    if (b) {
      s = s.substring(2,s.length()) + s.substring(0,2) + "ay";
    } else {
      return pigLatinSimple(s);
    }
    return s;
  }

  public static String pigLatinBest(String s) {
    s = s.toLowerCase();
    if (!Character.isLetter(s.charAt(0))) {
      s = s;
    } else
      if (!Character.isLetterOrDigit(s.charAt(s.length()-1))) {
        s = pigLatin(s.substring(0,s.length()-1)) + s.substring(s.length()-1,s.length());
      } else
        return pigLatin(s);
    return s;
  }

}
