package com.example.creatorboard.content.service;

import com.example.creatorboard.content.domain.Content;
import com.example.creatorboard.user.dto.request.ContentCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContentService {
    public Long createContent(Long userId, ContentCreateRequest req) {

        Content content = Content.builder()
                .title(req.getTitle())
                .content(req.getContent())
                .price(req.getPrice())
                .discountRate(req.getDiscountRate())
                .isFree(req.isFree())
                .creator(creator)
                .build();

        Content saved = contentRepository.save(content);
    }
}