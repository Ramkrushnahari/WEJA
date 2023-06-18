package program;

public class Hello {

	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				if(i==0 || j==0 || i==3 || j==3) {
					System.out.print(" * ");
				}
				else {
					System.out.print(" "+ a++ +" ");
				}
				
			}
			System.out.println(" ");
		}
	}
			
		

	}


