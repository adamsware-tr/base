package com.adamsware.commentdto.filter;

import com.adamsware.userdto.modules.user.enums.Gender;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentDataFilter {

    private Long id;
    private Long userId;
    private Long answerId;
    private String content;
    private Long likeCount;
    private Long dislikeCount;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDateTime birthDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
