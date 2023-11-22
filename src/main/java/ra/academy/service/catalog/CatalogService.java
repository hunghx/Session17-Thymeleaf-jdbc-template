package ra.academy.service.catalog;

import ra.academy.dao.ICatalogDao;
import ra.academy.dao.impl.catalog.CatalogDao;
import ra.academy.model.Catalog;

import java.util.List;

public class CatalogService implements ICatalogService{
    private ICatalogDao catalogDao;

    public CatalogService(ICatalogDao catalogDao) {
        this.catalogDao = catalogDao;
    }

    @Override
    public List<Catalog> findAll() {
        return catalogDao.findAll();
    }

    @Override
    public Catalog findById(Long id) {
        return catalogDao.findById(id);
    }

    @Override
    public void save(Catalog t) {
        catalogDao.save(t);
    }

    @Override
    public void delete(Long id) {
        catalogDao.delete(id);
    }
}
