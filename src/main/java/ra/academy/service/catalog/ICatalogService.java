package ra.academy.service.catalog;

import ra.academy.model.Catalog;

import java.util.List;

public interface ICatalogService {
    List<Catalog> findAll();
    Catalog findById(Long id);
    void save(Catalog t);
    void delete(Long id);
}
