package com.market.rating.jpa.repository;

import com.market.rating.jpa.entity.RatingHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingHistoryRepository extends JpaRepository<RatingHistoryEntity, Long> {

}
