package dao;

import java.util.ArrayList;

public interface InterfaceDAO<T> {
	public ArrayList<T> selectAll();

	public T selectById(T t);

	public int insert(T t);

	public int insertAll(ArrayList<T> arrT);

	public int delete(T t);

	public int deleteAll(ArrayList<T> arrT);

	public int update(T t);
}
