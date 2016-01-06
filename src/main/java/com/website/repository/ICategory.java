package com.website.repository;

import com.website.domain.AttractInvestment;
import com.website.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chenyubao on 15/12/7.
 */
@Repository
public interface ICategory extends JpaRepository<Category, Long>, JpaSpecificationExecutor<Category> {
}
