package com.website.repository;

import com.website.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenyubao on 15/12/7.
 */
@Repository
public interface IProduct extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
