package com.prabal.mini_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prabal.mini_project.entities.Item;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
//    List<Item> findByItemPrice(int priceValue);
}
