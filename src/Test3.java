
public class Test3 
{

	public static void main(String[] args)
	{
		String st="Ahmednagar";
		String re="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			re=re+st.charAt(i);
		}
		System.out.println(re);

	}

}
