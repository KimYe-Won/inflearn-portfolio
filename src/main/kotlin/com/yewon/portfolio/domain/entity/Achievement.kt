package com.yewon.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Achievement(
        title: String,
        description: String,
        achievedDate: LocalDate?,
        host: String,
        isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null

    var title: String = title

    var description: String = description

    var achievedDate: LocatDate? = achievedDate

    var host: String = host

    var isActive: Boolean = isActive

}