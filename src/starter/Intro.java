package starter;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String base = "Hello";
		System.out.println(base);
		char secondChar = base.charAt(1);
		System.out.println(secondChar);
		
		for(int i = 0; i < base.length(); i++) {
			System.out.println(base.charAt(i));
		}
	}

}
