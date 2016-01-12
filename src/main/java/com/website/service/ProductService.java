package com.website.service;

import com.website.domain.Product;
import com.website.repository.IProduct;
import com.website.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
public class ProductService {

    @Autowired
    private IProduct productRepository;

    @PersistenceContext
    private EntityManager em;

    public List<Product> findProductListByPage(int pageNo) {
        return productRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public List<Product> findProductListByCategoryId(final long categoryId, int pageNo) {
        return productRepository.findAll(new Specification<Product>() {
            @Override
            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("categoryId").as(Long.class), categoryId);
            }
        }, new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public List<Product> findProductListByCategoryName(String name, int pageNo) {
        String hql = "select p from Product p where p.category.name like :name";
        Query query = em.createQuery(hql);
        query.setParameter("name", "'%"+name+"%'");
        query.setFirstResult(pageNo * Constant.PAGE_SIZE);
        query.setMaxResults(Constant.PAGE_SIZE);
        return query.getResultList();
    }

    public Product findProductById(long id, int pageNo) {
        return productRepository.findOne(id);
    }

    public List<Product> findProductsByName(final String name, int pageNo) {
        return productRepository.findAll(new Specification<Product>() {
            @Override
            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("name").as(String.class), name);
            }
        }, new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public List<Product> findProductsByDesc(final String desc, int pageNo) {
        return productRepository.findAll(new Specification<Product>() {
            @Override
            public Predicate toPredicate(Root<Product> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("description").as(String.class), desc);
            }
        }, new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public Product addProduct(Product product) {
        if (product != null){
            return productRepository.save(product);
        }
        return null;
    }

    public Product updateProduct(Product product) {
        if (product != null){
            return productRepository.save(product);
        }
        return null;
    }

    public Product deleteProduct(long id) {
        Product p = productRepository.findOne(id);
        productRepository.delete(id);
        return p;
    }

    public long getTotalPage() {
        return productRepository.count()/Constant.PAGE_SIZE + 1;
    }
}
