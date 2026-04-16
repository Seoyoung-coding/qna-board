package com.example.creatorboard.user.repository;

import com.example.creatorboard.content.domain.Content;
import com.example.creatorboard.user.enums.ContentStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import java.awt.print.Pageable;
import java.util.Optional;

public interface ContentRepository extends JpaRepository<Content, Long> {
    Optional<Content> findByIdAndContentStatus(Long id, ContentStatus status);
    Page<Content> findAllByContentStatus(ContentStatus status, Pageable pageable);
}