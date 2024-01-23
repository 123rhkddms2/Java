package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2024/01/23
 * 이름 : 김광은
 * 내용 : PreparedStatement Select 실습하기
 * 
 * PreparedStatement
 *  - 기존 Statement 보다 향상된 동작 SQL 생성을 위한 Statement
 *  - Query Parameter를 사용해서 값을 Mapping(사상, 바인딩) 해서 쿼리 실행
 * 
 * VO객체
 *  - VO(Value Object)객체는 SELECT의 결과 테이블의 속성을 갖는 객체
 *  - 테이블 개체(Entity)를 객체(Object)로 변환할 때 사용하는 객체
 *  - JSP, Spring에서는 DTE(Data Transfer Object)로 사용
 */

public class PreparedSelectTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "123rhkddms2";
		String pass = "1234";
		
		//리스트 생성
		List<User4VO> users = new ArrayList<>();
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - DB 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행객체 생성
			String sql = "select * from `User4`";
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			// 4단계 - SQL 실행
			ResultSet rs = pstm.executeQuery();
			
			// 5단계 - 실행 처리(SELECT 경우)
			while(rs.next()) {
				User4VO vo = new User4VO();
				
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setGender(rs.getString(3));
				vo.setAge(rs.getInt(4));
				vo.setHp(rs.getString(5));
				vo.setAddr(rs.getString(6));
				
				//리스트 추가
				users.add(vo);
			}
			
			
			
			
			// 6단계 - DB 종료
			rs.close();
			pstm.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(User4VO vo : users) {
			System.out.printf("%s, %s, %s, %d, %s, %s\n", vo.getUid(),
														  vo.getName(),
														  vo.getGender(),
														  vo.getAge(),
														  vo.getHp(),
														  vo.getAddr());
			}
	System.out.println("Select 완료...");
	}
}