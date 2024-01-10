package sub1;

/**
 * 날짜 : 2024/01/10
 * 이름 : 김광은
 * 내용 : Java 제네릭 실습하기
 */
public class GenericTest {
	
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("일본", 1500);
		
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		FruitBox<Banana> box2 = new FruitBox<Banana>();
		
		box1.setFruit(a);
		box2.setFruit(b);
		
		System.out.println("box1 내용 : " + box1.getFruit());
		System.out.println("box2 내용 : " + box2.getFruit());
		
		
	}
}