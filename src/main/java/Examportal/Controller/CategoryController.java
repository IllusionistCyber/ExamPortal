package Examportal.Controller;

import Examportal.Entity.Exam.categories;
import Examportal.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Set;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
@Transactional
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @CrossOrigin("*")
    @PostMapping("/addCategory")
    public ResponseEntity<?> addCategory(@RequestBody categories Category){
      categories category=  this.categoryService.addCategory(Category);
      return ResponseEntity.ok(category);
    }

    @GetMapping("/{categoryId}")
    @CrossOrigin("*")
    public ResponseEntity<?> getCategoryById(@PathVariable("categoryId") Long Id){
        categories category=  this.categoryService.getCategoryById(Id);
        return ResponseEntity.ok(category);
    }
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") Long Id){
       this.categoryService.deleteById(Id);
    }
    @GetMapping("/getAllCategory")
    public ResponseEntity<?> getAllCategories(){
        Set<categories> category=  this.categoryService.getAll();
        return ResponseEntity.ok(category);
    }

    @PutMapping("/upDateCategory/{Id}")
    @CrossOrigin("*")
    public ResponseEntity<?> updateCategory(@RequestBody categories Category) {
        categories category = this.categoryService.updateCategories(Category);
        return ResponseEntity.ok(category);
    }

}
