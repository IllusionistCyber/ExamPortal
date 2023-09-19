package Examportal.Service.Implementation;

import Examportal.Entity.Exam.categories;
import Examportal.Entity.Exam.quiz;
import Examportal.Repository.QuizRepo;
import Examportal.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepo quizRepo;
    @Override
    public quiz addQuiz(quiz quiz) {
        return quizRepo.addQuiz(quiz);
    }

    @Override
    public quiz updateQuiz(quiz quiz) {
        return quizRepo.updateQuiz(quiz);
    }

    @Override
    public void deleteQuiz(Long Id) {
     this.quizRepo.deleteQuiz(Id);
    }

    @Override
    public Set<quiz> getAllQuiz() {
        Set<quiz> list=this.quizRepo.getAllQuiz();
        return list;
    }

    @Override
    public quiz getQuizById(Long Id) {
        return this.quizRepo.getQuizById(Id);
    }

    @Override
    public List<quiz> getQuizOfCategory(categories category) {
        return quizRepo.getQuizByCategory(category);
    }

    @Override
    public List<quiz> getActiveQuiz() {
        return quizRepo.getQuizByActive(true);
    }
    @Override
    public List<quiz> getQuizOfCategoryNActive(categories category) {
        return quizRepo.getQuizByActiveAndCategory(category,true);
    }
}
