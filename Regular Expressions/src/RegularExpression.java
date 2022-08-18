import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern ="[a-z]+";
		String check="Narendra";
		Pattern p =Pattern.compile(pattern);
		Matcher c=p.matcher(check);
		while(c.find())
			System.out.println(check.substring(c.start(),c.end()));
		

	}

}
