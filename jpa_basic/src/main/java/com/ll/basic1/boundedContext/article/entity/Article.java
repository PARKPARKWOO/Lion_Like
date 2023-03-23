package com.ll.basic1.boundedContext.article.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Builder
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private long id;

    @CreatedDate
    private LocalDateTime localDateTime; // 데이터 생성 날짜
    @LastModifiedDate
    private LocalDateTime upDateTime; // 수정 날짜
    private String title;
    private String body;

}
