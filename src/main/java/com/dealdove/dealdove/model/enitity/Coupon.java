package com.dealdove.dealdove.model.enitity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import java.time.Instant;
import java.time.ZonedDateTime;

@Getter
@Setter
@Entity
@DynamicInsert
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

    @Column(name = "creationDate", nullable = true)
    private ZonedDateTime creationDate;

    // 由于@JsonBackReference的存在，我们添加了一个新的字段来显式存储couponBaseID
    @Column(name = "couponBaseID", insertable = false, updatable = false)
    private Integer couponBaseID;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "couponBaseID", nullable = false)
    private CouponBase couponBase;


}