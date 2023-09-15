package c230911.stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class OptionsTest {
	public static void test() {
		int[] arr = { 1, 3, 5, 7};
		int[] arr1 = { 2, 4, 6, 8, 9};
		
		System.out.println(Arrays.stream(arr)
				.filter(item->item % 3 == 0).count()); //3�� ����� ��ΰ�?
		System.out.println(Arrays.stream(arr1)
				.filter(item->item % 3 == 0).count());
		
		System.out.println(Arrays.stream(arr).sum()); //���ϱ�
		System.out.println(Arrays.stream(arr1).sum());
		
		System.out.println(Arrays.stream(arr).average().getAsDouble()); //��հ����ϱ�
		System.out.println(Arrays.stream(arr1).average().getAsDouble());
		
		System.out.println(Arrays.stream(arr).max().getAsInt()); //�ִ�
		System.out.println(Arrays.stream(arr1).max().getAsInt());
		System.out.println(Arrays.stream(arr).min().getAsInt()); //�ּڰ�
		System.out.println(Arrays.stream(arr1).min().getAsInt());
		
		int[] arr2 = {};
		try {
			System.out.println(Arrays.stream(arr2).average().getAsDouble());
			}catch(Exception e) {
				e.printStackTrace();
		
			OptionalDouble od = Arrays.stream(arr2).average();
			if(od.isPresent()) {
				System.out.println(od.getAsDouble());
			}else {
				System.out.println("����");
			}
			
			System.out.println(Arrays.stream(arr)
					.average().orElse(0.0));
			System.out.println(Arrays.stream(arr2)
					.average().orElse(0.0));
			
			Arrays.stream(arr)
					.average()			
					.ifPresent(item->System.out.println("���� : " + item));
			Arrays.stream(arr2)
					.average()			
					.ifPresent(item->System.out.println("���� : " + item));
			System.out.println(Arrays.stream(arr)
					.reduce(0, (a, b)->{
						return a + b / 2 + 1;
					})); //0�� ������ �� Ȥ�� �ʱⰪ, ����
			// 1, 3, 5, 7 => 16 / 2 => 8 + 4 => 12
			// 0.5 int 0 / 1.5 int 1 / 2.5 int 2 / 3.5 int 3 => 1 + 2 + 3 + 4
		
		}
	}
}
