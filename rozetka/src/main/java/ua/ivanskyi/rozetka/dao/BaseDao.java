package ua.ivanskyi.rozetka.dao;

import java.util.List;

public interface BaseDao<E, N extends Number> {
	E findById(N id);

	void save(E entity);

	void remove(E entity);

	E update(E entity);

	List<E> findAll();

	List<E> findAllByPage(int count, int page);
}
