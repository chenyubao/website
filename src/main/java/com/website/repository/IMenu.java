package com.website.repository;

import com.website.domain.Menu;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by chenyubao on 15/12/7.
 */
public interface IMenu extends PagingAndSortingRepository<Menu, Integer> {
}
