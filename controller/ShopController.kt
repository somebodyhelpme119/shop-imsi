package com.teamsparta.shoppingmalllist.shoppingmalllist.controller


import com.teamsparta.shoppingmalllist.shoppingmalllist.dto.response.ShopListResponse
import com.teamsparta.shoppingmalllist.shoppingmalllist.service.ShopService
import org.springframework.data.domain.Page
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/storelist")
@RestController
class ShopController(
    private val shopService: ShopService
) {
    @GetMapping()
    fun getShopList(): ResponseEntity<Page<ShopListResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(shopService.getAllShopList())


    }
}