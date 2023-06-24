import java.util.ArrayList;
import java.util.List;

import javax.print.event.PrintJobListener;

public class LetterCombinations {
  private static String DigitValue(char ch) {
    switch (ch) {
      case '2':
        return "abc";
      case '3':
        return "def";
      case '4':
        return "ghi";
      case '5':
        return "jkl";
      case '6':
        return "mno";
      case '7':
        return "pqrs";
      case '8':
        return "tuv";
      case '9':
        return "wxyz";
    }
    return "";
  }

  public static List<String> letterCombinations(String digits) {
    if (digits.length() == 0)
      return new ArrayList<>();

    String word = DigitValue(digits.charAt(0));
    List<String> temp = letterCombinations(digits.substring(1));

    if (temp.size() == 0)
      temp.add("");

    List<String> res = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      for (int j = 0; j < temp.size(); j++) {
        res.add(word.charAt(i) + temp.get(j));
      }
    }
    return res;
  }
  public static void main(String[] args) {
    String digits = "23";
    List<String> ans = new ArrayList<>();
    ans = letterCombinations(digits);
    System.out.println(ans);
  }
}
