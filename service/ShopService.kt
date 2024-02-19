package com.teamsparta.shoppingmalllist.shoppingmalllist.service

import com.teamsparta.shoppingmalllist.shoppingmalllist.dto.response.ShopListResponse
import com.teamsparta.shoppingmalllist.shoppingmalllist.model.ListEntity
import org.springframework.data.domain.Page


interface ShopService {
    fun getAllShopList(): Page<ShopListResponse>

    // 단건 조회가아닌
// 사이트운영중단, 휴업중, 광고용(홍보용), 등록정보불일치, 사이트폐쇄, 영업중, 확인안됨 상태 중 1개를 선택하여 해당 업체 리스트만 조회
    //는 어떻게 만들어야 하는지 모름.
}