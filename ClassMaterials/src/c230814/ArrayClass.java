package c230814;

import java.util.Arrays;
import java.util.Random;

public class ArrayClass {
	public static void main(String[] agrs) {
		//Arrays(내장된 클래스)

		//배열을 다루는 유용한 메서드들을 제공하는 클래스

		//1.Sort(자주 사용됨)
		
		int[]numberArr= {5,3,7,10,2};
		
		System.out.print("정렬된 배열");

		//배열 정렬

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

		//배열을 지정된 길이로 복사

		//원본 배열보다 큰 길이로 복사하면 빈 요소가 채워진다.(0이나 null) 정수형은 0 참조형은 null
		
		int[] iArr= {1,2,3,4,5};
		
		int[] newArrs=Arrays.copyOf(iArr, 3);
		
		System.out.println("원본배열"+Arrays.toString(iArr));

		System.out.println("새로운배열"+Arrays.toString(newArrs));
		
		//배열 크기가 꽉 찾을 경우에만 2배씩 늘리고 싶다면?
		
		int[] originalArr=new int[5]; //초기배열

		//현재 배열의 크기를 나타내는 변수
		int size=0;
		
		for(int i=0; i<10; i++) 

		{

		if(size==originalArr.length) 

		{

		//배열이 꽉 찼을경우 크기를 2배로

		int[] newArr=Arrays.copyOf(originalArr, originalArr.length*2);

		originalArr=newArr; //새로운 배열을 원래 배열로 설정하여 참조변경

		}
		originalArr[size]=i; //데이터를 배열에 추가

		size++; //배열크기 증가

		}
		//출력
		
		for (int i=0; i<size; i++) 

		{

		System.out.print(originalArr[i]+" ");
		} 

		System.out.println();
		
		//equals

		//두 1차원 배열이 동일하냐?

		//길이와 요소를 비교한다.

		//둘다 동일하다면 true, 아니면 false를 리턴한다.

		int[] arr1= {1,2,3,4,5};

		int[] arr2= {1,2,3,4,5}; //길이가달라도 false

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
		
		//그외..

		//fill(채워준다), binarySearch(정렬된 배열에서 특정값을 검색), copyOfRange
	}
}
