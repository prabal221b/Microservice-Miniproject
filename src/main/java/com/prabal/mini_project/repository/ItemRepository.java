package com.prabal.mini_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabal.mini_project.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
