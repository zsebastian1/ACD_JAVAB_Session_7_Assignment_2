package Session7;

public class Assignment7_2 {

	public static void main(String[] args) {

		String str = "Hello. We love Java at RenrgyX! ";
		
		System.out.println("The full string is: " + str);
		
	String str1 =	str.substring(0, 6);
	String str2 =	str.substring(7, 10);
	String str3 =	str.substring(10, 14);
	String str4 =	str.substring(15, 19);
	String str5 =	str.substring(20, 22);
	String str6 =	str.substring(23, 31);

	
		
		System.out.println("\nThe String split into pieces is: " + "\n" +str1 + " " + "\n" + str2 + " " + "\n" + str3 + " " + "\n" +str4 + " " + "\n" + str5 + " " + "\n" + str6 );
		
	}

}
