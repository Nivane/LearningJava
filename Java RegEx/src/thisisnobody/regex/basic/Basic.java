package thisisnobody.regex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic {
	public static void main(String[] args) {

		String[] strs = new String[] { "abcabcabcdefgabc", "abc+", "(abc)+", "(abc){2}" };
		System.out.println("Input: \"" + strs[0] + "\"");
		System.out.println("==============");
		for (String str : strs) {
			System.out.println("RegEx: \"" + str + "\"");
			Pattern p = Pattern.compile(str);
			Matcher m = p.matcher(strs[0]);
			if (m.find()) {
				System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
			} else {
				System.out.println("Not Match!");
			}
			// OUTPUT
			// Input: "abcabcabcdefgabc"
			// Regular Expression: "abcabcabcdefgabc"
			// Match "abcabcabcdefgabc" at positions 0-15
			// Regular Expression: "abc+"
			// Match "abc" at positions 0-2
			// Regular Expression: "(abc)+"
			// Match "abcabcabc" at positions 0-8
			// Regular Expression: "(abc){2}"
			// Match "abcabc" at positions 0-5
		}

	}
}
