package Examportal.Repository;

import Examportal.Entity.Exam.questions;
import Examportal.Entity.Exam.quiz;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface Questions {
    questions addQues(questions questions);
    questions updateQues(questions questions);
    void deleteQues(Long Id);
    Set<questions> getAllQues();
    questions getQuesById(Long Id);
    Set<questions> getQuestionByQuiz(quiz quiz);
}
