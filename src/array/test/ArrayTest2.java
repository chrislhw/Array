package array.test;

public class ArrayTest2 {
	/*
	 �����۰���ҷ����������е�Ԫ�أ��������Ч�ʣ������뱣֤���ҵ�����������������
	 */
	public static int halfSearch(int[] arr,int key)
	{
		int min,max,mid;
		min=0;
		max=arr.length;
		mid=(max+min)/2;
		
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min = mid+1;
			else if(key<arr[mid])
				max = mid-1;
			
			if(min>max)
				return -1;
			mid = (max+min)/2;
		}
		return mid;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int index = halfSearch(arr,4);
		System.out.println("index="+index);

	}

}
