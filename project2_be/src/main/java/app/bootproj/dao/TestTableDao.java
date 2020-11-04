package app.bootproj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.bootproj.pojo.TestTable;

/**
 * TestTableDao
 */
/**
 * TestTableDao
 */
@Repository
public interface TestTableDao extends JpaRepository<TestTable, Integer>{
    
}