package com.club.backend.repository.join;

import com.club.backend.entity.join.Term;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermRepository extends JpaRepository<Term, Integer> {
}
