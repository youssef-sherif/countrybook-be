package com.travelneer.repository;

import java.sql.SQLException;

public interface IRepository<T> {

    void save(T entity) throws SQLException;

    void delete(T entity) throws SQLException;

}
