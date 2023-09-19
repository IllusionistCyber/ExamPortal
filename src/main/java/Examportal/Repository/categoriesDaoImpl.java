package Examportal.Repository;

import Examportal.Entity.Exam.categories;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.LinkedHashSet;
import java.util.Set;


@Repository
public class categoriesDaoImpl implements categoryRepo{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public categories addCategories(categories categories) {
        entityManager.persist(categories);
        entityManager.flush();
        entityManager.clear();
        return categories;
    }

    @Override
    public categories updateCategories(categories categories) {
        entityManager.merge(categories);
        entityManager.flush();
        entityManager.clear();
        return categories;
    }

    @Override
    public void deleteCategories(Long Id) {
        CriteriaBuilder queryBuilder=entityManager.getCriteriaBuilder();
        CriteriaDelete<categories> deleteCriteria = queryBuilder.createCriteriaDelete(categories.class);
        Root<categories> entityRoot=deleteCriteria.from(categories.class);
        Predicate condition=queryBuilder.and(queryBuilder.equal(entityRoot.get("cid"),Id));
        deleteCriteria.where(condition);
        entityManager.createQuery(deleteCriteria).executeUpdate();
    }

    @Override
    public Set<categories> getAllCategories() {
        CriteriaBuilder queryBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<categories> criteriaQuery = queryBuilder.createQuery(categories.class);
        Root<categories> entityRoot = criteriaQuery.from(categories.class);
        return new LinkedHashSet<>(entityManager.createQuery(criteriaQuery).getResultList()) ;
    }

    @Override
    public categories getCategoryById(Long Id) {
        return entityManager.find(categories.class,Id);
    }
}
