package com.teamsparta.shoppingmalllist.shoppingmalllist.dto.response

import com.teamsparta.shoppingmalllist.shoppingmalllist.model.ListEntity

data class ShopListResponse(shop: ListEntity)
{
    val score: String = shop.score
    val monitoringDate: String = shop.monitoringDate
    val state: String=shop.state
}
// 페이지 네이션을 위해 전체 조회 리스폰스를 따로 만들어 주었다.
// 전체 조회 조건이 무엇무엇이 들어가는지 있어야 페이지 네이션을 개발할 수 있다