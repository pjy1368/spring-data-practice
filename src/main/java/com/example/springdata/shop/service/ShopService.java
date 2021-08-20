package com.example.springdata.shop.service;

import com.example.springdata.shop.domain.Shop;
import com.example.springdata.shop.dto.RegisterShopRequest;
import com.example.springdata.shop.dto.ShowShopResponse;
import com.example.springdata.shop.repository.ShopRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final ShopRepository shopRepository;

    public List<ShowShopResponse> showAllShops() {
        return shopRepository.findAll().stream()
            .map(ShowShopResponse::of)
            .collect(Collectors.toList());
    }

    public ShowShopResponse showShopById(Long id) {
        Shop shop = shopRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        return ShowShopResponse.of(shop);
    }

    public List<ShowShopResponse> showShopByName(String name) {
        return shopRepository.findAllByName(name).stream()
            .map(ShowShopResponse::of)
            .collect(Collectors.toList());
    }

    public List<ShowShopResponse> showShopByBranchName(String branchName) {
        return shopRepository.findAllByBranchName(branchName).stream()
            .map(ShowShopResponse::of)
            .collect(Collectors.toList());
    }


    public void registerShop(RegisterShopRequest request) {
        shopRepository.save(request.toEntity());
    }
}
