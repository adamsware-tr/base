package com.adamsware.likedto.dto;


@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LikeDto {

    private Long questionId;
    private Long answerId;
    private Long commentId;
    private Long userId;
    private Boolean isLike; // true: like, false: dislike
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String profileImageUrl;
}
