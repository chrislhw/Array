package array.test;
import java.util.*;
class ArrayTest {
	/*
	 利用选择排序法对给定数组进行排序
	 内循环结束一次之后，最大值出现在头角标的位置上
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
	 打印数组的函数
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
	 冒泡排序法
	 */
	public static void bubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{
			for(int y=0;y<arr.length-x-1;y++)//-X让每一次比较的元素减少；-1避免角标越界
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
		//排序前打印
		printArray(arr);
		//排序
		//selectSort(arr);
		//bubbleSort(arr);
		Arrays.sort(arr);
		//排序后打印
		printArray(arr);
	}

}
