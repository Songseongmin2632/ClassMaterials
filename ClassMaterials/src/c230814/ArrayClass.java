package c230814;

import java.util.Arrays;
import java.util.Random;

public class ArrayClass {
	public static void main(String[] agrs) {
		//Arrays(����� Ŭ����)

		//�迭�� �ٷ�� ������ �޼������ �����ϴ� Ŭ����

		//1.Sort(���� ����)
		
		int[]numberArr= {5,3,7,10,2};
		
		System.out.print("���ĵ� �迭");

		//�迭 ����

		Arrays.sort(numberArr);

		for (int i : numberArr) 

		{

		System.out.print(i+" ");

		}
		
		Random random=new Random();

		int[] numbers=new int[10];
		
		for(int i=0; i<numbers.length; i++) 

		{

		numbers[i]=random.nextInt(100);

		}

		System.out.println();

		System.out.println();
		
		for(int number : numbers) 

		{

		System.out.print(number+" ");

		}

		System.out.println();

		System.out.println();

		Arrays.sort(numbers);
		
		for(int number : numbers) 

		{

		System.out.print(number+" ");

		}

		System.out.println();

		System.out.println();
		
		//2.copyOf

		//�迭�� ������ ���̷� ����

		//���� �迭���� ū ���̷� �����ϸ� �� ��Ұ� ä������.(0�̳� null) �������� 0 �������� null
		
		int[] iArr= {1,2,3,4,5};
		
		int[] newArrs=Arrays.copyOf(iArr, 3);
		
		System.out.println("�����迭"+Arrays.toString(iArr));

		System.out.println("���ο�迭"+Arrays.toString(newArrs));
		
		//�迭 ũ�Ⱑ �� ã�� ��쿡�� 2�辿 �ø��� �ʹٸ�?
		
		int[] originalArr=new int[5]; //�ʱ�迭

		//���� �迭�� ũ�⸦ ��Ÿ���� ����
		int size=0;
		
		for(int i=0; i<10; i++) 

		{

		if(size==originalArr.length) 

		{

		//�迭�� �� á����� ũ�⸦ 2���

		int[] newArr=Arrays.copyOf(originalArr, originalArr.length*2);

		originalArr=newArr; //���ο� �迭�� ���� �迭�� �����Ͽ� ��������

		}
		originalArr[size]=i; //�����͸� �迭�� �߰�

		size++; //�迭ũ�� ����

		}
		//���
		
		for (int i=0; i<size; i++) 

		{

		System.out.print(originalArr[i]+" ");
		} 

		System.out.println();
		
		//equals

		//�� 1���� �迭�� �����ϳ�?

		//���̿� ��Ҹ� ���Ѵ�.

		//�Ѵ� �����ϴٸ� true, �ƴϸ� false�� �����Ѵ�.

		int[] arr1= {1,2,3,4,5};

		int[] arr2= {1,2,3,4,5}; //���̰��޶� false

		int[] arr3= {5,4,3,2,1};
		
		boolean isEquals=Arrays.equals(arr1, arr2);

		boolean isEquals1=Arrays.equals(arr1, arr3);
		
		System.out.println(isEquals);

		System.out.println(isEquals1);
		
		int[][] array1= {{1,2},{3,4}};

		int[][] array2= {{1,2},{3,4}};

		int[][] array3= {{3,4},{5,6}};
		
		boolean isEquals2=Arrays.deepEquals(array1, array2);

		boolean isEquals3=Arrays.deepEquals(array2, array3);
		
		System.out.println(isEquals2);

		System.out.println(isEquals3);
		
		//�׿�..

		//fill(ä���ش�), binarySearch(���ĵ� �迭���� Ư������ �˻�), copyOfRange
	}
}
