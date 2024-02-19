package com.teamsparta.shoppingmalllist.shoppingmalllist.repository

import com.teamsparta.shoppingmalllist.shoppingmalllist.infra.QueryDslSupport
import com.teamsparta.shoppingmalllist.shoppingmalllist.model.ListEntity
import org.springframework.stereotype.Repository

@Repository
class QueryDslShopRepository: QueryDslSupport() {

    private val shop = QShop.shop

    fun searchCourseListByTitle(title: String): List<ListEntity> {
        return queryFactory.selectFrom(shop)
            .where(shop.title.containsIgnoreCase(title))
            .fetch()
    }

}