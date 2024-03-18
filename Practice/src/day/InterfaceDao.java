package day;

import java.util.Collection;

public interface InterfaceDao<T, K> {
	
	Collection<T> getAll();
	T getOne(K key);
	void create(T t);
	void deleteOne(K key);
	void update(T t);
}
