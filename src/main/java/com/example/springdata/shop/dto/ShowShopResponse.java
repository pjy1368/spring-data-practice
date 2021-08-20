package com.example.springdata.shop.dto;

import com.example.springdata.shop.domain.Shop;
import com.example.springdata.styler.domain.Styler;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ShowShopResponse {

    private Long id;

    private String name;

    private String branchName;

    private List<Styler> stylers;

    public static ShowShopResponse of(Shop shop) {
        return new ShowShopResponse(shop.getId(), shop.getName(), shop.getBranchName(), shop.getStylers());
    }
}
