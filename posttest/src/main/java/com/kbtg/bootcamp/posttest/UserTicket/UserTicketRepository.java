package com.kbtg.bootcamp.posttest.UserTicket;

import com.kbtg.bootcamp.posttest.Entity.UserTicket;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserTicketRepository extends JpaRepository<UserTicket, Integer> {

    @Query("SELECT ut FROM UserTicket ut INNER JOIN ut.lottery l WHERE ut.userid = :userid AND l.ticket = :ticket")
    @Transactional
    Optional<UserTicket> findByUserIdAndTicket(@Param("userid") String userId, @Param("ticket") String ticketId);

}
