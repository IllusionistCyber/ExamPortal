package Examportal.Repository;

import Examportal.Entity.Exam.categories;
import Examportal.Entity.Exam.quiz;

import java.util.List;
import java.util.Set;

public interface QuizRepo {
    quiz addQuiz(quiz quiz);
    quiz updateQuiz(quiz quiz);
    void deleteQuiz(Long Id);
    Set<quiz> getAllQuiz();
    quiz getQuizById(Long Id);

    List<quiz> getQuizByCategory(categories category);
    List<quiz>  getQuizByActive(boolean isActive);
    List<quiz>  getQuizByActiveAndCategory(categories Category,boolean isActive);


}
