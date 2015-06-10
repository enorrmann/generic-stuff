package ar.com.norrmann.remote.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

public class GenericDao<T> implements Dao<T> {

	private EntityManager em;
	Class<T> entityClass;

	public GenericDao(Class<T> entityClass,EntityManager em) {
		this.entityClass = entityClass;
		this.em = em;
	}

	@Override
	public List<T> list() {
		return null;
	}

	@Override
	public T find(Long id) {
		return em.find(entityClass, id);
	}

	@Override
	public T update(T t) {
		return null;
	}

	@Override
	public T create(T t) {
		return null;
	}

	@Override
	public String delete(Long id) {
		return null;
	}
}