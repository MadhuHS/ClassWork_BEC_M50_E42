package com.alpha.db;

public class SQLQuery {

	static String insertUser = "insert into alphahotels.users values(?,?,?,?,?,?,?)";
    static String selectUser = "select * from alphahotels.users where email = ? AND password = ?";
}
