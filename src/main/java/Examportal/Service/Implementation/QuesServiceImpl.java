package Examportal.Service.Implementation;

import Examportal.Entity.Exam.questions;
import Examportal.Entity.Exam.quiz;
import Examportal.Repository.Questions;
import Examportal.Service.QuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class QuesServiceImpl implements QuesService {
    @Autowired
    private Questions questions;
    @Override
    public questions addQues(questions questions) {
        return  this.questions.addQues(questions);
    }

    @Override
    public questions updateQues(questions questions) {
        return  this.questions.updateQues(questions);

    }

    @Override
    public questions getQuesById(Long Id) {
        return  this.questions.getQuesById(Id);

    }

    @Override
    public void deleteById(Long Id) {
      this.questions.deleteQues(Id);
    }

    @Override
    public Set<questions> getAllQues() {
        Set<questions> list=this.questions.getAllQues();
        return list;
    }

    @Override
    public Set<questions> getQuesByQuiz(quiz Quiz) {
        Set<questions> list= this.questions.getQuestionByQuiz(Quiz);
        return list;
    }
}
