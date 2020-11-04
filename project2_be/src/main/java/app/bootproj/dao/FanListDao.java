
package app.bootproj.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.ApplicationScope;

import app.bootproj.pojo.FanList;

/**
 * FanListDao
 */
@Repository
public interface FanListDao extends JpaRepository<FanList,Integer>{

}