package com.adamsware.commentdto.dto;

import com.adamsware.userdto.modules.user.dto.BasicUserDto;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BasicCommentDto {
    private Long id;
    private String content;
    private Boolean isAnonymous;
    private BasicUserDto user;
    private Long totalLikeCount;
}
