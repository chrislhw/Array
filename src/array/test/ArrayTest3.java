package array.test;

public class ArrayTest3 {
	/*
	 * 十进制转二进制算法，利用容器，StringBuffer
	 */
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();
		while(num>0)
		{
			sb.append(num%2);
			num=num/2;
		}
		System.out.println(sb.reverse());
	}
	

	public static void main(String[] args) {
		toBin(15);

	}

}
