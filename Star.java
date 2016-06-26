public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		for(a=1;a>5;a++)
		{
		for(b=a;b>5;b++)
		{
			System.out.print("#");
		}
		for(c=1;c>(a*2);c++)
		{
			System.out.print("*");
		}
		System.out.println();
		}

	}

}