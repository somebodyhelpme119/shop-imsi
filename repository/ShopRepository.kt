package com.teamsparta.shoppingmalllist.shoppingmalllist.repository

import com.teamsparta.shoppingmalllist.shoppingmalllist.model.ListEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface ShopRepository : JpaRepository<ListEntity, Long>,CustomShopRepository {
// 데이터 베이스 사용은 이부분과는 관련이 없다 단 이부분에서 엔티티와 id값을 사용하여야 하기떄문에
// 데이터 베이스 (사용하는 컬럼) 부분에는 id  값을 추가해줘야한다.

    // pageable 은 페이지 처리에 필요한 정보를 전달하는 용도의 타입,
// of()함수를 이용해서 페이지 번호, 페이지 크기, 정렬방향 및 정렬 속성을 인자로 받아 PageRequest 객체가 생성됨,
//
    fun findAllByOrderByCreatedAtDesc(pageable: Pageable): Page<ListEntity>
}