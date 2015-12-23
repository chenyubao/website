package com.website.repository;

import com.website.domain.ProductProperty;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by chenyubao on 15/12/7.
 */
public interface IProductProperty extends PagingAndSortingRepository<ProductProperty, Integer> {
}
