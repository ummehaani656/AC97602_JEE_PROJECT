package com.training.ifaces;

public interface ManageData extends DataAccess {
	public boolean add(Object o);
	public int update(Object obj);
	public int remove(Object obj);

}
