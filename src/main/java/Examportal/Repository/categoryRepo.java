package Examportal.Repository;

import Examportal.Entity.Exam.categories;

import java.util.Set;

public interface categoryRepo {

    categories addCategories(categories categories);

    categories updateCategories(categories categories);

    void deleteCategories(Long Id);

    Set<categories> getAllCategories();

    categories getCategoryById(Long Id);
}
