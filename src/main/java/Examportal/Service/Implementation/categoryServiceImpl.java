package Examportal.Service.Implementation;

import Examportal.Entity.Exam.categories;
import Examportal.Repository.categoryRepo;
import Examportal.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class categoryServiceImpl implements CategoryService {

    @Autowired
    private categoryRepo categoriesDaoImpl;

    @Override
    public categories addCategory(categories categories) {
        return categoriesDaoImpl.addCategories(categories);
    }

    @Override
    public categories updateCategories(categories categories) {
        return categoriesDaoImpl.updateCategories(categories);
    }

    @Override
    public categories getCategoryById(Long Id) {
        return categoriesDaoImpl.getCategoryById(Id);
    }

    @Override
    public void deleteById(Long Id) {
      this.categoriesDaoImpl.deleteCategories(Id);
    }

    @Override
    public Set<categories> getAll() {
        Set<categories> list=this.categoriesDaoImpl.getAllCategories();
        return list;
    }
}
