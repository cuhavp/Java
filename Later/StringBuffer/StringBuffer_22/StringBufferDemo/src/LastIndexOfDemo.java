/*
 * public int lastIndexOf(String str, int fromIndex)
 * 
 * Parameters: 
 * ---------- 
 * str - the substring to search for. 
 * fromIndex - the index to start the search from.
 * 
 * Returns: 
 * ------- 
 * the index within this sequence of
 * the last occurrence of the specified substring.
 */
public class LastIndexOfDemo
{

	public static void main(String[] args)
	{
		String str = "com.com.com";
		StringBuffer sb = new StringBuffer(str);

		//returns 4
		int indexPosition = sb.lastIndexOf("com", 7);
		System.out.println("lastIndexOf(\"com\",7) = "
				+ indexPosition);

	}
}