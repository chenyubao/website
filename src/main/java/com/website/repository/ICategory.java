package com.website.repository;

import com.website.domain.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by chenyubao on 15/12/7.
 */
public interface ICategory extends PagingAndSortingRepository<Category, Integer> {
}
