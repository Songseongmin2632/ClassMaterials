package c230904;


class Apple{}

/*
 * class Goods1{ private Apple apple= new Apple();
 * 
 * public Apple GetApple() { return apple; } public void SetApple(Apple apple) {
 * this.apple =apple; } }
 */
class Pencil{}
/*
 * class Goods2{ private Pencil pencil= new Pencil(); public Pencil GetPencil()
 * { return pencil; } public void SetApple(Pencil pencil) { this.pencil =pencil;
 * }
 * 
 * }
 */

//�� �ڵ带 ������ ���ο� ��ǰ�� �߰� �ɶ����� ���Ӱ� Ŭ������ ������ �ǳ�?
//�����ݾ�....
//ù��° �ذ� ����� �ֻ��� Ŭ������ ObjectŸ������ �����ϴ°�.
//Object ��ü�� �����ϰ� �����ϴ� Ŭ������ �����ϸ� �����̵�, �п�ǰ�̵� �����ϰų� �о���ϼ� ����



//class Goods3{
//	private Object object=new Object();
//	public Object Get() {
//		return object;
//	}
//	public void Set(Object object) {
//		this.object=object;
//	}
//	
//}

//	���׸� Ŭ������ ���׸� �������̽�
//	����ȯ,get,set,this �˾ƺ���!!

//���׸� Ŭ����
/*
 ���� ������ class Ŭ������<T>{
 
 }
  ���� ������ class Ŭ������<K,T>{
 
 }
 
  ���� ������ interface Ŭ������<T>{
 
 }
  ���� ������ interface Ŭ������<K,T>{
 
 }
*/
//���׸� Ŭ������ ��ü����
//��ü���� ������ �Ϲ� Ŭ������ ��ü ������ ���
//��, Ŭ������ ������<���� ���׸� Ÿ��>�� �����Ѵ�.
//��, ��ü�� �����Ҷ� ���׸� Ÿ�� ������ ���� Ÿ���� �����Ѵ�.

//Ŭ������<���� ���׸�Ÿ��> �������� �� =  new Ŭ������<���� ���׸� Ÿ��>();
//Ŭ������<���� ���׸�Ÿ��> �������� �� =  new Ŭ������<>();

//�� ����?
class MyClass<T>{
	
	private T t;
	public T Get() {
		return t;
	}
	public void Set(T t) {
		this.t =t;
	}
}
class KeyValue<K,V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void SetKey(K key) {
		this.key=key;
	}
	public V getValue() {
		return value;
	}
	public void SetValue(V value) {
		this.value=value;
	}
	
	
}

class CharacterFactory<T>{
	
	private T character;
	
	public CharacterFactory(T character) {
		this.character=character;
	}
	public void Introduce() {
		
		System.out.println(" ���� "+character.getClass().getSimpleName()+"character");
		//�޼��� ü�̴� ��� -> �޼��带 �������� ��� ��� (�ڵ��� �������� ����)
		//getClass �ֻ��� ObjectŬ�������� ������ �������°�,getSimpleName ���ڿ��� ��ȯ
	}
	public T getCharacter() {
		return character;
	}
	//String reString = inputString.trim().toUpperCase().substring(0,5)
	//���ڿ� �յڰ������� -> �빮�ڷ� ��ȯ -> ó�� 5���ڸ� ����
}
class Knight{
	private String name;
	
	public Knight(String name) {
		this.name =name;
	}
	public void Attack() {
		System.out.println(name + "Į�� �ֵη�!!!");
	}
}
class Wizard{
	private String name;
	public Wizard(String name) {
		this.name=name;
	}
	public void Skill() {
		System.err.println(name+ "ȭ�̾� �� �߽�");
	}
}
public class Generic {
	public static void main(String[] args) {
		
//		Goods3 goods3= new Goods3();
//		goods3.Set(new Apple());
//		
//		//Ÿ������ �������� ���ؼ��� ����� ���·� Ÿ�� ĳ������ �ؾ��Ѵ�.
//		//�ʵ� ��ü�� Object Ÿ���̶� Get���� �������� Ÿ�� ���� �׻� ObjectŸ���̱� ������.
//		//�׷��� Get�� �Ҷ��� Set�� �� Ÿ������ ����ȯ �ؾ��Ѵ�.
//		Apple apple= (Apple)goods3.Get();
		
		//���׸� Ŭ������ MyClass�� �Ẽ��?
		
		
		//String Ÿ�� �����ϰų� ���� �ü� �ִ� ��ü����
		MyClass<String> mc1=new MyClass<String>();
		mc1.Set("�ȳ�");
		System.out.println(mc1.Get());
		
		//Integer Ÿ�� �����ϰų� ���� �ü� �ִ� ��ü����
		MyClass<Integer> mc2=new MyClass<Integer>();
		mc2.Set(12345);
		System.out.println(mc2.Get());
		
		///���׸� Ÿ�� ������ 2���� ���
		KeyValue<String, Integer> kv1=new KeyValue<>();
		
		kv1.SetKey("������");
		kv1.SetValue(12345);
		String key1=kv1.getKey();
		int value1=kv1.getValue();
		System.out.println("Key : "+key1+" value : "+value1);
		
		KeyValue<String, Void> kv2=new KeyValue<>();
		
		kv2.SetKey("Ű���� ����ϰ���");
		//kv2.SetValue(1234);
		
		//////////////////////////////////////////////
		CharacterFactory<Knight> knightFactory=new CharacterFactory<>(new Knight("ȫ�浿"));
		CharacterFactory<Wizard> WizardFactory=new CharacterFactory<>(new Wizard("������"));
		
		knightFactory.Introduce();
		Knight knight=knightFactory.getCharacter();
		knight.Attack();
		
	}
}
