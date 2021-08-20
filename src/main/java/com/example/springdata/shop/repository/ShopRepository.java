package com.example.springdata.shop.repository;

import com.example.springdata.shop.domain.Shop;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {

    List<Shop> findAllByName(String name);

    List<Shop> findAllByBranchName(String branchName);
}
