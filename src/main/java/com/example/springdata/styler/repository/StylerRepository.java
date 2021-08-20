package com.example.springdata.styler.repository;

import com.example.springdata.styler.domain.Styler;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface StylerRepository extends JpaRepository<Styler, Long> {

    @RestResource(path = "name")
    List<Styler> findAllByName(@Param("name") String name);
}
