package Examportal.Controller;

import Examportal.Entity.Exam.questions;
import Examportal.Entity.Exam.quiz;
import Examportal.Service.QuesService;
import Examportal.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.*;

@RestController
@RequestMapping("/question")
@CrossOrigin("*")
@Transactional
public class QuestionController {

    @Autowired
    private QuesService quesService;
    @Autowired
    private QuizService quizService;
    @PostMapping("/add")
    @CrossOrigin("*")
    public ResponseEntity<?> addQues(@RequestBody questions ques){
        questions Ques=  this.quesService.addQues(ques);
        return ResponseEntity.ok(Ques);
    }
    @GetMapping("/getAllQues")
    public ResponseEntity<?> getAllQues(){
        Set<questions> Ques=  this.quesService.getAllQues();
        return ResponseEntity.ok(Ques);
    }

    @PutMapping("/updateQues")
    @CrossOrigin("*")
    public ResponseEntity<?> updateQues(@RequestBody questions ques){
        questions Ques=  this.quesService.updateQues(ques);
        return ResponseEntity.ok(Ques);
    }

    //get All Ques oF Any Quiz
    @GetMapping("/quiz/{qid}")
    @CrossOrigin("*")
    public  ResponseEntity<?> getQuestionOfQuiz(@PathVariable("qid") Long Id){
         quiz Quiz=this.quizService.getQuizById(Id);
         Set<questions> Questions=Quiz.getQuestions();
        List list=new ArrayList(Questions);
        if(list.size()>Quiz.getNoOfQuestions()){
            list=list.subList(0,Quiz.getNoOfQuestions()+1);
        }
        Collections.shuffle(list);
        return ResponseEntity.ok(list);
    }

    //get Single question
    @GetMapping("/{quesId}")
    public questions getQuestionById(@PathVariable("quesId")Long Id) {
      return this.quesService.getQuesById(Id);
    }

    @DeleteMapping("/{quesId}")
    public void deleteQuesById(@PathVariable("quesId")Long Id){
        this.quesService.deleteById(Id);
    }
}
