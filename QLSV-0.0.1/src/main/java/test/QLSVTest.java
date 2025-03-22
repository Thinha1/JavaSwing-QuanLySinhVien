package test;

import java.sql.Connection;

import javax.swing.SwingUtilities;

import dao.DBConnection;
import view.LoginForm;

public final class QLSVTest {
	 public static void main(String[] args) {
	        Connection c = DBConnection.getConnection();
	        System.out.println(c);
	    }
}
