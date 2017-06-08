
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="abc";
		String s4="abc";
		String s2=new String("abc");
		String s3=new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s4);
		System.out.println(s2.equals(s3));
		System.out.println(s2==s4);
		String s5=s1+s2;
		    System.out.println(s5);

	}

}
