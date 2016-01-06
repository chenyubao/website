package com.website.repository;

import com.website.domain.Menu;
import com.website.domain.ProductProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chenyubao on 15/12/7.
 */
@Repository
public interface IProductProperty extends JpaRepository<ProductProperty, Long>, JpaSpecificationExecutor<ProductProperty> {
}
