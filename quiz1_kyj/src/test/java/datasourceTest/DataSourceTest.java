package datasourceTest;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/Web-INF/spring/root-context.xml")
public class DataSourceTest {

	@Autowired
	private DataSource dataSource;

	@Test
	public void testDataSourceConn() {

		try {
				Connection con = dataSource.getConnection();
	
				System.out.println("DataSource 연결성공");
				System.out.println("con=" + con);

			}catch (SQLException e) {
			System.out.println("DataSource 연결실패");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void just () {
		System.out.println("공사중");
	}

}
