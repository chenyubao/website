package com.website.service;

import com.website.domain.Category;
import com.website.domain.Menu;
import com.website.repository.ICategory;
import com.website.repository.IMenu;
import com.website.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
public class MenuService {

    @Autowired
    private IMenu menuRepository;

    public List<Menu> findMenuList(int pageNo) {
        return menuRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public Menu findMenuById(long id) {
        return menuRepository.findOne(id);
    }

    public List<Menu> findMenuByName(final String name) {
        return menuRepository.findAll(new Specification<Menu>() {
            @Override
            public Predicate toPredicate(Root<Menu> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("name").as(String.class), name);
            }
        });
    }

    public Menu updateMenu(Menu menu) {
        if (menu != null){
            return menuRepository.save(menu);
        }
        return null;
    }

    public Menu deleteMenu(long id) {
        Menu menu = menuRepository.findOne(id);
        if (menu != null){
            menuRepository.delete(id);
        }
        return menu;
    }

    public Menu addMenu(Menu menu) {
        if (menu != null){
            return menuRepository.save(menu);
        }
        return null;
    }
}
