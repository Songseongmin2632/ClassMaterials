package c230911.dataStream;

import java.io.Serializable;

public class Student implements Serializable { //�ø��� ��ȣ�� �ڵ����� �����ϰ� �θ� �ȴ�!
	/**
	 * 
	 */
	private static final long serialVersionUID = 3621011578777647095L;
	int num;
	String name;
	double score;
	
	Student(int num, String name, double score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}
}
