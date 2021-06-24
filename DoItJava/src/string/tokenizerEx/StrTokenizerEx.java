package string.tokenizerEx;

import java.util.StringTokenizer;

public class StrTokenizerEx {
	public static void main(String[] args) {
		String query = "name=gildong&addr=seoul&age=30&hobby=soccer";
		StringTokenizer st = new StringTokenizer(query, "&");
		int n = st.countTokens();
		System.out.println("token °³¼ö: " + n);
		
		for(int i = 0; i < n; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
