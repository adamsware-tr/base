package com.adamsware.likedto.request;


import com.adamsware.likedto.enums.PostType;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LikeRequest {

    @NotNull
    private Long postId;

    @NotNull
    private PostType postType;
}
