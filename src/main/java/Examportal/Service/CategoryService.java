package Examportal.Service;

import Examportal.Entity.Exam.categories;

import java.util.Set;

public interface CategoryService {

    public categories  addCategory(categories categories);

    public categories updateCategories(categories categories);

    public categories getCategoryById(Long Id);

    public void deleteById(Long Id);

    public Set<categories> getAll();

}
