package ch06.sec10.exam02;

public class TelevisionExample {
	public static void main(String[] args) {
		System.out.println(Television.info);
	}
}

public class ClassName{
	//인스턴스 필드와 메소드 선언
	int field;
	void method1() { *** }
	
	//정적 필드와 메소드 선언
	static int field2;
	static void method2() { *** }
	
	//정적 블록 선언
	static {
		field1 = 10;		//컴파일 에러
		method1();			//컴파일 에러
		field2 = 10;
		method2();
	}
	
	//정적 메소드 선언
	static void method3() {
		this.field1 = 10;	//컴파일 에러
		this.mtehod1();		//컴파일 에러
		field2 = 10;
		method2();
	}
}    