package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.WebReply;

@Repository
public interface ReplyRepository extends JpaRepository<WebReply, Long> {
	List<WebReply> findAllByWeblist_id(Long id);

	List<WebReply> findAllByWeblist_idAndDeleteyn(Long id, char c);
}
