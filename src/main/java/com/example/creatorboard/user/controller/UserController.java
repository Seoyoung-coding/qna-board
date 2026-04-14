package com.example.creatorboard.user.controller;

import com.example.creatorboard.common.ApiResponse;
import com.example.creatorboard.user.dto.response.UserProfileResponse;
import com.example.creatorboard.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

//    // view my profile
//    @GetMapping("/me")
//    public ApiResponse<UserProfileResponse> getMyProfile(@AuthenticationPrincipal PrincipalDetails userDetails{
//        UserProfileResponse response = userService.getMyProfile(userDetails.getUsername());
//        log.info("creator id : " + response.getCreatorId());
//        return ApiResponse.success("Profile Reviewd", response);
//    }
}
