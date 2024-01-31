package com.dealdove.dealdove.model.enitity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
@Table(name = "coupon", schema = "dealdove")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "couponID", nullable = false)
    private Integer couponID;

    @Column(name = "ownerID", nullable = false)
    private String ownerID;

    @Column(name = "isUsed", nullable = false)
    private Byte isUsed;

    @Column(name = "expirationDate", nullable = false)
    private Instant expirationDate;

    @Column(name = "creationDate", nullable = false)
    private ZonedDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "couponBaseID", nullable = false)
    private CouponBase couponBase;

}