package com.teamsparta.shoppingmalllist.shoppingmalllist.service

import com.teamsparta.shoppingmalllist.shoppingmalllist.dto.response.ShopListResponse
import com.teamsparta.shoppingmalllist.shoppingmalllist.repository.ShopRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class ShopServiceImpl(
    private val shopRepository: ShopRepository
): ShopService {
    // 단일 페이지 1번 페이지의 데이터 개수를 5개로 제한, 최신 등록한 글이 먼저 오도록  내림차순
    override fun getAllShopList(): Page<ShopListResponse> {
        val pageable: Pageable = PageRequest.of(0, 5, Sort.by(Sort.Direction.DESC, ""))
        return shopRepository.findAllByOrderByCreatedAtDesc(pageable).map {ShopListResponse(it)
// properties에는 임의의 값을 넣어줘야함 예>> id를 넣으면 id 별로 내림차순을 하게됨.
    }
}}