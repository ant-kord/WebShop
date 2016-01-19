package ru.webshop.repository.hbm;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.webshop.model.CatalogType;
import ru.webshop.repository.CatalogTypeRepository;

import java.util.Collection;

/**
 * Created by Administrator on 07.01.2016.
 */
@Repository
public class HbmCatalogTypeRepositoryImpl implements CatalogTypeRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Collection<CatalogType> getAllCatalogType() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From CatalogType");
        Collection<CatalogType> collection = (Collection<CatalogType>) query.list();
        for(CatalogType catalogType : collection){
            System.out.println(catalogType.getName());
        }
        return collection;
    }

    @Transactional
    public CatalogType getCatalogTypeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        CatalogType catalogType = (CatalogType) session.load(CatalogType.class, id);
        return catalogType;
    }
}
