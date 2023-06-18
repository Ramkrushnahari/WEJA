package program;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcABCabcd";
		int len = str.length();
		char ch1=str.charAt(len);
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ch1)
			
				count++;
		
			
		}
		System.out.println(count);
	
	}

}
