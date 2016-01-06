package com.website.service;

import com.website.domain.Category;
import com.website.repository.ICategory;
import com.website.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.dc.pr.PRError;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by chenyubao on 16/1/6.
 */
@Service
@Transactional
public class CategoryService {

    @Autowired
    private ICategory categoryRepository;

    public List<Category> findCategoryList(int pageNo) {
        return categoryRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public Category findCategoryById(long id) {
        return categoryRepository.findOne(id);
    }

    public List<Category> findCategoryByName(final String name) {
        return categoryRepository.findAll(new Specification<Category>() {
            @Override
            public Predicate toPredicate(Root<Category> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("name").as(String.class), name);
            }
        });
    }

    public Category updateCategory(Category category) {
        if (category != null){
            return categoryRepository.save(category);
        }
        return null;
    }

    public Category deleteCategory(long id) {
        Category category = categoryRepository.findOne(id);
        if (category != null){
            categoryRepository.delete(id);
        }
        return category;
    }

    public Category addCategory(Category category) {
        if (category != null){
            return categoryRepository.save(category);
        }
        return null;
    }
}
