package Examportal.Service;

import Examportal.Entity.Exam.categories;
import Examportal.Entity.Exam.quiz;

import java.util.List;
import java.util.Set;

public interface QuizService {

    quiz addQuiz(quiz quiz);
    quiz updateQuiz(quiz categories);
    void deleteQuiz(Long Id);
    Set<quiz> getAllQuiz();
    quiz getQuizById(Long Id);
    List<quiz> getQuizOfCategory(categories category);
    List<quiz> getActiveQuiz();

    List<quiz> getQuizOfCategoryNActive(categories category);


}
