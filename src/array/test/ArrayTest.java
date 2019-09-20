package array.test;
import java.util.*;
class ArrayTest {
	/*
	 ����ѡ�����򷨶Ը��������������
	 ��ѭ������һ��֮�����ֵ������ͷ�Ǳ��λ����
	 */
	public static void selectSort(int[] arr)
	{
		for(int x=0;x < arr.length;x++)
		{
			for(int y = x+1;y < arr.length;y++)
			{
				if(arr[x] > arr[y])
				{
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	/*
	 ��ӡ����ĺ���
	 */
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}
	/*
	 ð������
	 */
	public static void bubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			for(int y=0;y<arr.length-x-1;y++)//-X��ÿһ�αȽϵ�Ԫ�ؼ��٣�-1����Ǳ�Խ��
			{
				if(arr[y]<arr[y+1])
				{
					int temp = arr[y];
					arr[y]=arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,5,8,7,4,1,3,6,9};
		//����ǰ��ӡ
		printArray(arr);
		//����
		//selectSort(arr);
		//bubbleSort(arr);
		Arrays.sort(arr);
		//������ӡ
		printArray(arr);
	}

}
