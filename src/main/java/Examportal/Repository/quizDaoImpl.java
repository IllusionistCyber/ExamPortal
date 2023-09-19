package Examportal.Repository;

import Examportal.Entity.Exam.categories;
import Examportal.Entity.Exam.quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Repository
public class quizDaoImpl implements QuizRepo{

    @Autowired
    private EntityManager entityManager;
    @Override
    public quiz addQuiz(quiz quiz) {
        entityManager.persist(quiz);
        entityManager.flush();
        entityManager.clear();
        return quiz;
    }

    @Override
    public quiz updateQuiz(quiz quiz) {
        entityManager.merge(quiz);
        entityManager.flush();
        entityManager.clear();
        return quiz;
    }

    @Override
    public void deleteQuiz(Long Id) {
        CriteriaBuilder queryBuilder=entityManager.getCriteriaBuilder();
        CriteriaDelete<quiz> deleteCriteria = queryBuilder.createCriteriaDelete(quiz.class);
        Root<quiz> entityRoot=deleteCriteria.from(quiz.class);
        Predicate condition=queryBuilder.and(queryBuilder.equal(entityRoot.get("qId"),Id));
        deleteCriteria.where(condition);
        entityManager.createQuery(deleteCriteria).executeUpdate();
    }

    @Override
    public Set<quiz> getAllQuiz() {
        CriteriaBuilder queryBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<quiz> criteriaQuery = queryBuilder.createQuery(quiz.class);
        Root<quiz> entityRoot = criteriaQuery.from(quiz.class);
        return new LinkedHashSet<>(entityManager.createQuery(criteriaQuery).getResultList()) ;
    }

    @Override
    public quiz getQuizById(Long Id) {
       return entityManager.find(quiz.class,Id);
    }

    @Override
    public List<quiz> getQuizByCategory(categories category) {
        CriteriaBuilder queryBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<quiz> criteriaQuery = queryBuilder.createQuery(quiz.class);
        Root<quiz> entityRoot = criteriaQuery.from(quiz.class);
        Predicate condition = queryBuilder.and(queryBuilder.equal(entityRoot.get("category"),category));
        criteriaQuery.where(queryBuilder.and(condition));
        return (entityManager.createQuery(criteriaQuery).getResultList()) ;
    }

    @Override
    public List<quiz> getQuizByActive(boolean isActive) {
        CriteriaBuilder queryBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<quiz> criteriaQuery = queryBuilder.createQuery(quiz.class);
        Root<quiz> entityRoot = criteriaQuery.from(quiz.class);
        Predicate condition = queryBuilder.and(queryBuilder.equal(entityRoot.get("active"),isActive));
        criteriaQuery.where(queryBuilder.and(condition));
        return (entityManager.createQuery(criteriaQuery).getResultList()) ;
    }

    @Override
    public List<quiz> getQuizByActiveAndCategory(categories Category, boolean isActive) {
        CriteriaBuilder queryBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<quiz> criteriaQuery = queryBuilder.createQuery(quiz.class);
        Root<quiz> entityRoot = criteriaQuery.from(quiz.class);
        Predicate condition = queryBuilder.and(queryBuilder.equal(entityRoot.get("active"),isActive),queryBuilder.equal(entityRoot.get("category"),Category));
        criteriaQuery.where(queryBuilder.and(condition));
        return (entityManager.createQuery(criteriaQuery).getResultList()) ;
    }
}
