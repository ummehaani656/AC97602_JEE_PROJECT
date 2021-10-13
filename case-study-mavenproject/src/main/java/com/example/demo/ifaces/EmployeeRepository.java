package com.example.demo.ifaces;

import java.util.List;

public interface EmployeeRepository<T,E,F> {
	public boolean add(T t);
	public List<T> findAll();
	public int update();
	public void findByBirthday(E e);
	public T findByName(F f);
	public void findByWeddingAnniversery(E e);
	
}
