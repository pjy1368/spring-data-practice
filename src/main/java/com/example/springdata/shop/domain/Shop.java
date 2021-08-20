package com.example.springdata.shop.domain;

import com.example.springdata.BaseEntity;
import com.example.springdata.styler.domain.Styler;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Shop extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String branchName;

    @OneToMany(mappedBy = "shop")
    private List<Styler> stylers;

    public Shop(String name, String branchName, List<Styler> stylers) {
        this.name = name;
        this.branchName = branchName;
        this.stylers = stylers;
    }
}
