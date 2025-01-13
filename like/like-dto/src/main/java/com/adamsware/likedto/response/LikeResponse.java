package com.adamsware.likedto.response;


import com.adamsware.dto.user.UserDto;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LikeResponse {

    private Long postId;
    private Long userId;
    private UserDto user;
}
