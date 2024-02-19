package com.teamsparta.shoppingmalllist.shoppingmalllist.infra

import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext

abstract class QueryDslSupport {
    @PersistenceContext
    protected lateinit var entityManager: EntityManager

    protected val queryFactory: JPAQueryFactory
        get() {
            return JPAQueryFactory(entityManager)
        }
}
// dsl 을 쓰기위한 밑밥