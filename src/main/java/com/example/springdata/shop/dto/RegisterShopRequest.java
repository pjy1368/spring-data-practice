package com.example.springdata.shop.dto;

import com.example.springdata.shop.domain.Shop;
import com.example.springdata.styler.domain.Styler;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RegisterShopRequest {

    private String name;

    private String branchName;

    private List<Styler> stylers;

    public Shop toEntity() {
        return new Shop(name, branchName, stylers);
    }
}
