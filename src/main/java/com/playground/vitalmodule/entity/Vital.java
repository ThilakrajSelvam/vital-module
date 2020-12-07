package com.playground.vitalmodule.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Vital is a JPA Entity
 *
 * @author thilak
 * @created 12/4/20
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "vital")
public class Vital{

    @Id
    @GeneratedValue
    @Column(columnDefinition = "VARCHAR(36)")
    @Type(type = "uuid-char")
    private UUID vitalId;

    @Column(columnDefinition = "VARCHAR(36)")
    @Type(type = "uuid-char")
    private UUID userId;

    @Column(columnDefinition = "VARCHAR(36)")
    @Type(type = "uuid-char")
    private UUID patientId;

    private Integer pulse;

    private Integer systolicBp;

    private Integer diastolicBp;

    private Integer height;

    private Integer weight;

    private Double pt;

    private Double inr;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;
}
