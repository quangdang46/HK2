package communityuni.com;

public class TestDoiChuoi {

	public static void main(String[] args) {
		String s="Xin ch�o Obama! Tui l� Putin";
		s.replace("Obama", "Kim Jong Un");
		System.out.println(s);
		s=s.replace("Obama", "Kim Jong Un");
		System.out.println(s);
		
		s="Obama Xin ch�o Michelle Obama";
		s=s.replaceFirst("Obama", "Putin");
		System.out.println(s);
		
		s="Obama Xin ch�o Michelle Obama";
		s=s.replace("Obama", "Putin");
		System.out.println(s);

	}

}
