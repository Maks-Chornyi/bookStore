package com.ajax.lv350.repository;

import com.ajax.lv350.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReposiroty extends JpaRepository<Book,Integer> {
}
