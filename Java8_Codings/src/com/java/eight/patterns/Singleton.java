package com.java.eight.patterns;

public class Singleton {
	public static void main(String[] args) {
		DBConnection con01 = DBConnection.getInstance();
		DBConnection con02 = DBConnection.getInstance();
		DBConnection con03 = DBConnection.getInstance();
		System.out.println(con01.hashCode() + " , " + con02.hashCode() + " , " + con03.hashCode());
	}
}

class DBConnection {
	private DBConnection() {}
	private static volatile DBConnection instance;
	public static DBConnection getInstance() {
		synchronized (DBConnection.class) {
			if (null == instance) {
				instance = new DBConnection();
			}
			return instance;
		}
	}
}
