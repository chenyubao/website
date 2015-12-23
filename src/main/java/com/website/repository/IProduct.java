package com.website.repository;

import com.website.domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by chenyubao on 15/12/7.
 */
public interface IProduct extends PagingAndSortingRepository<Product, Integer> {
}
