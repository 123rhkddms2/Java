package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		//변수 value 선언
		int value;
		value =2; 									//value값 없어서 오류가 나서, 임의로 초기화시킴
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		
		//변수 result의 값을 읽고 콘솔에 출력
		System.out.println(result);
	}
}
