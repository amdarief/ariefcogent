package com.ariefjdbc;
import  java.sql.*;
public class jdbctest {
	public class JDBCTest {
	public void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##roshan","cogent123");
	Statement st= con.createStatement();
	st.execute("create table emp_jan17(eno number(10), ename varchar2(50),eaddress varchar2(150),primary key(eno))");
	st.execute("insert into emp_jan17 values(1,'harsha','Highfield Ct')");
	st.execute("insert into emp_jan17 values(2,'roshan','Highfield Ct')");
	st.execute("insert into emp_jan17 values(3,'arif','Highfield Ct')");
	st.execute("insert into emp_jan17 values(4,'srimukhi','Highfield Ct')");
	st.execute("insert into emp_jan17 values(5,'mithun','Highfield Ct')");
	st.execute("insert into emp_jan17 values(6,'saran','Highfield Ct')");

	st.execute("update emp_jan17 set ename ='madhu' where eno = 5");
	st.execute("delete from emp_jan17  where eno= 6");
	ResultSet rs =st.executeQuery("select*from emp_jan17");
	while(rs.next()){
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString("ename"));
		System.out.println(rs.getString(3));
	}
	}
	}
	
	
	
}






