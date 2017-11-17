package com.infinite.sol.inner;

public class ApplicationBean {

	private DatabaseBean databaseBean;

	public DatabaseBean getDatabaseBean() {
		return databaseBean;
	}

	public void setDatabaseBean(DatabaseBean databaseBean) {
		this.databaseBean = databaseBean;
	}

	@Override
	public String toString() {
		return "ApplicationBean [databaseBean=" + databaseBean + "]";
	}
	
}
