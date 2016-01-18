package com.vendapp.mvcconfig;

public class GeneralConfig {
	// Configuraciones para JPA
	public static final String PROPERTY_NAME_DATABASE_DRIVER = "com.mysql.jdbc.Driver";
	public static final String PROPERTY_NAME_DATABASE_URL = "jdbc:mysql://localhost:3306/vendapp";
	public static final String PROPERTY_NAME_DATABASE_USERNAME = "root";
	public static final String PROPERTY_NAME_DATABASE_PASSWORD = "adminadmin";
	public static final String PROPERTY_NAME_HIBERNATE_DIALECT = "org.hibernate.dialect.MySQL5Dialect";
	public static final boolean PROPERTY_NAME_HIBERNATE_SHOW_SQL = true;
}
