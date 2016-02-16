package ru.webshop.repository.hbm;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.webshop.model.CatalogType;
import ru.webshop.repository.CatalogTypeRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 07.01.2016.
 */
@Repository
public class HbmCatalogTypeRepositoryImpl implements CatalogTypeRepository {

    private static final Logger logger = LoggerFactory.getLogger(HbmCatalogTypeRepositoryImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public List<CatalogType> getAllCatalogType() {
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery("From CatalogType");
        List<CatalogType> list = (ArrayList<CatalogType>) query.list();
        for(CatalogType catalogType : list){
            logger.info("Catalog List item: " + catalogType.getName());
        }
        return list;
    }

    public CatalogType getCatalogTypeById(int id) {
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery("From CatalogType where id = :id").setParameter("id", id);
        return (CatalogType)query.uniqueResult();
    }
}
