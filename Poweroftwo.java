//Ques:- Check whether number is power of two or not.
//
//ex:- '8' is in power of two


public class Poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ispoweroftwo(8));
	}
	public static boolean ispoweroftwo(int n)
	{
		if(n!=0)
		{
			int res =n & (n-1);
			if( res==0)
			{
				return true;
			}
		}
		
		return false;
	}

}
