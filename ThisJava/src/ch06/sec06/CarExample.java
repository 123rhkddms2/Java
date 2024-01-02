package ch06.sec06;

public class CarExample {
	public static void main(String[] args) {
		
		//Car 객체 생성
		Car s = new Car();
		
		//Car 객체의 필드값 읽기
		System.out.println("모델명 : " + s.model);
		System.out.println("시동여부 : " + s.start);
		System.out.println("현재속도 : " + s.speed);
	}
}
