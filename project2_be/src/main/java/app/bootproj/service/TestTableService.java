package app.bootproj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.bootproj.dao.TestTableDao;
import app.bootproj.pojo.TestTable;

/**
 * TestTableService
 */
@Service
public class TestTableService {

    @Autowired
    private TestTableDao testTableDao;

    public List<TestTable> getAll(){
        return testTableDao.findAll();
    }

    public TestTable getById(int id){
        return testTableDao.getOne(id);
    }
}