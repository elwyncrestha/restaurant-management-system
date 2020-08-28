package com.github.elwyncrestha.rms.core.service;

import java.util.List;

/**
 * @param <T> An entity type.
 * @param <I> An entity ID type.
 *
 * @author Elvin Shrestha on 8/28/2020
 */
public interface BaseService<T, I> {

    T save(T t);

    T getOne(I id);

    List<T> getAll();

}
