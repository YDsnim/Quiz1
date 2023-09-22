package edu.mit.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import lombok.extern.log4j.Log4j;
@Log4j
public class ConnTest {
	
	@Test
	public void ConnTest() {
		
		try {

			System.out.println("db연결 중");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", 
					"root","1234");
			System.out.println("db연결 성공");
			Statement stmt = conn.createStatement();

		} catch (SQLException ex) {
			System.out.println("db연결 실패");
			System.out.println("SQLException" + ex);
		}
		
	}

	@Test
	public void jdbcTest() {
		log.info("잘 나와?");
	}
	
}
