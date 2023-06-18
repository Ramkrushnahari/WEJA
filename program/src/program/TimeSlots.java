package program;

public class TimeSlots {
	public static void main(String[] args) 
	{
		int a[]={1,4,8,16,18};
		int b[]={3,6,10,18,20};
		int c[]=new int[10];
		int d[]=new int[10];
		for(int i=0;i<a.length-1;i++)
		{
			if(b[i]!=a[i+1])
			{
				c[i]=b[i];
				d[i]=a[i+1];
			}else if(b[b.length-1]<24){
				//c[i]=b[b.leghth-1];
				d[i]=24;
			}
		}
		for(int i:c)
		{
			if(i!=0){
				System.out.println(i+" ");
			}
		}
		System.out.println();
		for(int i:d)
		{
			if(i!=0){
				System.out.println(i+" ");
			}
		}
	}
}

