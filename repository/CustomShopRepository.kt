package com.teamsparta.shoppingmalllist.shoppingmalllist.repository

import com.teamsparta.shoppingmalllist.shoppingmalllist.model.ListEntity

interface CustomShopRepository {

    fun searchShopListByTitle(title: String): List<ListEntity>

}