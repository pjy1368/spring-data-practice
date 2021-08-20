package com.example.springdata.shop.controller;

import com.example.springdata.shop.dto.RegisterShopRequest;
import com.example.springdata.shop.dto.ShowShopResponse;
import com.example.springdata.shop.service.ShopService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/shops")
public class ShopController {

    private final ShopService shopServices;

    @GetMapping
    public ResponseEntity<List<ShowShopResponse>> showAllShops() {
        return ResponseEntity.ok(shopServices.showAllShops());
    }

    @GetMapping
    public ResponseEntity<ShowShopResponse> showShopById(@PathVariable Long id) {
        return ResponseEntity.ok(shopServices.showShopById(id));
    }

    @PostMapping
    public ResponseEntity<Void> registerShop(RegisterShopRequest request) {
        shopServices.registerShop(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
