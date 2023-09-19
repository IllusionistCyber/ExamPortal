package Examportal.Controller;

import Examportal.Entity.Exam.categories;
import Examportal.Entity.Exam.quiz;
import Examportal.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
@Transactional
public class QuizController {

    @Autowired
    private QuizService quizService;


    @PostMapping("/")
    public ResponseEntity<?> addQuiz(@RequestBody quiz quiz){
        quiz Quiz=  this.quizService.addQuiz(quiz);
        return ResponseEntity.ok(Quiz);
    }

    @GetMapping("/{quizId}")
    public ResponseEntity<?> getQuizById(@PathVariable("quizId") Long Id){
        quiz Quiz=  this.quizService.getQuizById(Id);
        return ResponseEntity.ok(Quiz);
    }
    @DeleteMapping("/{quizId}")
    public void deleteQuiz(@PathVariable("quizId") Long Id){
        this.quizService.deleteQuiz(Id);
    }
    @GetMapping("/getAllQuiz")
    public ResponseEntity<?> getAllQuizes(){
        Set<quiz> Quiz=  this.quizService.getAllQuiz();
        return ResponseEntity.ok(Quiz);
    }

    @PutMapping("/updateQuiz/{Id}")
    @CrossOrigin("*")
    public ResponseEntity<?> updateQuiz(@RequestBody quiz quiz){
        quiz Quiz=  this.quizService.updateQuiz(quiz);
        return ResponseEntity.ok(quiz);
    }

    @GetMapping("/category/active/{cid}")
    @CrossOrigin("*")
    public ResponseEntity<?> getQuizByCategoryNActive(@PathVariable("cid") Long cId){
        categories Category=new categories();
        Category.setCid(cId);
        List<quiz> Quiz=  this.quizService.getQuizOfCategoryNActive(Category);
        return ResponseEntity.ok(Quiz);
    }

    @GetMapping("/active")
    @CrossOrigin("*")
    public ResponseEntity<?> getActiveQuiz(){
        List<quiz> Quiz=  this.quizService.getActiveQuiz();
        return ResponseEntity.ok(Quiz);
    }

    @GetMapping("/getQuizByCatId/{cid}")
    @CrossOrigin("*")
    public ResponseEntity<?> getQuizByCategory(@PathVariable("cid") Long cId){
        categories Category=new categories();
        Category.setCid(cId);
        List<quiz> Quiz=  this.quizService.getQuizOfCategory(Category);
        return ResponseEntity.ok(Quiz);
    }

}
