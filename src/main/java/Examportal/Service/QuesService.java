package Examportal.Service;

import Examportal.Entity.Exam.categories;
import Examportal.Entity.Exam.questions;
import Examportal.Entity.Exam.quiz;

import java.util.Set;

public interface QuesService {

    public questions addQues(questions questions);

    public questions updateQues(questions questions);

    public questions getQuesById(Long Id);

    public void deleteById(Long Id);

    public Set<questions> getAllQues();

    public Set<questions> getQuesByQuiz(quiz Quiz);
}
