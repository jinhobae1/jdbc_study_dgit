package kr.or.dgit.jdbc_study_dgit;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.erp_application.jdbc.DBCon;

public class DbConnectionTest {
	private static DBCon dbCon;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dbCon = DBCon.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		dbCon.connectionClose();
	}

	@Test
	public void test() {
		//Connection con = dbCon.getConnection();
		Assert.assertNotNull(dbCon);
	}

}
