package app.bootproj.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import app.bootproj.dao.FanListDao;
import app.bootproj.pojo.FanList;

/**
 * FanListService
 */
@Service

public class FanListService {

    @Autowired
    private FanListDao fanListDao;
    
    public List<FanList> getAll(){
        return fanListDao.findAll();
    }

    public Optional<FanList> getById(int id){
        return fanListDao.findById(id);
    }
}