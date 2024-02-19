package com.teamsparta.shoppingmalllist.shoppingmalllist.model

import com.teamsparta.shoppingmalllist.shoppingmalllist.dto.response.ShopResponse
import jakarta.persistence.*
import org.springframework.data.jpa.domain.AbstractPersistable_.id


@Entity
@Table(name = "shop")
 class ListEntity(


    @Column(name = "store_score")
    val score : String,

    @Column(name = "monitoring_date")
    val monitoringDate: String,

    @Column(name = "store_state")
    var state : String
// 이건 왜이넘으로 쓰는지 잘 모름.
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}

fun ListEntity.toResponse(): ShopResponse {
    return ShopResponse(
        score = score,
        monitoringDate = monitoringDate,
        state = state,

    )
    // 리스폰스에 무엇이 들어가는 잘몰름.
}





