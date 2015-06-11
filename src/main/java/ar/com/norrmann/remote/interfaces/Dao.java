package ar.com.norrmann.remote.interfaces;

import java.util.List;

public interface Dao<T> {

	public List<T> list();

	public T find(Long id);

	public T update(T t);

	public T create(T t);

	public String delete(Long id);
	// from cloud9
}
