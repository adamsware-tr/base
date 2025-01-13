package com.adamsware.commentdto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentRequest {

    @NotNull
    private Long postId;

    @NotBlank
    private String content;

    @NotNull
    private Boolean isAnonymous;
}
