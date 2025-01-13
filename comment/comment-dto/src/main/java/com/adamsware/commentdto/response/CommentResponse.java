package com.adamsware.commentdto.response;

import com.adamsware.userdto.modules.user.dto.UserDto;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentResponse {
    private Long id;
    private Long userId;
    private Long answerId;
    private String content;
    private Long likeCount;
    private Long dislikeCount;
    private UserDto user;
}
