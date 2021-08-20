package com.example.springdata.shop.repository;

import com.example.springdata.shop.domain.Shop;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface ShopRepository extends JpaRepository<Shop, Long> {

    @RestResource(path = "name")
    List<Shop> findAllByName(@Param("name") String name);

    @RestResource(path = "branchName")
    List<Shop> findAllByBranchName(@Param("branchName") String branchName);
}
