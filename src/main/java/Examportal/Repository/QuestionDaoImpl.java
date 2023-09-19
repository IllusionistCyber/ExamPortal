package Examportal.Repository;

import Examportal.Entity.Exam.questions;
import Examportal.Entity.Exam.quiz;
import Examportal.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Repository

public class QuestionDaoImpl implements Questions{

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private QuizService quizService;
    @Override
    public questions addQues(questions ques) {
        entityManager.persist(ques);
        entityManager.flush();
        entityManager.clear();
        return ques;
    }

    @Override
    public questions updateQues(questions ques) {
        entityManager.merge(ques);
        entityManager.flush();
        entityManager.clear();
        return ques;
    }

    @Override
    public void deleteQues(Long Id) {
        CriteriaBuilder queryBuilder=entityManager.getCriteriaBuilder();
        CriteriaDelete<questions> deleteCriteria = queryBuilder.createCriteriaDelete(questions.class);
        Root<questions> entityRoot=deleteCriteria.from(questions.class);
        Predicate condition=queryBuilder.and(queryBuilder.equal(entityRoot.get("quesId"),Id));
        deleteCriteria.where(condition);
        entityManager.createQuery(deleteCriteria).executeUpdate();
    }

    @Override
    public Set<questions> getAllQues() {
        CriteriaBuilder queryBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<questions> criteriaQuery = queryBuilder.createQuery(questions.class);
        Root<questions> entityRoot = criteriaQuery.from(questions.class);
        return new LinkedHashSet<>(entityManager.createQuery(criteriaQuery).getResultList()) ;
    }

    @Override
    public questions getQuesById(Long Id) {
        return entityManager.find(questions.class,Id);
    }

    @Override
    public Set<questions> getQuestionByQuiz(quiz quiz) {
       quiz Quiz=this.quizService.getQuizById(quiz.getQId());
       Set<questions>listOfQuestions=Quiz.getQuestions();
       return  listOfQuestions;
    }
}
