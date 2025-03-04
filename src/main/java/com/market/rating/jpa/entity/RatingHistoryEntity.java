package com.market.rating.jpa.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "rating_history")
@Schema(description = "Historical ratings and feedback for products")
public class RatingHistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Schema(description = "Unique identifier for the rating record")
    private Long id;

    @Column(name = "product_id", nullable = false)
    @Schema(description = "Identifier of the rated product")
    private Long productId;

    @Column(name = "rating", nullable = false)
    @Schema(description = "Rating value (must be between 1 and 5)")
    private Integer rating;

    @Column(name = "feedback", columnDefinition = "TEXT")
    @Schema(description = "Optional user feedback")
    private String feedback;

    @Column(name = "creation_date", nullable = false, updatable = false)
    @Schema(description = "Date of the rating submission")
    private LocalDateTime creationDate = LocalDateTime.now();
}