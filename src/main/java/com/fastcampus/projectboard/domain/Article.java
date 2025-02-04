package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;
import java.util.Date;

public class Article {
    private Long id;
    private String title;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

}
