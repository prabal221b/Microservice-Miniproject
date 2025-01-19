package com.prabal.mini_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabal.mini_project.Model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
