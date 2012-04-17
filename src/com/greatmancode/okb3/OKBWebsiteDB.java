package com.greatmancode.okb3;

import java.sql.SQLException;

import com.greatmancode.extras.lib.PatPeter.SQLibrary.MySQL;

public class OKBWebsiteDB
{
	public static MySQL dbm;
	public OKBWebsiteDB(OKB thePlugin) throws SQLException
	{
		dbm = new MySQL(thePlugin.getLogger(), "OKB", OKConfig.databaseHost, OKConfig.databasePort, OKConfig.databaseDB, OKConfig.databaseUser, OKConfig.databasePassword);
		dbm.open();
		if (!dbm.checkConnection())
		{
			throw new SQLException("Impossible to connect to MySQL database.");
		}
	}
}
