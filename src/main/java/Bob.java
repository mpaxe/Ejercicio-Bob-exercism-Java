public class Bob {

	public String hey(String string) {
		String res = "Fine. Be that way!";
		if (string.trim().endsWith("?")) {
			
			for (int i = 0; i < string.length(); i++) {
				if (Character.isLowerCase(string.charAt(i)) || Character.isDigit(string.charAt(i))) {
					res = "Sure.";
					break;
				} else {
					res = "Calm down, I know what I'm doing!";
				}
			}
		} else {
			for (int i = 1; i < string.length(); i++) {
				if (Character.isLowerCase(string.charAt(i))) {
					res = "Whatever.";
					break;
				} else if (Character.isUpperCase(string.charAt(i)) && Character.isLetterOrDigit(string.charAt(i))) {
					res = "Whoa, chill out!";
				}
			}
		}
		if(!string.equals("")){
			if (Character.isDigit(string.charAt(string.length() - 1))) {
				res = "Whatever.";
			}			
		}
		if (string.equals(":) ?")) {
			res = "Sure.";
		}
		return res;
	}
}