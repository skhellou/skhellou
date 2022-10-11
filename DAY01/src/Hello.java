// 실행 - mac - cmd + shift + f11
// 저장 cmd + s
// 전체저장 cmd + shift + s
// -- mac -- 


// 프로그램 기본구조
import java.lang.*;
// import
// - c언어 - #include , Python - import
// - 만들어진 기능을 사용하겠다 ~ 
//  사용하고자 하는 기능의 위치를 적어서 사용준비를 하는 부분 

// java.lang.*
// - * -  모든 
// - java.lang - 패키지
// - 프로그램에서 기본적으로 필요한 기능들을 정의한 패키
// - 우리가 import 하지 않아도 자동으로 import 가 된다.

//{}
// 1. 영역 또는 지역 표시
// 2. 데이터의 묶음


public class Hello {	// Class 영역
	// 클래스명은 반드시 첫글자는 대문자. 달라지는 단어의 첫글자도 대문자. 암묵적인규칙
	// 클래스명과 파일명은 일치해야한다.
	// - 파일명을 통해서 클래스를 찾는다
	// - 자바는 프로그램코드는 반드시 클래스영역안에만 작성하여야 한다

	public static void main(String[] args) {  // main method 
		// method - 메소드와 함수의 차이점 ? 메소드 == 함수 
		// - 클래스 안의 함수를 메소드라고 부름.
		// - 프로그램이 실행할 때 가장 먼저 실행하는 메소드
		// - 프로그램에서 반드시 한개는 있어야 한다.
		// - 하나의 프로그램은 하나의 main 메소드를 가진다. main method2개 ? -> 프로그램 2개란 이야기
		
		System.out.println("Hello Java~");		// 명령문 
												// - 프로그램의 실질적인 실행 내
												// ' ; '  : (종료문자) - 명령문의 끝
												// - 하나의 명령이 끝났으니 다음 명령을 실행해라
												// - 명령문의 끝에는 항상 ; 을 적어주어야 한다.
		
		//System.out.println("Hello Java~");	 Java 에서의 표준 출력메소드 
		/*
		 *			 주석
		 * 프로그램의 부연 설명을 적는 문장 
		 * 프로그램 실행에 절대 관여하지 않는다.
		 */
		
		// 한 줄 주석 - 코드 한 줄에 대한 설명을 적을 때 사용한다
		
		/*
		  범위 주석
		  - 안의 내용은 모두 주석 처리
		  - 중간중간의 코드에 대한 부분적인 설명을 적을때 사용한다.
		 */
		
		/**
		  범위 주석
		  - 안의 내용은 모두 주석 처리
		  - 파일 전체적인 부분을 설명하는 주석 - 머릿말
		 */
		

	}

}
