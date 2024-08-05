package com.hexcode.pro_clock_out.wolibal.repository;

import com.hexcode.pro_clock_out.member.domain.Member;
import com.hexcode.pro_clock_out.wolibal.domain.Wolibal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

public interface WolibalRepository extends JpaRepository<Wolibal, Long> {
    Optional<Wolibal> findByMember(Member member);

    Optional<Wolibal> findByDateAndMember(LocalDate date, Member member);


    @Query("SELECT COUNT(w) FROM Wolibal w WHERE w.score > :score")
    long countByTotalHigherThan(@Param("score") int score);

    @Query("SELECT AVG(w.score) FROM Wolibal w")
    int getAverageTotal();
}
