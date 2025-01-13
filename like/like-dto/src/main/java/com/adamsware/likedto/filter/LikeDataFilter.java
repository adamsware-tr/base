package com.adamsware.likedto.filter;

import com.adamsware.dto.enums.PostType;
import com.adamsware.dto.enums.Status;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LikeDataFilter {

    private Long id;
    private Long postId;
    private PostType postType;
    private Long userId;
    private Status status;
    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
